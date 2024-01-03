package Stack.Queue_Deque;



import java.util.LinkedList;
import java.util.Queue;
// Bài 63: Hiểu rõ về hàng đợi Queue và Deque trong Java
// Queue :

/**
 First in first out : vào trước ra trước
 */
public class ViDuQueue {
    public static void main(String[] args) {

        // LinkedList có thể sử dụng như 1 cái Queue hoặc có thể như 1 cái List
        // Nhưng thông thường sử dựng như 1 Array list hơn

        // LinkedList là 1 class trong Java mà nó implement cả Queue và cả List nhưng thường được thực hiện Queue nhiều hơn

        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");

        while(true) {
            String ten = danhSachSV.poll();  // => lấy ra và xóa luôn
            if(ten==null) {
                break;  // Thoát ra khỏi vòng lặp luôn
            }
            //peek => lấy ra nhưng không xóa.
            System.out.println(ten);  // Vào trước ra trước
        }

    }
}