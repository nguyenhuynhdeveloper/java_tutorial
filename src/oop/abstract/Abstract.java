public class Abstract {

    /**
     Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng
     Lớp trừu tượng không thể được dùng để tạo ra các đối tượng như những lớp bình thường khác

    Lớp trừu tượng -  abstract trong Java
     Một lớp được khai báo với từ kháo abstract thì đó là lớp trừu tượng , Nó cần được kế thừa và phương thức của nó được triển khai
     Nó không thể được khởi tạo

     Phương thức trừu tượng - abstract trong Java
     Một phương thức được khai báo là abstract và không có trình triển khai thì đó là phương thức trừu tượng
     Phương thức sẽ được triển khai trong các lớp con

     public abstract class LopTruuTuong{
     public abstract void phuongThucTruuTuong
     }
     */
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5, 5);
        ToaDo td2 = new ToaDo(7, 9);
        ToaDo td3 = new ToaDo(12, 1);

//		Hinh h = new Hinh(td1); => lỗi biên dịch

        Hinh h1 = new Diem(td1);  // Diem kế thừa từ class abstract Hinh

        Hinh h2 = new HinhTron(td2, 10);

        Hinh h3 = new HinhChuNhat(td3, 5, 10);

        System.out.println("DT1: "+h1.tinhDienTich());
        System.out.println("DT2: "+h2.tinhDienTich());
        System.out.println("DT3: "+h3.tinhDienTich());
        System.out.println("abc");
    }
}