package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import com.example.myapplication.models.User;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText etFullName, etEmail, etPassword, etConfirmPassword;
    private MaterialButton btnRegister;
    private TextView tvSignIn;
    private ImageButton btnBack;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize Firebase Auth và Firestore
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        // Initialize Views
        initViews();

        // Set Click Listeners
        setClickListeners();
    }

    private void initViews() {
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvSignIn = findViewById(R.id.tvSignIn);
        btnBack = findViewById(R.id.btnBack);
        progressBar = findViewById(R.id.progressBar);
    }

    private void setClickListeners() {
        btnRegister.setOnClickListener(v -> registerUser());

        tvSignIn.setOnClickListener(v -> {
            finish();
        });

        btnBack.setOnClickListener(v -> {
            finish();
        });
    }

    private void registerUser() {
        String fullName = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirmPassword = etConfirmPassword.getText().toString().trim();

        // Validate input
        if (!validateInput(fullName, email, password, confirmPassword)) {
            return;
        }

        // Show progress
        showLoading(true);

        // Create user with Firebase
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // Registration success
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        if (firebaseUser != null) {
                            // Save user data to Firestore
                            saveUserToFirestore(firebaseUser, fullName, email);
                        }
                    } else {
                        // Registration failed
                        showLoading(false);
                        String errorMessage = getString(R.string.error_registration_failed);
                        
                        // Get detailed error message
                        if (task.getException() != null) {
                            String exceptionMessage = task.getException().getMessage();
                            if (exceptionMessage != null) {
                                if (exceptionMessage.contains("email address is already in use")) {
                                    errorMessage = "Email này đã được đăng ký. Vui lòng đăng nhập hoặc dùng email khác.";
                                } else if (exceptionMessage.contains("network error")) {
                                    errorMessage = "Lỗi kết nối mạng. Vui lòng kiểm tra internet.";
                                } else if (exceptionMessage.contains("Password should be at least 6 characters")) {
                                    errorMessage = "Mật khẩu phải có ít nhất 6 ký tự.";
                                } else {
                                    errorMessage = "Lỗi: " + exceptionMessage;
                                }
                            }
                        }
                        
                        Toast.makeText(RegisterActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void saveUserToFirestore(FirebaseUser firebaseUser, String fullName, String email) {
        User user = new User(firebaseUser.getUid(), fullName, email);

        db.collection("users").document(firebaseUser.getUid())
                .set(user)
                .addOnSuccessListener(aVoid -> {
                    // Send email verification
                    sendEmailVerification(firebaseUser);
                })
                .addOnFailureListener(e -> {
                    showLoading(false);
                    String errorMessage = "Lỗi khi lưu thông tin: ";
                    if (e.getMessage() != null) {
                        errorMessage += e.getMessage();
                    } else {
                        errorMessage += "Không xác định. Vui lòng kiểm tra Firestore Rules.";
                    }
                    Toast.makeText(RegisterActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                });
    }

    private void sendEmailVerification(FirebaseUser user) {
        user.sendEmailVerification()
                .addOnCompleteListener(task -> {
                    showLoading(false);
                    if (task.isSuccessful()) {
                        Toast.makeText(RegisterActivity.this, getString(R.string.success_registration),
                                Toast.LENGTH_LONG).show();
                        
                        // Sign out user and redirect to login
                        mAuth.signOut();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(RegisterActivity.this, getString(R.string.success_registration),
                                Toast.LENGTH_LONG).show();
                        
                        // Even if email verification fails, redirect to login
                        mAuth.signOut();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        finish();
                    }
                });
    }

    private boolean validateInput(String fullName, String email, String password, String confirmPassword) {
        if (TextUtils.isEmpty(fullName)) {
            Toast.makeText(this, getString(R.string.error_empty_full_name), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, getString(R.string.error_empty_email), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, getString(R.string.error_invalid_email), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, getString(R.string.error_empty_password), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (password.length() < 6) {
            Toast.makeText(this, getString(R.string.error_password_too_short), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, getString(R.string.error_password_mismatch), Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void showLoading(boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
        btnRegister.setEnabled(!show);
    }
}




