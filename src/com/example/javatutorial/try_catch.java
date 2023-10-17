package com.example.javatutorial;

/**
 Bài 27: Cách bắt lỗi ngoại lệ bằng try catch finally trong lập trình Java

 try {
    // Khối lệnh có thể ném ngoại lệ
 } catch (err) {
    // Khối lệnh sẽ thực hiện nếu ngoại lệ xảy ra
 }  finally {
    // Khối lệnh sẽ thực hiện bất cấp ngoại lệ có xảy ra hay không
 }
 */


import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception e) {   // Khi mà nhập không phải số : ví dụ nhập chữ , ký tự đặc biệt
            System.out.println("Nhập dữ liệu không đúng");
        } finally {
            System.out.println("Finally!");
        }
        System.out.println("Gia tri nhap la: "+n);
        System.out.println("Ket thuc chuong trinh");
    }
}