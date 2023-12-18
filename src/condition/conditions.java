package condition;


/**
 Bài 17: Câu lệnh điều kiện if ...else trong Java

 */

// Bài tập chẵn lẻ
import java.util.Scanner;
//
//public class Conditions {
//    public static void main(String[] args) {
//        int n ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số nguyên n: ");
//        n= sc.nextInt();
//        // Kiểm tra tính chẵn lẻ
//        if(n%2 == 0 ) {
//            System.out.println( n +  " là số Chẵn");
//        }
//        else {
//            System.out.println( n + " là số Lẻ ");
//        }
//    }
//}
// Bài tập giải phương trình bậc nhất
//public class Conditions {
//    public static void main(String[] args) {
//        // PTBN: ax+b = 0
//        /*
//         * Neu a = 0
//         * 		Neu b = 0 => PT Vô số nghiệm
//         * 		Neu b != 0 => PT Vô nghiệm
//         * Neu a!=0
//         * 		Co nghiem x = -b/a
//         */
//
//        double a,b,x;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap a = ");
//        a = sc.nextDouble();
//        System.out.println("Nhap b = ");
//        b = sc.nextDouble();
//
//        if(a==0) {
//            // Tinh huong a = 0
//            if(b==0) {
//                // Tinh huong a=0 va b=0
//                System.out.println("Phương trình vô số nghiệm!");
//            }else {
//                // Tinh huong a=0 va b!=0
//                System.out.println("Phương trình vô nghiệm!");
//            }
//        }else {
//            // Tinh huong a !=0
//            x = -b/a;
//            System.out.println("Con nghiem x = "+ x);
//        }
//    }
//}

/**
 Bài 18: Giải phương trình bậc hai ax2 + bx + c = 0
 */

//import java.util.Scanner;
//
//public class Conditions {
//    public static void main(String[] args) {
//        // Phuong trinh bac 2: ax^2 + bx + c = 0
//        // Các biến cần có: a, b, c, x1, x2, delta
//        /*
//         * Nếu a == 0 thì báo lỗi. B1. delta = b^2 - 4ac B2. Kiem tra delta 2.1. delta
//         * <0 => Phương trình vô nghiệm 2.2. delta ==0 => Phương trình có nghiệm kép
//         * x1=x2=-b/2a 2.3. delta>0 => Phuong trình có 2 nghiệm x1 =
//         * (-b-sqrt(delta))/(2a) x2 = (-b+sqrt(delta))/(2a)
//         */
//        double a, b, c, x1, x2, delta;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhap vao a = ");
//        a = sc.nextDouble();
//        System.out.println("Nhap vao b = ");
//        b = sc.nextDouble();
//        System.out.println("Nhap vao c = ");
//        c = sc.nextDouble();
//
//        delta = Math.pow(b, 2) - 4 * a * c;
//
//        if (a == 0) {
//            System.out.println("Nhập dữ liệu sai!");
//        } else {
//            if (delta < 0) {
//                // Tinh huong delta<0
//                System.out.println("Phương trình vô nghiệm!");
//            } else if (delta == 0) {
//                // Tinh huong delta==0
//                x1 = -b / (2 * a);
//                System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
//            } else {
//                // Tinh huong delta>0
//                x1 = (-b - Math.sqrt(delta)) / (2 * a);
//                x2 = (-b + Math.sqrt(delta)) / (2 * a);
//                System.out.println("Phương trình có nghiệm");
//                System.out.println("x1=" + x1);
//                System.out.println("x2=" + x2);
//            }
//        }
//    }
//}

/**
 Bài 19: Câu lệnh switch ...case trong lập trình Java

 cú pháp
 switch(biến a) {
 case 1:
    // khối lệnh
 break;
 case 2:
 // Khối lệnh
 break;
 ...
 default:
 // Khối lệnh
 }
 */

//import java.util.Scanner;
//
//// Bài tập kiểm tra thứ
//public class Conditions  {
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so nguyen tu 0 den 8: ");
//        n = sc.nextInt();
//
//        switch (n) {
//            case 2: {
//                System.out.println("Thứ hai");
//                break;
//            }
//            case 3: {
//                System.out.println("Thứ ba");
//                break;
//            }
//            case 4: {
//                System.out.println("Thứ tư");
//                break;
//            }
//            case 5: {
//                System.out.println("Thứ năm");
//                break;
//            }
//            case 6: {
//                System.out.println("Thứ sáu");
//                break;
//            }
//            case 7: {
//                System.out.println("Thứ bảy");
//                break;
//            }
//            case 8: {
//                System.out.println("Chủ Nhật");
//                break;
//            }
//            default:
//                System.out.println("Nhap du lieu sai");
//        }
//    }
//}

/**
 Bài 20: Kiểm tra số ngày của tháng trong Java

 */
// BaiTapTimSoNgayCuaThang

public class conditions {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap vao nam: ");
        nam = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:  // Những case giống nhau có hành động giống nhau -- thì break 1 lượt
                System.out.println("Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            case 2:
                if((nam % 4==0 && nam %100 !=0)||(nam %400==0)) {
                    System.out.println("Có 29 ngày");
                }else {
                    System.out.println("Có 28 ngày");
                }
                break;
            default:
                System.out.println("Nhập dữ liệu sai!");
                break;
        }
    }
}