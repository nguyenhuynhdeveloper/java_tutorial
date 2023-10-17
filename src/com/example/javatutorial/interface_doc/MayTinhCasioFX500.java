package com.example.javatutorial.interface_doc;

public class MayTinhCasioFX500 implements MayTinhBoTuiInterface{

    // Khi chúng ta không viết constructor ở class thì mặc định có 1 constructor rỗng -- và vẫn có thể tạo đối tượng bình thường
    @Override   // Override lại các method của interface
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

}