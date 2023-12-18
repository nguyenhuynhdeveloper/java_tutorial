package Enum;


/**
 Bài 59: Kiểu dữ liệu enum trong lập trình Java
 Sử dụng cho các biến mà không thay đổi giá trị nhiều

 */




public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toán Lý Hoa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Văn Sử Địa");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Lý Hóa Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday, "Tin hoc - GDCD - Thể dục");
        System.out.println(tkb_t5);

        int x = Thang.Tháng_một.soNgay();
        System.out.println(x);
    }
}