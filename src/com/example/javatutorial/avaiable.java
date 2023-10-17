/**
 // Bài 4 :Cách khai báo biến trong Java
 // Video youtube TITV :
 // https://www.youtube.com/watch?v=zEbraQ5vIaU&list=PLyxSzL3F748401hWFgJ8gKMnN6MM8QQ7F&index=4
 Biến là 1 vùng để chứa giá trị
 Giá trị của biến có thể thay đổi được
 Muốn sử dụng biến  phải khai báo và định nghĩa kiểu dữ liệu cho nó
 // Quy tắc đặt tên biến
 Tên biến chỉ có thể bắt đầu bằng chữ cái - $ - _
 Tên biến có phân biệt viết hoa viết thường
 Không sử dụng dấu cách trong biến
 Không đặt tên biến trùng với các từ khoá trong java
 abstract
 assert
 boolean
 break
 byte
 case
 catch
 char
 class
 const
 continue
 default
 do
 double
 else
 enum
 extends
 false
 final
 finally
 float
 for
 goto
 if
 implements
 import
 instanceof
 int
 interface
 long
 native
 new
 null
 package
 private
 protected
 public
 return
 short
 static
 strictfp
 String
 super
 switch
 synchoronized
 this
 throw
 throws
 transient
 true
 try
 void
 volatile
 while


 Có thể gán giá trị cho biến bằng dấu = ngay khi khai báo biến
 String name = "Huỳnh"


 */

package com.example.javatutorial;

//public class Avaiable {
//    public static void main(String[] args) {
//        String thongbao = "Xin chào!";
//        String hoVaTen = "Le Nhat Tung";
//        String tensach;
//        tensach = "Lap trình Java ";
//
//        System.out.println("Thông báo : " + thongbao);
//        System.out.println("Thông báo : " + hoVaTen);
//        System.out.println("Thông báo : " + tensach);
//    }
//}


// Bài 5 : Kiểu dữ liệu trong Java

/**
 Có 2 kiểu dữ liệu trong Java
 1. Kiểu dữ liệu nguyên thuỷ : Viết thường chữ cái đầu tiên
 byte
 short
 int
 long
 float : số thực
 double : Số thực
 boolean : true/false
 char : Ký tự

 2. Kiểu dữ liệu đối tượng : Viết hoa chữ cái đầu tiên
 String : Chuỗi
 Array: Mảng
 Double : Số thực
 ...

 char : ''
 String : ""
 */

//public class Avaiable {
//    public static void main(String[] args) {
//        String tenSach = "Lap trinh Java";
//        int namXuatBan = 2021;
//        double giaTien = 15.5;
//        boolean conSach = true;
//        char maKho = 'M';
//        System.out.println("Ten sach: "+ tenSach);
//        System.out.println("Nam: "+ namXuatBan);
//        System.out.println("Gia: "+ giaTien);
//        System.out.println("Con sach: "+ conSach);
//        System.out.println("Ma kho: "+ maKho);
//    }
//}


//BÀi 6: Hằng số  trong Java
// Khai báo hằng số thêm final trước kiểu dữ liệu
// Khi đã khai báo là Hằng số thì không thể thay đổi giá trị của hằng số

//public class Avaiable {
//    public static void main(String[] args) {
//        final int x = 100;
//        System.out.println("x = "+ x);
//        // x = 50; => sẽ bị báo lỗi khi cố tình thay đổi giá trị của hằng số
//    }
//}

// Bài 7 : Cách ghi chú trong Java

///**
// * @author windows10
// */
//public class Avaiable {
//    /**
//     * @param args: tham số đầu vào
//     */
//    public static void main(String[] args) {
//        // Khai báo biến
//        int x = 10;
//
//        /*
//         * Xuất số x ra màn hình
//         * Sử dụng hàm sysout
//         */
//        System.out.println(x);
//    }
//}


// Bài 8: Cách kiểm tra và xử lý lỗi biên dịch
// Khi thấy lỗi sẽ thấy file bị báo đỏ ,  chú ý ở đầu đòng bên tay trái hoặc tay phải

// Bài 9 : Cách nhập dữ liệu từ bàn phím trong Java

/**
 Cần thêm 1 class là Scanner : đã có sẵn trong JDK


 */


//import java.util.Scanner;
//
//public class Avaiable {
//    public static void main(String[] args) {
//        // Khai báo biến để đọc dữ liệu
//        Scanner sc = new Scanner(System.in);
//
//        // Một số ví dụ
//        System.out.println("Nhap vao ho va ten: ");
//        String hoVaTen = sc.nextLine();  // Nhập giá trị từ bàn phím
//
//        System.out.println("Nhap ma sinh vien: ");
//        long maSinhVien = sc.nextLong();   // Giá trị nhập vào là dạng số kiểu long
//
//        System.out.println("Nhap vao diem thi: ");
//        float diemThi = sc.nextFloat();  // Giá trị nhập vào là dạng số thực
//
//        System.out.println("------");
//        System.out.println("Ho va ten: "+ hoVaTen);
//        System.out.println("Ma sinh vien: "+ maSinhVien);
//        System.out.println("Diem thi: "+ diemThi);
//    }
//}

// Bài 10 : Chuyển đổi kiểu dữ liệu trong Java
/**
 Có 2 dạng ép kiểu
 1. Ép kiểu ngầm định
 2. Ép kiểu tường minh

 Ép kiểu ngầm định
 Gán cho 1 biến của 1 kiểu khác thì tự động chuyển kiểu
 Điều kiện : Hai kiểu phải tương thích
 Kiểu đích phải lớn hơn kiểu nguồn

 byte -> short, int , long , flooat, double
 short -> int, long, float, double
 int -> long, float, double
 long -> float, double

 Ép kiểu tường minh
 Khi cần chuyển sang kiểu có độ chính xác cao hơn
 float a = 21.3456f;
 int b = (int) a + 5;


 Có 3 dạng chuyển đối kiểu dữ liệu
 1. Chuyển đổi cho các kiểu dữ liệu cơ bản
 (New Type) value;
 2. Chuyển đổi các kiểu cho các đối tượng : các lớp chuyển đổi phải kế thừa nhau
 (New Class) object;
 3. chuyển đổi cho các kiểu dữ liệu cơ bản sang đối tượng hoặc ngược lại
 Chỉ chuyển đổi giữa các đối tượng có sẵn trong gói java.lang tương ứng với các dữ liệu nguyên thuỷ

 int intObject = new Integer(32);
 */


public class avaiable {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        System.out.println("a = "+ a);  // 100
        System.out.println("b = "+ b);  // 2

        // Ep kieu ngam dinh
        float c = a; // Kiểu đích phải lớn hơn kiểu nguồn
        float d = b;

        System.out.println("c = "+ c);  // 100.0 biến c là kiểu float
        System.out.println("d = "+ d);

        // Ep kieu tuong minh : int < float nên cần phải Ép kiểu tường minh
        float e = 3.5f;
        float f = 9.5f;
        System.out.println("e = "+ e); // 3.5 Biến e kiểu float
        System.out.println("f = "+ f); // 9.5

        int g = (int)e; // Ép kiểu biến e từ float -> int
        int h = (int)f;
        System.out.println("g = "+ g);  // 3 Biến g kiểu int
        System.out.println("h = "+ h);  // 9 Biến h kiểu int

        // Ep kieu giua bien nguyen thuy va doi tuong
        int x = new Integer(32);   // Ép kiểu từ giá trị đối tượng -> nguyên thuỷ
        System.out.println("x = "+x);  // 32
    }
}