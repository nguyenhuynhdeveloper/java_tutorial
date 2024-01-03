package Stack.Queue_Deque;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");

        danhSachSV.offerLast("TITV 4");  // bị nhét vào cuối cùng lấy ra cuối cùng nếu lấy từ phía đầu
        danhSachSV.offerFirst("TITV 0");


        // TITV 4 > TITV 2 > Nguyen Van B > Nguyen Van A > TITV 1 > TITV 0 // 0 được lấy ra đầu ttiên

        while(true) {
//            String ten = danhSachSV.poll();  // => lấy ra và xóa luôn
            String ten = danhSachSV.pollLast();  // => lấy ra và xóa luôn
            if(ten==null) {
                break;
            }
            //peek => lấy ra nhưng không xóa.
            System.out.println(ten);
        }

    }
}