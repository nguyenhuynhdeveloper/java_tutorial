//  8/10/2023

package operators;
// Bài 11: Các phép toán cơ bản trong Java --



//import java.util.Scanner;
//
//public class Operators {
//    public static void main(String[] args) {
//        // Khai báo biến
//        int a, b;
//
//        // Nhập dữ liệu
//        Scanner sc = new Scanner(System.in);  // Biến cho phép nhập dữ liệu
//        System.out.println("Nhap vao a = ");
//        a = sc.nextInt();
//        System.out.println("Nhap vao b = ");
//        b = sc.nextInt();
//
//        int tong = a + b;
//        System.out.println(a+" + "+b+" = "+tong);  // Phép cộng
//
//        int hieu = a - b;
//        System.out.println(a+" - "+b+" = "+hieu);  // Phép trừ
//
//        int nhan = a * b;
//        System.out.println(a+" * "+b+" = "+nhan);  // Phép nhân
//
//        float thuong = (float)a / b;   // Phải ép kiểu sang số thực float Đặt kiểu dữ liệu trước biến là xong
//        System.out.println(a+" / "+b+" = "+thuong);  // Phép chia
//
//        int soDu = a % b;
//        System.out.println(a+" % "+b+" = "+soDu);   // Phép chia lấy dư
//    }
//}

// Bài 12: Các phép toán 1 ngôi trong Java

/**
 + Cộng một ngôi- Biểu thị một giá trị dương
 - : Trừ một ngôi - phủ định 1 biểu thức
 ++ : Phép toán tăng - Tăng giá trị của 1 biến lên 1
 -- : Phép tóan giảm - Giảm giá trị của 1 biến đi 1
 ! : Phép toán phần bù logic - nghịch đảo một giá trị boolean



 Lưu ý khi sử dụng phép toán ++ --
 - Nếu đặt trước biến => Giá trị của biến sẽ tăng/giảm lên rồi mới thực hiện đoạn code đó
 - Nếu đặt sau biến => Giá trị của biến sẽ tăng/giảm sau khi thực hiện đoạn code đó
 */

//public class Operators {
//    public static void main(String[] args) {
//        int a = 5;
//        boolean b = false;
//        System.out.println(" -a => giá tri: "+ (-a));  // -5 giá trị âm của 5
//        System.out.println(" +a => giá tri: "+ (+a));  // 5 giá trị dương  của 5
//        System.out.println(" !b => giá tri: "+ (!b));  // Nghịch đảo lại boolean của b
//        System.out.println("-------");
//        System.out.println("a = "+ a);
//        System.out.println("++a = "+ ++a);   // ++a Ngay lập tức a thành 6 --> in ra 6
//        System.out.println("a++ = "+ a++);   // a bằng 7 sau câu lệnh này --> Vẫn in ra 6
//        System.out.println("a = "+ a);  // 7
//        System.out.println("--a = "+ (--a));  // --a Ngay lập tức a thành 6 --> in ra 6
//        System.out.println("a-- = "+ (a--));  // a sẽ bằng 5 sau câu lệnh này --> Vẫn in ra 6
//        System.out.println("a = "+ a);  // 5
//    }
//}


/**
 Bài 13: Cách gán dữ liệu trong Java

 a= b -> a=b
 a += b -> a = a + b
 a -= b -> a = a-b
 a *= b -> a = a * b
 a /= b -> a = a / b
 a %= b -> a = a % b

 */


//import java.util.Scanner;
//
//public class Operators {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        float a;
//        System.out.println("Nhap vao so a = ");
//        // Các phép gán
//        a = sc.nextFloat();   // Ví dụ nhập a = 10
//        System.out.println("a = "+ a);  // 10
//
//        a+=3; // a = a +3;
//        System.out.println("a+=3 : " + a);   // 13
//
//        a-=2; // a = a -2;
//        System.out.println("a-=2 : " + a);  // 11
//
//        a*=3; // a = a*3;
//        System.out.println("a*=3 : " + a);  // 33
//
//        a/=3; // a = a/3;
//        System.out.println("a/=3 : " + a); // 11
//
//        a%=3; // a = a%3;
//        System.out.println("a%=3 : " + a);  // 11 / 3 lấy dư = 2
//    }
//}

/**
 Bài 14: Các phép toán so sánh và điều kiện trong Java

 Các phép toán so sánh trong Java
 == : Phép toán bằng - Kiểm tra trạng thái bằng nhau của 2 số
 != : Không bằng - Kiểm tra sự không bằng nhau của 2 số
 > : Lớn hơn - Kiểm tra nếu giá trị bên trái lớn hơn giá trị ở bên phải
 < : Nhỏ hơn - Kiểm tra nếu giá trị bên trái nhỏ hơn giá trị ở bên phải
 >= : Lớn hơn hoặc bằng nhau
 <= : Nhỏ hơn hoặc bằng nhau

 Các phép toán điều kiện

 && : Điều kiện và - Trả về đúng nếu tất cả các biểu thức trả đúng
 || : Điều kiện hoặc - Trả về true nếu 1 có 1 biểu thức trả về true

 */

//import java.util.Scanner;
//
//public class Operators {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a, b;
//        System.out.println("Nhap a =");
//        a = sc.nextInt();
//        System.out.println("Nhap b =");
//        b = sc.nextInt();
//
//        // Xuat ket qua so sanh
//        System.out.println(a +" == "+b +" : "+ (a==b));
//        System.out.println(a +" != "+b +" : "+ (a!=b));
//        System.out.println(a +" > "+b +" : "+ ( a>b));
//        System.out.println(a +" < "+b +" : "+ ( a<b));
//        System.out.println(a +" >= "+b +" : "+ (a>=b));
//        System.out.println("-----");
//        System.out.println("Ca hai so la so chan: "+ (a%2==0 && b%2==0) );   // Biểu thức được viêt trong ngoặc
//        System.out.println("Co it nhat 1 so chan: "+ (a%2==0 || b%2==0));
//    }
//}


/**
 Bài 15: Toán tử điều kiện trong Java
 Toán tử 3 ngôi

 biểu thức ? giá trị trả về nếu true : Giá trị trả về nếu fale


 */

//import java.util.Scanner;
//
//public class Operators {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap a = ");
//        int a = sc.nextInt();
//
//        String ketQua = (a%2==0)?"số chẵn":"số lẻ";
//        System.out.println(a + " là "+ ketQua);
//    }
//}

/**
 Bài 16 : Lớp Math và các hàm toán học trong Java
Lớp Math cung cấp các phương thức hữu ích để thực hiện nhiều thao tác toán học khác nhau
Lớp Math tự động nhập vào trình ứng dụng mà không cấn import

Các hằng và các phương thức đều là static , được dùng trong tham chiếu bản thân lớp mà không cần khởi tạo đối tượng

Math có 2 trường tĩnh :
E : cơ số  logarit tự nhiên (2.71828)
PI : Giá trị đại diện cho n (3.14159)

 */

//import java.util.Scanner;
//
//public class Operators {
//    public static void main(String[] args) {
//        double a, b;  // Khai báo 2 biến a, b kiểu số thực double
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so a: ");
//        a = sc.nextDouble();   // Ví dụ a = 10
//        System.out.println("Nhap vao so b: ");
//        b = sc.nextDouble();  // Ví dụ b = 20
//
//        // Ham tri tuyet doi
//        System.out.println("|a|= " + Math.abs(a));  // 10
//
//        // Ham tim min
//        System.out.println("min(a, b) = " + Math.min(a, b));   // 10
//
//        // Ham tim max
//        System.out.println("max(a, b) = " + Math.max(a, b));   // 20
//
//        // Ham  ceil : Trả về số làm tròn lên
//        System.out.println("ceil(a) = " + Math.ceil(a));  // 10
//
//        // Ham  floor : Trả về số làm tròn xuống
//        System.out.println("floor(a) = " + Math.floor(a));  // 10
//
//        // Ham  can bac hai sqrt
//        System.out.println("sqrt(a) = " + Math.sqrt(a));  // 3.16227
//
//        // Ham tinh a^b
//        System.out.println("a^b = " + Math.pow(a, b));  // 1.0E20
//    }
//}

// Bài toán tính chu vi và diện tích hình tròn

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        r = sc.nextDouble();

        // Tinh chu vi
        chuVi = 2*Math.PI*r;
        System.out.println("Chu vi = "+ chuVi);
        System.out.println("Chu vi = "+ Math.round(chuVi));  // round : làm tròn chỉ lấy phần nguyên k  lấy sau dấu ,
        System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);   // Để làm tròn 2 số sau dấu ,

        // Tinh dien tich
        dienTich = Math.PI * Math.pow(r,2);
        System.out.println("Dien tich = " + dienTich);
        System.out.println("Dien tich = " + Math.round(dienTich));
        System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
    }
}