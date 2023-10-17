package com.example.javatutorial;

/**
 Bài 26: Cách sử dụng câu lệnh break , continue , return trong Java

 Câu lệnh rẽ nhánh
 Các loại câu lệnh rẽ nhánh thường gặp :
 -break
 -continue
 -return

 continue và break có thể cùng với label hoặc không
 -label: dùng để chỉ định chỗ cho các câu lệnh continue và break

 ** Lệnh break có 2 dạng:
  - unlabeled form : dùng đề thoát khỏi vòng lặp như switch , for, while,   do...while
 - labeled form : di chuyển tới vùng đặt label

 ** Lệnh continue : Không dừng vòng lặp mà bỏ qua các câu lệnh phía bên dưới
  Dùng để nhảy qua skip vòng lặp : for, while , do...while
 Lệnh continue cũng có 2 dạng:
 - unlabeled form
 - labeled form

 ** Lệnh return : có 2 dạng -- Sẽ kết thúc luôn 1 hàm - ngưng luôn phương thức
  - Trả về 1 giá trị
    return 10;
    Giá trij trả về phải phù hợp với kiểu trả về của hàm
 - Không trả về giá trị nào cả :
    return;
    Kiểu trả về của hàm phải là void

 */


public class break_continue_return {
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break;  // Chỉ có thể thoát 1 vòng lặp trực tiếp chứa nó
//			}
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//	}

//	public static void main(String[] args) {
//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {   // outer : đây là gắn label cho vòng lặp đó
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer;   // Thoát ra khỏi vòng lặp có label kà outer
//			}
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
//	}

    //// Câu lệnh continue
//	public static void main(String[] args) {
//		int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}
//	}

//	public static void main(String[] args) {
//		outer: for(int i=2; i<=9; i++) {
//			for(int j=1; j<=10; j++) {
//				if(j>5)
//					continue outer;   // bỏ qua các  cửu chương từ 6 -> 9  thành bảng năm chương
//				System.out.println(i+" x "+j +" = "+(i*j));
//			}
//			System.out.println("---");
//		}
//	}
    public static void main(String[] args) {
        for(int i=2; i<=9; i++) {
            for(int j=1; j<=10; j++) {
                if(j>5)
                    return;   // Chỉ có từ 2*1 tới 2*5
                System.out.println(i+" x "+j +" = "+(i*j));
            }
            System.out.println("---");
        }
        System.out.println("ABC");
    }
}
