package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
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

public class ForgotPasswordActivity extends AppCompatActivity {

    private TextInputEditText etEmail;
    private MaterialButton btnSendResetLink;
    private TextView tvBackToLogin;
    private ImageButton btnBack;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // Initialize Views
        initViews();

        // Set Click Listeners
        setClickListeners();
    }

    private void initViews() {
        etEmail = findViewById(R.id.etEmail);
        btnSendResetLink = findViewById(R.id.btnSendResetLink);
        tvBackToLogin = findViewById(R.id.tvBackToLogin);
        btnBack = findViewById(R.id.btnBack);
        progressBar = findViewById(R.id.progressBar);
    }

    private void setClickListeners() {
        btnSendResetLink.setOnClickListener(v -> sendPasswordResetEmail());

        tvBackToLogin.setOnClickListener(v -> finish());

        btnBack.setOnClickListener(v -> finish());
    }

    private void sendPasswordResetEmail() {
        String email = etEmail.getText().toString().trim();

        // Validate input
        if (!validateInput(email)) {
            return;
        }

        // Show progress
        showLoading(true);

        // Send password reset email
        mAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(task -> {
                    showLoading(false);
                    if (task.isSuccessful()) {
                        Toast.makeText(ForgotPasswordActivity.this,
                                getString(R.string.success_password_reset),
                                Toast.LENGTH_LONG).show();
                        finish();
                    } else {
                        Toast.makeText(ForgotPasswordActivity.this,
                                getString(R.string.error_password_reset_failed),
                                Toast.LENGTH_LONG).show();
                    }
                });
    }

    private boolean validateInput(String email) {
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, getString(R.string.error_empty_email), Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, getString(R.string.error_invalid_email), Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void showLoading(boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
        btnSendResetLink.setEnabled(!show);
    }
}





