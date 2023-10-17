package com.example.javatutorial.interface_doc;

public class MayTinhVinacal500 implements MayTinhBoTuiInterface{  // implements là kế thừa lại
// Có thể chọn Add unimplements methods : Để có thể thực hiện hoá lại các method abstract

    @Override   // Overrided lại các method của interface
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