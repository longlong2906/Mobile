package com.example.myapplication.models;

public class Message {
    public static final int TYPE_USER = 0;
    public static final int TYPE_BOT = 1;

    private String text;
    private int type; // 0 = user, 1 = bot
    private long timestamp;

    public Message(String text, int type) {
        this.text = text;
        this.type = type;
        this.timestamp = System.currentTimeMillis();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isUser() {
        return type == TYPE_USER;
    }

    public boolean isBot() {
        return type == TYPE_BOT;
    }
}

