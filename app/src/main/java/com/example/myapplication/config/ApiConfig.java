package com.example.myapplication.config;

/**
 * Cấu hình API keys và endpoints
 */
public class ApiConfig {
    
    /**
     * Gemini API Key
     * Lấy từ: https://makersuite.google.com/app/apikey
     */
    public static final String GEMINI_API_KEY = "AIzaSyDWjReDsemNbkLWewLe2nSNvyfwU4qVUng";
    
    /**
     * Gemini API endpoint
     */
    public static final String GEMINI_API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent";
    
    /**
     * Model name
     */
    public static final String GEMINI_MODEL = "gemini-2.5-flash";
    
    /**
     * Kiểm tra xem API key đã được cấu hình chưa
     */
    public static boolean isApiKeyConfigured() {
        return GEMINI_API_KEY.equals("API_KEY")
               && !GEMINI_API_KEY.isEmpty();
    }
}
