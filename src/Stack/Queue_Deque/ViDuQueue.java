//package Stack.Queue_Deque;
//
//
//
//import java.util.LinkedList;
//import java.util.Queue;
//// Bài 63: Hiểu rõ về hàng đợi Queue và Deque trong Java
//public class ViDuQueue {
//    public static void main(String[] args) {
//        Queue danhSachSV = new LinkedList();
//
//        danhSachSV.offer("TITV 1");
//        danhSachSV.offer("Nguyen Van A");
//        danhSachSV.offer("Nguyen Van B");
//        danhSachSV.offer("TITV 2");
//
//        while(true) {
//            String ten = danhSachSV.poll();  // => lấy ra và xóa
//            if(ten==null) {
//                break;
//            }
//            //peek => lấy ra nhưng không xóa.
//            System.out.println(ten);
//        }
//
//    }
//}