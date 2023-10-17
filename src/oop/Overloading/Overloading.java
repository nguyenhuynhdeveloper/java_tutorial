package oop.Overloading;

/**
 Bài 43: Nạp chồng phương thức Overloading trong Java
 Overloading là  việc tạo ra nhiều phương thức trong một lớp có chung tên nhưng khác tham số truyền vào
 Lý do: Tăng tính sử dụng cho các phương thức bên trong 1 lớp
 chỉ cần cùng Tên và các tham số của method khác kiều đi là được

 Phân biệt : Ghi đè phương thức và nạp chồng phương thức

 Override :
 - Cung cấp cài đặt cụ thể cho phương thức được khai báo ở lớp cha
 - Ghi đè phương thức được xảy ra trong 2 class có quan hệ kế thừa
 - Ghi đè phương thức thì tham số phải giống nhau
 - Ghi đè phương thức là ví dụ về đa hình lúc run time
 - Giá trị trả về phải giống nhau

 Overloading :
 - Được sử dụng để giúp code của chương trình dễ đọc hơn
 - Nạp chông được thực hiện bên trong 1 class
 - Nạp chồng thì tham số phải khác nhau
 - Nạp chồng là ví dụ về đa hình lúc biên dịch
 - Nạp chồng không thể được thực hiện khi chỉ thay đổi kiểu giá trị trả về của phương thức . Tham số Phải khác nhau
 */
public class Overloading {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("min(5,5) = "+ mm.timMin(5, 5));
        System.out.println("min(5.5, 6.0) = "+ mm.timMin(5.5, 6.0));
        System.out.println("tinhTong(5,6)= "+mm.tinhTong(5.0, 6.0));
        double arr[] = new double[] {1,2,3,4,5};
        System.out.println("tinhTong(arr)= "+mm.tinhTong(arr));
    }
}
