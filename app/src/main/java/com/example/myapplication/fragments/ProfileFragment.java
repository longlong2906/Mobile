package com.example.myapplication.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.LoginActivity;
import com.example.myapplication.R;
import com.example.myapplication.adapters.RecommendedMajorAdapter;
import com.example.myapplication.data.MajorData;
import com.example.myapplication.models.Major;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileFragment extends Fragment {

    private TextView tvFullName, tvEmail, tvHollandType, tvRecommendedTitle;
    private ImageButton btnEditName;
    private MaterialButton btnLogout, btnChangePassword;
    private RecyclerView rvRecommendedMajors;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private ProgressDialog progressDialog;
    private String currentFullName = "";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        initViews(view);
        loadUserData();
        setClickListeners();

        return view;
    }

    private void initViews(View view) {
        tvFullName = view.findViewById(R.id.tvFullName);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvHollandType = view.findViewById(R.id.tvHollandType);
        tvRecommendedTitle = view.findViewById(R.id.tvRecommendedTitle);
        rvRecommendedMajors = view.findViewById(R.id.rvRecommendedMajors);
        btnEditName = view.findViewById(R.id.btnEditName);
        btnChangePassword = view.findViewById(R.id.btnChangePassword);
        btnLogout = view.findViewById(R.id.btnLogout);

        // Setup RecyclerView
        rvRecommendedMajors.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void loadUserData() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            // Display email from Auth
            tvEmail.setText(currentUser.getEmail());

            // Load user data from Firestore
            db.collection("users").document(currentUser.getUid())
                    .get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                            String fullName = documentSnapshot.getString("fullName");
                            String hollandType = documentSnapshot.getString("hollandType");
                            String hollandCode = documentSnapshot.getString("hollandCode");

                            currentFullName = fullName != null ? fullName : "";
                            tvFullName.setText(currentFullName.isEmpty() ? "N/A" : currentFullName);
                            
                            if (hollandType != null && !hollandType.isEmpty()) {
                                tvHollandType.setText("Nhóm nghề: " + hollandType);
                                
                                // Load and display recommended majors
                                if (hollandCode != null && !hollandCode.isEmpty()) {
                                    loadRecommendedMajors(hollandCode);
                                }
                            } else {
                                tvHollandType.setText(getString(R.string.profile_no_test));
                                tvRecommendedTitle.setVisibility(View.GONE);
                                rvRecommendedMajors.setVisibility(View.GONE);
                            }
                        }
                    })
                    .addOnFailureListener(e -> {
                        tvFullName.setText("Error loading data");
                    });
        }
    }

    private void setClickListeners() {
        btnEditName.setOnClickListener(v -> showEditNameDialog());
        btnChangePassword.setOnClickListener(v -> showChangePasswordDialog());
        btnLogout.setOnClickListener(v -> showLogoutConfirmDialog());
    }

    private void loadRecommendedMajors(String hollandCode) {
        List<Major> recommendedMajors = MajorData.getMajorsByHollandType(hollandCode);
        
        if (recommendedMajors != null && !recommendedMajors.isEmpty()) {
            tvRecommendedTitle.setVisibility(View.VISIBLE);
            rvRecommendedMajors.setVisibility(View.VISIBLE);
            
            RecommendedMajorAdapter adapter = new RecommendedMajorAdapter(getContext(), recommendedMajors);
            rvRecommendedMajors.setAdapter(adapter);
        } else {
            tvRecommendedTitle.setVisibility(View.GONE);
            rvRecommendedMajors.setVisibility(View.GONE);
        }
    }

    /**
     * Hiển thị dialog chỉnh sửa họ và tên
     */
    private void showEditNameDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_edit_name, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();
        dialog.show();

        TextInputEditText etNewName = dialogView.findViewById(R.id.etNewName);
        MaterialButton btnCancelName = dialogView.findViewById(R.id.btnCancelName);
        MaterialButton btnSaveName = dialogView.findViewById(R.id.btnSaveName);

        // Pre-fill với tên hiện tại
        etNewName.setText(currentFullName);

        btnCancelName.setOnClickListener(v -> dialog.dismiss());

        btnSaveName.setOnClickListener(v -> {
            String newName = etNewName.getText().toString().trim();

            // Validate input
            if (TextUtils.isEmpty(newName)) {
                etNewName.setError("Vui lòng nhập họ và tên");
                etNewName.requestFocus();
                return;
            }

            if (newName.length() < 2) {
                etNewName.setError("Tên phải có ít nhất 2 ký tự");
                etNewName.requestFocus();
                return;
            }

            // Update in Firestore
            updateUserName(newName, dialog);
        });
    }

    /**
     * Cập nhật họ và tên trong Firestore
     */
    private void updateUserName(String newName, AlertDialog dialog) {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {
            Toast.makeText(getContext(), "Lỗi: Không tìm thấy người dùng", Toast.LENGTH_SHORT).show();
            return;
        }

        showLoading("Đang cập nhật...");

        Map<String, Object> updates = new HashMap<>();
        updates.put("fullName", newName);

        db.collection("users").document(currentUser.getUid())
                .update(updates)
                .addOnSuccessListener(aVoid -> {
                    hideLoading();
                    currentFullName = newName;
                    tvFullName.setText(newName);
                    Toast.makeText(getContext(), "Cập nhật thành công!", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                })
                .addOnFailureListener(e -> {
                    hideLoading();
                    Toast.makeText(getContext(), "Lỗi: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    /**
     * Hiển thị dialog đổi mật khẩu
     */
    private void showChangePasswordDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        View dialogView = getLayoutInflater().inflate(R.layout.dialog_change_password, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();
        dialog.show();

        TextInputEditText etCurrentPassword = dialogView.findViewById(R.id.etCurrentPassword);
        TextInputEditText etNewPassword = dialogView.findViewById(R.id.etNewPassword);
        TextInputEditText etConfirmPassword = dialogView.findViewById(R.id.etConfirmPassword);
        MaterialButton btnCancelPassword = dialogView.findViewById(R.id.btnCancelPassword);
        MaterialButton btnSavePassword = dialogView.findViewById(R.id.btnSavePassword);

        btnCancelPassword.setOnClickListener(v -> dialog.dismiss());

        btnSavePassword.setOnClickListener(v -> {
            String currentPassword = etCurrentPassword.getText().toString().trim();
            String newPassword = etNewPassword.getText().toString().trim();
            String confirmPassword = etConfirmPassword.getText().toString().trim();

            // Validate inputs
            if (TextUtils.isEmpty(currentPassword)) {
                etCurrentPassword.setError("Vui lòng nhập mật khẩu hiện tại");
                etCurrentPassword.requestFocus();
                return;
            }

            if (TextUtils.isEmpty(newPassword)) {
                etNewPassword.setError("Vui lòng nhập mật khẩu mới");
                etNewPassword.requestFocus();
                return;
            }

            if (newPassword.length() < 6) {
                etNewPassword.setError("Mật khẩu phải có ít nhất 6 ký tự");
                etNewPassword.requestFocus();
                return;
            }

            if (TextUtils.isEmpty(confirmPassword)) {
                etConfirmPassword.setError("Vui lòng xác nhận mật khẩu mới");
                etConfirmPassword.requestFocus();
                return;
            }

            if (!newPassword.equals(confirmPassword)) {
                etConfirmPassword.setError("Mật khẩu xác nhận không khớp");
                etConfirmPassword.requestFocus();
                return;
            }

            if (currentPassword.equals(newPassword)) {
                etNewPassword.setError("Mật khẩu mới phải khác mật khẩu hiện tại");
                etNewPassword.requestFocus();
                return;
            }

            // Change password
            changePassword(currentPassword, newPassword, dialog);
        });
    }

    /**
     * Thực hiện đổi mật khẩu
     */
    private void changePassword(String currentPassword, String newPassword, AlertDialog dialog) {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null || currentUser.getEmail() == null) {
            Toast.makeText(getContext(), "Lỗi: Không tìm thấy người dùng", Toast.LENGTH_SHORT).show();
            return;
        }

        showLoading("Đang đổi mật khẩu...");

        // Re-authenticate user trước khi đổi password
        AuthCredential credential = EmailAuthProvider.getCredential(
                currentUser.getEmail(), 
                currentPassword
        );

        currentUser.reauthenticate(credential)
                .addOnSuccessListener(aVoid -> {
                    // Re-authentication thành công, giờ update password
                    currentUser.updatePassword(newPassword)
                            .addOnSuccessListener(aVoid1 -> {
                                hideLoading();
                                dialog.dismiss();
                                Toast.makeText(getContext(), "Đổi mật khẩu thành công!", Toast.LENGTH_SHORT).show();
                            })
                            .addOnFailureListener(e -> {
                                hideLoading();
                                Toast.makeText(getContext(), "Lỗi khi đổi mật khẩu: " + e.getMessage(), Toast.LENGTH_LONG).show();
                            });
                })
                .addOnFailureListener(e -> {
                    hideLoading();
                    String errorMessage = "Mật khẩu hiện tại không đúng";
                    
                    // Custom error messages
                    if (e.getMessage() != null) {
                        if (e.getMessage().contains("password is invalid")) {
                            errorMessage = "Mật khẩu hiện tại không đúng";
                        } else if (e.getMessage().contains("network")) {
                            errorMessage = "Lỗi kết nối mạng. Vui lòng thử lại";
                        } else {
                            errorMessage = "Lỗi: " + e.getMessage();
                        }
                    }
                    
                    Toast.makeText(getContext(), errorMessage, Toast.LENGTH_LONG).show();
                });
    }

    /**
     * Hiển thị loading dialog
     */
    private void showLoading(String message) {
        if (getContext() == null) return;
        
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    /**
     * Ẩn loading dialog
     */
    private void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    private void showLogoutConfirmDialog() {
        new AlertDialog.Builder(requireContext())
                .setTitle(getString(R.string.profile_logout))
                .setMessage(getString(R.string.profile_logout_confirm))
                .setPositiveButton(getString(R.string.logout), (dialog, which) -> {
                    // Sign out
                    mAuth.signOut();
                    
                    // Navigate to LoginActivity
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    
                    if (getActivity() != null) {
                        getActivity().finish();
                    }
                })
                .setNegativeButton(getString(R.string.cancel), null)
                .show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        hideLoading();
    }
}


