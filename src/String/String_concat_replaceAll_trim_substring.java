package String;
// Bài 52: Xử lý chuỗi trong lập trình Java- 4
// Cắt chuỗi , nối chuỗi và thay thế và chuyển đổi



public class String_concat_replaceAll_trim_substring {
    public static void main(String[] args) {
        String s1 = "tItv";
        String s2 = ".Vn";

        String s3 = s1 + s2;
        // Hàm concat => nối chuỗi
        String s4 = s1.concat(s2);

        System.out.println("s3= "+ s3);  // tItv.Vn
        System.out.println("s4= "+ s4);  // tItv.Vn

        System.out.println("s1= "+ s1);   // s1, s2 gốc không thay đổi s
        System.out.println("s2= "+ s2);

        // Hàm replaceAll => thay thế : Biến đổi chuỗi thành 1 chuỗi khác : nhưng không làm thay đổi chuỗi gốc
        String s5 = "Tung.vn";
        String s6 = s5.replaceAll("Tung","TITV");
        System.out.println("s6 = " + s6);

        System.out.println("s5 = " + s5);  // s5 gốc không thay đổi

        // toLowerCase => chuyển về viết thường
        // toUpperCase => chuyển về viết hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();

        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        // trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
        String s9 = "  Xin chào các bạn, mình là TITV.vn    ";
        System.out.println(s9.trim());


        /// subString => cắt chuỗi con
        String s10 = "0123456789";
        String s11 = s10.substring(3);   // Cắt chuỗi từ vị trí thứ [0, 3)
        String s12 = s10.substring(3, 5); // Cắt chuỗi từ vị trí thứ [3, 5)
        System.out.println("s11 = " + s11);
        System.out.println("s12 = " + s12);

    }
}