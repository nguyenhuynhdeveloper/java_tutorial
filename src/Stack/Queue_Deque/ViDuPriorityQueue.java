//package Stack.Queue_Deque;
//
//
//
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class ViDuPriorityQueue {
//    public static void main(String[] args) {
//        Queue danhSachSV = new PriorityQueue();
//
//        danhSachSV.offer("TITV 1");
//        danhSachSV.offer("Nguyen Van B");
//        danhSachSV.offer("Nguyen Van A");
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
//    }
//}