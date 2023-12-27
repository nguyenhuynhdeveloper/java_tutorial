package String;
import java.util.Scanner;
// Bài 49: Lấy độ dài chuỗi và ký tự  của chuỗi 
public class String_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("------");

        // Hàm length() => lấy độ dài chuỗi
        System.out.println(s.length());
        int doDai = s.length();

        // Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
        // có 3 cách, lấy ra giá trị của các ký tự thành một mảng
//        for(int i=0; i
        byte[] arrayBytes = s.getBytes();
//        for (byte b : arrayBytes) {
//            System.out.println(b);
//        }
    }
}
