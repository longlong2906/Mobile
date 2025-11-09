# 🎯 LUỒNG HOẠT ĐỘNG HỆ THỐNG GEMINI API

```
┌─────────────────────────────────────────────────────────────────┐
│                    QUIZ HOLLAND - GEMINI AI                      │
└─────────────────────────────────────────────────────────────────┘

                         ┌─────────────┐
                         │ QuizActivity│
                         └──────┬──────┘
                                │
                                ▼
              ┌─────────────────────────────────┐
              │   ViewPager2 (7 Fragments)      │
              ├─────────────────────────────────┤
              │ • Page 1: 5 câu checkbox        │
              │ • Page 2: 5 câu checkbox        │
              │ • Page 3: 5 câu checkbox        │
              │ • Page 4: 5 câu checkbox        │
              │ • Page 5: 5 câu checkbox        │
              │ • Page 6: 5 câu checkbox        │
              │ • Page 7: QuizSummaryFragment   │◄─── ⭐ TRANG MỚI
              └─────────────┬───────────────────┘
                            │
                            │ Người dùng chọn xong
                            ▼
              ┌──────────────────────────────────┐
              │   QuizSummaryFragment            │
              ├──────────────────────────────────┤
              │ 1. Hiển thị câu đã chọn          │
              │ 2. Button: "Nhận gợi ý từ AI"    │
              │ 3. TextView: Kết quả (ẩn)        │
              └─────────────┬────────────────────┘
                            │
                            │ Click button
                            ▼
              ┌──────────────────────────────────┐
              │      GeminiService               │
              ├──────────────────────────────────┤
              │ • buildPrompt()                  │
              │   └─ System Prompt (Fixed)       │
              │   └─ User Data (Dynamic)         │
              │   └─ Format Request (Fixed)      │
              │                                  │
              │ • Call API (Async)               │
              │   └─ OkHttp Client               │
              │   └─ JSON Request                │
              └─────────────┬────────────────────┘
                            │
                            │ HTTP POST
                            ▼
              ┌──────────────────────────────────┐
              │      GEMINI API (Google)         │
              │  generativelanguage.googleapis   │
              ├──────────────────────────────────┤
              │ Model: gemini-pro                │
              │ Temperature: 0.7                 │
              │ MaxTokens: 2048                  │
              └─────────────┬────────────────────┘
                            │
                            │ JSON Response (3-5s)
                            ▼
              ┌──────────────────────────────────┐
              │      Parse Response              │
              ├──────────────────────────────────┤
              │ {                                │
              │   "candidates": [{               │
              │     "content": {                 │
              │       "parts": [{                │
              │         "text": "**MÃ HOLLAND**: │
              │                  RIA..."         │
              │       }]                         │
              │     }                            │
              │   }]                             │
              │ }                                │
              └─────────────┬────────────────────┘
                            │
                            │ Extract text
                            ▼
              ┌──────────────────────────────────┐
              │   Display Result                 │
              ├──────────────────────────────────┤
              │ **MÃ HOLLAND:** RIA              │
              │                                  │
              │ **MÔ TẢ TÍNH CÁCH:**             │
              │ Bạn là người thích làm việc...   │
              │                                  │
              │ **NGÀNH NGHỀ GỢI Ý:**            │
              │ 1. Kỹ sư Cơ khí                  │
              │ 2. Công nghệ Thông tin           │
              │ 3. Kiến trúc sư                  │
              │ ...                              │
              │                                  │
              │ **GIẢI THÍCH:**                  │
              │ Các ngành này phù hợp vì...      │
              └──────────────────────────────────┘
```

---

## 📊 CHI TIẾT TỪNG BƯỚC

### 1️⃣ Thu thập dữ liệu (6 trang đầu)
```
QuizPageFragment (x6)
├─ Hiển thị 5 câu hỏi checkbox
├─ Người dùng tick/untick
└─ Lưu vào QuizAnswer
    └─ Map<Integer, Boolean>
        • Key: Question ID
        • Value: true/false
```

### 2️⃣ Tổng hợp (Trang 7)
```
QuizSummaryFragment
├─ Filter câu đã chọn (value = true)
├─ Hiển thị danh sách
│   └─ SelectedQuestionAdapter
└─ Nút "Nhận gợi ý từ AI"
```

### 3️⃣ Xây dựng Prompt
```java
buildPrompt(selectedQuestions) {
    // PART 1: System Instructions (CỐ ĐỊNH)
    "Bạn là chuyên gia tư vấn hướng nghiệp..."
    "Phân tích theo lý thuyết Holland Code..."
    
    // PART 2: User Data (ĐỘNG)
    "Người dùng đã chọn:"
    "- R (Realistic): 8 câu"
    "- I (Investigative): 5 câu"
    "- A (Artistic): 3 câu"
    "..."
    "Chi tiết:"
    "1. [R] Tôi thích sửa chữa đồ điện tử"
    "2. [I] Tôi thích giải toán phức tạp"
    
    // PART 3: Format Request (CỐ ĐỊNH)
    "Trả lời theo format:"
    "**MÃ HOLLAND:** ..."
    "**MÔ TẢ TÍNH CÁCH:** ..."
}
```

### 4️⃣ Gọi API
```java
Request:
POST https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=API_KEY
Content-Type: application/json

{
  "contents": [{
    "parts": [{
      "text": "[PROMPT ĐÃ XÂY DỰNG]"
    }]
  }],
  "generationConfig": {
    "temperature": 0.7,
    "maxOutputTokens": 2048
  }
}
```

### 5️⃣ Nhận Response
```java
Response (HTTP 200):
{
  "candidates": [{
    "content": {
      "parts": [{
        "text": "**MÃ HOLLAND:** RIA\n\n**MÔ TẢ TÍNH CÁCH:**\nBạn là người..."
      }]
    },
    "finishReason": "STOP"
  }]
}
```

### 6️⃣ Hiển thị kết quả
```java
onSuccess(response) {
    // Ẩn loading
    hideLoading();
    
    // Hiển thị TextView
    tvRecommendationResult.setVisibility(VISIBLE);
    tvRecommendationResult.setText(response);
    
    // Ẩn nút
    btnGetRecommendation.setVisibility(GONE);
}
```

---

## 🔄 ERROR HANDLING

```
Try {
    Call Gemini API
}
Catch {
    ├─ No Internet → "Vui lòng kiểm tra kết nối"
    ├─ API Key Invalid → "API Key chưa được cấu hình"
    ├─ Rate Limit → "Vượt quá giới hạn, thử lại sau"
    ├─ Timeout → "Timeout, vui lòng thử lại"
    └─ Other → "Lỗi: [error message]"
}
Finally {
    hideLoading();
}
```

---

## ⏱️ PERFORMANCE

- **API Call Time**: 3-5 giây (tùy network)
- **Build Prompt**: < 100ms
- **Parse Response**: < 50ms
- **Total Time**: ~3-6 giây

---

## 💾 DATA STRUCTURE

### QuizAnswer
```java
class QuizAnswer {
    Map<Integer, Boolean> answers;
    // Key: Question ID (1-30)
    // Value: Selected (true/false)
    
    getSelectedQuestionIds() → List<Integer>
    getSelectedCount() → int
}
```

### Question
```java
class Question {
    int id;
    String questionText;
    HollandType hollandType; // R, I, A, S, E, C
}
```

### API Response (Parsed)
```java
String response = "**MÃ HOLLAND:** RIA\n\n**MÔ TẢ TÍNH CÁCH:**\n...";
// Hiển thị trực tiếp, không parse thêm
```

---

## 🎨 UI STATES

```
State 1: Initial
├─ RecyclerView: Visible (danh sách câu)
├─ Button: Visible, Enabled
└─ Result TextView: GONE

State 2: Loading
├─ ProgressDialog: Show
├─ Button: Disabled
└─ Result TextView: GONE

State 3: Success
├─ ProgressDialog: Dismissed
├─ Button: GONE
├─ Result TextView: VISIBLE
└─ Toast: "Đã nhận được gợi ý!"

State 4: Error
├─ ProgressDialog: Dismissed
├─ Button: Visible, Enabled (cho phép retry)
├─ Result TextView: GONE
└─ Toast: "[Error message]"
```

---

**Tác giả**: AI Assistant  
**Version**: 1.0  
**Date**: November 3, 2025
