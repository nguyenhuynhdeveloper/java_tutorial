// Ngày 8/10/2023
package com.example.javatutorial;

/***
 Bài 21: Cách sử dụng vòng lặp for trong lập trình Java
 for (int i = 0; i < 5, i++ ) {
    // Khối lệnh
  return ; // return trong này là thoát khỏi vòng lặp luôn
 }

 Nếu biểu thức điều kiện còn đúng thì khối lệnh còn được chạy
 */

//public class For_Loop {
//    public static void main(String[] args) {
//        // Bị phạt chép phạt 2000 lần "Em hứa sẽ làm bài tập đầy đủ"
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i+". Em hứa làm bài tập đầy đủ");
//        }
//
//        for (int i = 20; i >0; i--) {
//            System.out.println(i+". Em hứa làm bài tập đầy đủ");
//        }
//    }
//}

/**
 Bài 22: Lập trình in ra bảng cửu chương trong Java
 */

public  class for_Loop {
    public static void main(String[] args) {
        for (int i = 2; i<=9; i++) {
            for(int j = 1 ; j <= 10 ; j++)
                System.out.println( i+ "x" +j + "= "+(i*j));
        }
        System.out.println("---");
    }
}