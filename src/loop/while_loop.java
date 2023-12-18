package loop;

/**
 Bài 23: Cách sử dụng vòng lặp while trong lập trình Java

 while(điều kiện){
  // Khối lệnh
 }

 for : biết điểm dừng
 while : chưa biết số lượng lặp bao nhiêu
 */

//import java.util.Scanner;
//
//public class While_loop {
//    public static void main(String[] args) {
//        int x = 1;
//        Scanner sc = new Scanner(System.in);
//        while(x!=0) {
//            System.out.println("Nhap x = 0 de thoat; Nhap ky tuc khac de tiep tuc:");
//            x = sc.nextInt();
//        }
//
//        int i=0;
//        while(true) {
//            System.out.println(i);
//            i++;
//            if(i==10)
//                break; // break để thoát khỏi vòng lặp
//        }
//    }
//}

/**
 Bài 24: Chuyển đổi từ thập phân sang nhị phân
 */

//import java.util.Scanner;
//
//public class While_loop {
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so nguyen n>0");
//        n = sc.nextInt();
//
//        String nhiPhan = "";
//        while(n>0) {
//            nhiPhan = (n%2) + nhiPhan;
//            n = n/2;   // Chia số n --> biến n nhận giá trị mới
//        }
//        System.out.println("So he nhi phan la: "+nhiPhan);
//
//        /*
//         * Chia lien tuc cho 2 va lay phan du
//         * Dao nguoc chuoi => Ket qua
//         * 10:2 = 5  du 0
//         * 5:2 = 2 du 1
//         * 2:2 = 1 du 0
//         * 1:2 = 0 du 1
//         * 0
//         * 10
//         * 010
//         * 1010
//         */
//    }
//}


/**
 Bài 25: Vòng lặp do while trong lập trình Java

 do {
    // Khối lệnh
 }
 while(Điều kiện)

 Thực thi được ít nhất 1 lần
 */


import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao n>0");
            n = sc.nextInt();
        }while(n<=0);
    }
}