package array;
import java.util.Arrays;

// Bài 53: mảng và cách copy mảng trong lập trình Java
public class method {
// Làm việc với mảng phải xác định được nó có bao nhiêu phần tử
    public static void main(String[] args) {
        // Kiểu nguyên thuỷ
        int[] mang1 = {1,2, 3, 4};

        // Copy mảng cách 1
        int[] mang1_a = mang1;
        mang1_a[0] = 100;

        System.out.println("Mảng 1: " + Arrays.toString(mang1));
        System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));

        // Copy mảng cách 2: dùng hàm clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mảng 1_b" + Arrays.toString(mang1_b));

        // Copy mảng cách 3: Dfugn hàm System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0 , mang1_c, 0 , mang1.length);
        System.out.println("Mảng 1_c" + Arrays.toString(mang1_c));

        // Kiểu đối tượng
        String[] mang_doi_tuong = {"TITV",".vn" };

    }
}
