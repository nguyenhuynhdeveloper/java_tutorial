package oop;


// Bài 39: Khái niệm về kế thừa trong lập trình Java

public class inheritance {
    public static void main(String[] args) {
        System.out.println("Kiểm tra");
        ConNguoi cn = new ConNguoi("TITV" , 2021);

//		cn.an();
//		cn.uong();
//		cn.ngu();

        HocSinh hs = new HocSinh("TITV", 2021, "Lớp 1", "Trường 1");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
        hs.setTenLop("Công nghệ thông tin ");
        System.out.println("Tên lớp của học sinh: " +hs.getTenLop());;
    }
}