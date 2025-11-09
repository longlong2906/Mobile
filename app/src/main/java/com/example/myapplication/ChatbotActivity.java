package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.HorizontalScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapters.ChatAdapter;
import com.example.myapplication.data.ChatbotData;
import com.example.myapplication.models.Message;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class ChatbotActivity extends AppCompatActivity {

    private RecyclerView rvMessages;
    private TextInputEditText etMessage;
    private FloatingActionButton btnSend;
    private HorizontalScrollView quickRepliesLayout;
    private ChipGroup chipGroupQuickReplies;
    private Toolbar toolbar;

    private ChatAdapter chatAdapter;
    private boolean isTyping = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        initViews();
        setupToolbar();
        setupRecyclerView();
        setupQuickReplies();
        setupListeners();

        // Send welcome message
        sendBotMessage(ChatbotData.getWelcomeMessage());
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        rvMessages = findViewById(R.id.rvMessages);
        etMessage = findViewById(R.id.etMessage);
        btnSend = findViewById(R.id.btnSend);
        quickRepliesLayout = findViewById(R.id.quickRepliesLayout);
        chipGroupQuickReplies = findViewById(R.id.chipGroupQuickReplies);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void setupRecyclerView() {
        chatAdapter = new ChatAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        rvMessages.setLayoutManager(layoutManager);
        rvMessages.setAdapter(chatAdapter);
    }

    private void setupQuickReplies() {
        List<String> quickReplies = ChatbotData.getQuickReplies();
        for (String reply : quickReplies) {
            Chip chip = new Chip(this);
            chip.setText(reply);
            chip.setClickable(true);
            chip.setCheckable(false);
            chip.setOnClickListener(v -> {
                etMessage.setText(reply);
                sendMessage();
            });
            chipGroupQuickReplies.addView(chip);
        }
        
        // Show quick replies after welcome message
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            quickRepliesLayout.setVisibility(View.VISIBLE);
        }, 1000);
    }

    private void setupListeners() {
        btnSend.setOnClickListener(v -> sendMessage());

        etMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Hide quick replies when user starts typing
                if (s.length() > 0) {
                    quickRepliesLayout.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void sendMessage() {
        String messageText = etMessage.getText().toString().trim();
        if (messageText.isEmpty() || isTyping) {
            return;
        }

        // Add user message
        Message userMessage = new Message(messageText, Message.TYPE_USER);
        chatAdapter.addMessage(userMessage);
        scrollToBottom();

        // Clear input
        etMessage.setText("");

        // Simulate bot typing
        isTyping = true;
        btnSend.setEnabled(false);

        // Get bot response after delay
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            String response = ChatbotData.getResponse(messageText);
            sendBotMessage(response);
            isTyping = false;
            btnSend.setEnabled(true);
        }, 1000);
    }

    private void sendBotMessage(String text) {
        Message botMessage = new Message(text, Message.TYPE_BOT);
        chatAdapter.addMessage(botMessage);
        scrollToBottom();
    }

    private void scrollToBottom() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            if (chatAdapter.getItemCount() > 0) {
                rvMessages.smoothScrollToPosition(chatAdapter.getItemCount() - 1);
            }
        }, 100);
    }
}

