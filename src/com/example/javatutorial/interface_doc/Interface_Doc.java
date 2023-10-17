package com.example.javatutorial.interface_doc;

import java.util.Iterator;

/**
 Bài 46 : Hiểu rõ về interface trong lập trình Java

 - Interface trong java là 1 bản thiết kế của một lớp
 - Nó chỉ có các phương thức trừu tượng và các hằng số
 - Tất cả các hằng số được mặc định ở djang public static final
 - Tất cả các phương thức là ở dạng public -- kể cả có đặt là dạng gì cũng chỉ hiểu là public
 - Tương tự như lớp abstract, nó không thể được khởi tạp thành đối tượng

 Mục đích
 - Để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java


 Lưu ý khi sử dụng:
 - Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm
 - Một interface có thể kế thừa từ một interface khác , tương tự cách 1 lớp có thể kế thừa từ lớp khác

 ví dụ :
 a, Tạo oả Interface có tên là MayTinhBotuiInterface , có các phương thức mặd định lằ cộng, trừ , nhân chia hai sôs thực
 Xây dựng các lớp hiện thực hoá Interface bên trên có tên là : MayTinhCasioFX500 và MayTinhVinaCal500MS
  b, Tạo ra Interface có tên là SapXepInterface , có các phương thức sắp xếp tăng và sắp xếp giảm một mảng số nguyên
 Xây dựng các lớp hiện thực hoá Interface bên trên có tên là: SapXepChen và SapXepChon

 c, Xây dựng lớp hiện thực cả hai Interface ở câu a và câu b có tên là PhanMemMayTinhBoTui
 */

public class Interface_Doc {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5+3="+ mfx500.cong(5, 3));
        System.out.println("4*5="+ mvn500.nhan(4, 5));
        System.out.println("4/0="+ mvn500.chia(4, 0));

        System.out.println("Test câu b: ");

        double[] arr = new double[] {5,1,3,4,5,8,0};
        double[] arr2 = new double[] {6,2,7,9,2,4,5};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        sxchen.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");  // print : Là in nhưng không xuống dòng như println
        }
        System.out.println();

        sxchon.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        // PhanMemMayTinh kế thừa cùng lúc 2 interface
        System.out.println("Test câu c:");
        PhanMemMayTinh pmmt =new PhanMemMayTinh();
        System.out.println("3+5=" + pmmt.cong(3, 5));
        double[] arr3 = new double[] {6,2,7,9,2,4,5};
        pmmt.sapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
