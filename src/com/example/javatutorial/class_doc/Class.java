package com.example.javatutorial.class_doc;

import com.example.javatutorial.class_doc.MyDate;

/**
 Bài: 30: Cách xây dựng lớp và phương thức khởi tạo Constructor
 */
// Tên file -- tên Class : Có thể viết thường chữ cái đầu tiên

// Class MyDate đã viết ở 1 file khác - Không cần import

public class Class {
    public static void main(String[] args) {
        int d;
        MyDate md = new MyDate(25, 2, 2029);
        md.printDate();
        md.printDay();
        md.printMonth();
        md.printYear();
    }
}
