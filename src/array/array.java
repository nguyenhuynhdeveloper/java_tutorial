package array;


/**
 Bài 27A: Giới thiệu về mảng trong lập trình java


 */


import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        double[] mang1;
        double mang2[];  // [] Có thể viết trước hoặc viết sau

        mang1 = new double[10];   // Phải biết trước số luo
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(" Nhập phần tử thứ " + i + ":");
            mang1[i] = sc.nextDouble(); // Khi ấn phím enter là kết thúc nhận bàn phím
        }
        double tong = 0;
        for (int i = 0; i < mang1.length; i++) {
            tong+= mang1[i];
        }
        System.out.println("Tổng các phần tử :" + tong );

        // Cách nhanh gọn để gán giá trị cho 1 mảng
         mang2= new double[]{1, 2, 3, 4, 5};
        for (int i = 0; i < mang2.length; i++) {
            System.out.println("Phần tử mảng 2: " + mang2[i]);
        }
    }}

//public class ArrayList {
//    public static void main(String[] args) {
//        // declares an array of integers
//        int[] anArray;
//
//        // allocates memory for 10 integers
//        anArray = new int[10];
//
//        // initialize first element
//        anArray[0] = 100;
//        // initialize second element
//        anArray[1] = 200;
//        // and so forth
//        anArray[2] = 300;
//        anArray[3] = 400;
//        anArray[4] = 500;
//        anArray[5] = 600;
//        anArray[6] = 700;
//        anArray[7] = 800;
//        anArray[8] = 900;
//        anArray[9] = 1000;
//        //
//
//        //
//
//        System.out.println("Element at index 0: "
//                + anArray[0]);
//        System.out.println("Element at index 1: "
//                + anArray[1]);
//        System.out.println("Element at index 2: "
//                + anArray[2]);
//        System.out.println("Element at index 3: "
//                + anArray[3]);
//        System.out.println("Element at index 4: "
//                + anArray[4]);
//        System.out.println("Element at index 5: "
//                + anArray[5]);
//        System.out.println("Element at index 6: "
//                + anArray[6]);
//        System.out.println("Element at index 7: "
//                + anArray[7]);
//        System.out.println("Element at index 8: "
//                + anArray[8]);
//        System.out.println("Element at index 9: "
//                + anArray[9]);
//    }
//}
