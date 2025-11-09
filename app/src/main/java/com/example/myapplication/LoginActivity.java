package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.firestore.FirebaseFirestore;

import com.example.myapplication.models.User;

public class LoginActivity extends AppCompatActivity {

    private static final int RC_SIGN_IN = 9001;

    private TextInputEditText etEmail, etPassword;
    private MaterialButton btnLogin, btnGoogleSignIn;
    private TextView tvForgotPassword, tvSignUp;
    private ProgressBar progressBar;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;
    private GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth và Firestore
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        // Initialize Views
        initViews();

        // Set Click Listeners
        setClickListeners();
    }

    private void initViews() {
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnGoogleSignIn = findViewById(R.id.btnGoogleSignIn);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvSignUp = findViewById(R.id.tvSignUp);
        progressBar = findViewById(R.id.progressBar);
    }

    private void setClickListeners() {
        btnLogin.setOnClickListener(v -> loginUser());

        btnGoogleSignIn.setOnClickListener(v -> signInWithGoogle());

        tvForgotPassword.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            startActivity(intent);
        });

        tvSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }

    private void loginUser() {
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validate input
        if (!validateInput(email, password)) {
            return;
        }

        // Show progress
        showLoading(true);

        // Sign in with Firebase
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    showLoading(false);
                    if (task.isSuccessful()) {
                        // Sign in success
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(LoginActivity.this, getString(R.string.success_login),
                                Toast.LENGTH_SHORT).show();
                        navigateToMainActivity();
                    } else {
                        // Sign in failed
                        Toast.makeText(LoginActivity.this, getString(R.string.error_login_failed),
                                Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void signInWithGoogle() {
        // Sign out first to always show account picker
        mGoogleSignInClient.signOut().addOnCompleteListener(this, task -> {
            Intent signInIntent = mGoogleSignInClient.getSignInIntent();
            startActivityForResult(signInIntent, RC_SIGN_IN);
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // Check if user cancelled the sign-in
            if (resultCode == RESULT_CANCELED) {
                // User cancelled - just stay on login screen, no error message needed
                return;
            }

            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed (not user cancellation)
                // Log the error code for debugging
                int errorCode = e.getStatusCode();
                
                // Only show error if it's not a user cancellation (code 12501)
                if (errorCode != 12501) {
                    Toast.makeText(this, getString(R.string.error_google_sign_in_failed),
                            Toast.LENGTH_SHORT).show();
                }
                // If error code is 12501, user pressed back - just stay on login screen
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        showLoading(true);
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // Sign in success
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        if (firebaseUser != null) {
                            // Check if user exists in Firestore
                            checkAndCreateUserInFirestore(firebaseUser);
                        }
                    } else {
                        // Sign in failed
                        showLoading(false);
                        Toast.makeText(LoginActivity.this, getString(R.string.error_google_sign_in_failed),
                                Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void checkAndCreateUserInFirestore(FirebaseUser firebaseUser) {
        db.collection("users").document(firebaseUser.getUid())
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (!documentSnapshot.exists()) {
                        // User doesn't exist in Firestore, create new user
                        User newUser = new User(
                                firebaseUser.getUid(),
                                firebaseUser.getDisplayName(),
                                firebaseUser.getEmail()
                        );
                        db.collection("users").document(firebaseUser.getUid())
                                .set(newUser)
                                .addOnSuccessListener(aVoid -> {
                                    showLoading(false);
                                    Toast.makeText(LoginActivity.this, getString(R.string.success_login),
                                            Toast.LENGTH_SHORT).show();
                                    navigateToMainActivity();
                                })
                                .addOnFailureListener(e -> {
                                    showLoading(false);
                                    Toast.makeText(LoginActivity.this, getString(R.string.error_login_failed),
                                            Toast.LENGTH_SHORT).show();
                                });
                    } else {
                        // User exists
                        showLoading(false);
                        Toast.makeText(LoginActivity.this, getString(R.string.success_login),
                                Toast.LENGTH_SHORT).show();
                        navigateToMainActivity();
                    }
                })
                .addOnFailureListener(e -> {
                    showLoading(false);
                    Toast.makeText(LoginActivity.this, getString(R.string.error_login_failed),
                            Toast.LENGTH_SHORT).show();
                });
    }

    private boolean validateInput(String email, String password) {
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

        return true;
    }

    private void showLoading(boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
        btnLogin.setEnabled(!show);
        btnGoogleSignIn.setEnabled(!show);
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            navigateToMainActivity();
        }
    }
}


