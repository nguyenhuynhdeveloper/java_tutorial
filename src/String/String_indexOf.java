package String;

// Bài 51: xử lý chuỗi trong lập trình Java

public class String_indexOf {
    public static void main(String[] args) {
        String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";
        char c1 = 'ô';
        // Hàm indexOf
        System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2));  // 0 : ngay vị trí đầu tiên đã tìm thấy rồi
        System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));  // - 1 : Không tìm thấy chuỗi trong chuỗi

        // Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2, 2));  // bắt đầu tìm từ vị trí số 2

        // Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1));
        System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1, 20));

        // Hàm lastIndexof => tìm kiếm từ phải sang trái
        System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: "+ s1.lastIndexOf(s2));  // 35: từ vị trí số 35 là tìm thấy xin chào :  Tìm kiếm từ phải quá trái

        // tenFile = "Bai tap.excel.lop12.xls';
    }
}