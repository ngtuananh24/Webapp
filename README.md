## XÂY DỰNG WEBAPP HIỂN THỊ THÔNG TIN CÁ NHÂN
> - Author: Nguyễn Tuấn Anh 
> - Class: K57KMT
> - ID student: K215480106003
### Nội dung:
 - [x] **Cài đặt Android studio và Android SDK**
 - [x] **Tạo app sử dụng Java**
 - [x] **Thư mục Assets**
   - Index HTML + other(s): Sử dụng html, css, javascript, kiến thức đã học về web,...
 - [x] **MainActivity**: Java <-> Javascript
 - [x] **Tạo một chương trình** giải ptb2,... sử dụng OOP, html,css,java,javasscript.
------------------
### Nội dung chi tiết:
1. Thông tin cá nhân
2. File mp3
3. Up video ngắn mp4
4. Sơ lược quá trình buid
--------------------
### Ứng dụng đã build và test trên máy thật

### Demo

https://github.com/user-attachments/assets/3b30009d-14f3-46f3-8c49-a31d7fc9fbd9

### 1. Hiển thị thông tin sinh viên trên Dialog
![398590119-45d75b1f-1829-4c98-a9c7-326b795b46ab (2)](https://github.com/user-attachments/assets/7811e9b5-a2bd-4896-bb14-325d1ad42645)

---------------

### 2. Xây dựng giao diện khi chọn các tuỳ chọn

![398590222-e24bfadb-5cf8-432c-9cd6-917fa3787a6b](https://github.com/user-attachments/assets/4b7e04de-dfdc-4df6-87c5-e29795ddc04f)


### 3. Xây dựng WebApp hiển thị một button quà tặng, phát file nhạc mp3, phát file video mp4

![398590572-6820e8df-128f-4093-a9cb-1b1dafa8f1da](https://github.com/user-attachments/assets/71f75304-b6d8-4fa9-b8a1-3f185a2dea11)

---------------

### 4. Hiển thị một button quà tặng
![398590333-294bfd49-553f-4795-8774-b66df0a9437a](https://github.com/user-attachments/assets/dcbc7645-03fb-4956-bbe1-745e7bce776c)


--------------

### 5. Diện tích hình tròn

![z6361599886848_08bc99d20011a42ab98357ffed1bc0f4](https://github.com/user-attachments/assets/2f2951af-c978-46ce-af49-d7383ff74ce0)


# Phân tích chương trình WebAPP Android

## 1. Giới thiệu chương trình
Chương trình Android này được xây dựng bằng ngôn ngữ **Java** trên nền tảng **Android Studio**, sử dụng mô hình **Activity** để xây dựng các màn hình giao diện và xử lý sự kiện.

### Chức năng chính:
- Nhập thông tin sinh viên (Họ tên, Lớp, Mã sinh viên)
- Xem thông tin sinh viên qua hộp thoại
- Chuyển sang màn hình WebApp
- Chuyển sang màn hình Tính diện hình tròn

---


## 2. Phân tích chi tiết

### a. Khởi tạo giao diện
Phương thức sau dùng để nạp giao diện chính từ file XML:
```java
setContentView(R.layout.activity_main);
```

---

### b. Ánh xạ các thành phần giao diện
Sử dụng `findViewById()` để ánh xạ các thành phần từ giao diện XML vào các biến trong code:
```java
edt_hoten = findViewById(R.id.edt_hoten);
edt_lop = findViewById(R.id.edt_lop);
edt_masv = findViewById(R.id.edt_masv);
btn_xemtt = findViewById(R.id.btn_xemtt);
btn_webapp = findViewById(R.id.btn_webapp);
btn_dthinhtron = findViewById(R.id.dthinhtron);
```

---

### c. Xử lý sự kiện

#### Nút "Xem Thông Tin"
Hiển thị thông tin sinh viên qua **AlertDialog**:
```java
btn_xemtt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String hoten = edt_hoten.getText().toString();
        String lop = edt_lop.getText().toString();
        String masv = edt_masv.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Thông Tin Sinh Viên")
                .setMessage("Họ Tên: " + hoten + "\nLớp: " + lop + "\nMã SV: " + masv)
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        builder.create().show();
    }
});
```

#### Nút "WebApp"
Chuyển sang màn hình WebApp bằng **Intent**:
```java
btn_webapp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
});
```

#### Nút "Tính Diện Tích Hình Tròn"
Chuyển sang màn hình đồ thị hình tròn bằng **Intent**:
```java
btn_dthinhtron.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent2);
    }
});
```

---
### Công nghệ sử dụng
- Ngôn ngữ: **Java**
- IDE: **Android Studio**
- Thư viện hỗ trợ:
  - **AndroidX**
  - **AppCompat**
  - **AlertDialog**

### Quy trình triển khai
1. Tạo dự án mới trong Android Studio.
2. Thiết kế giao diện trong XML.
3. Code xử lý các sự kiện trong các Activity.
4. Chạy thử nghiệm trên thiết bị thật hoặc trình giả lập.

---

## Kết luận
Chương trình trên là ứng dụng cơ bản giúp người dùng nhập và hiển thị thông tin sinh viên, đồng thời chuyển đổi qua các màn hình khác để thực hiện các chức năng phụ. Đây là nền tảng cho các ứng dụng phức tạp hơn trong tương lai.


  
  
