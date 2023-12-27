package String;

import java.util.Arrays;

// Bài 56: Cach phân tích chuỗi thành mảng trong Java
public class String_split {
    public static void main(String[] args) {
        String s ="Xin chào các bạn, tui là Peter!";

        String[] a = s.split(" ");  // Cắt chuỗi dựa vào dấu khoảng trắng
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));   // Cắt chuỗi dựa vào dấu ,

        String s2 = "Xin chào, mình là Peter. Mình là lập trình viên!";
        String[] c = s2.split("\\.|\\,");
        System.out.println("\\.|\\" + Arrays.toString(c));   // Cắt chuỗi dựa vào dâu , hoặc dấu .

        String s3 = "Nguyen Van A";
        String[] d= s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Tên: "+d[d.length-1]);
    }
}