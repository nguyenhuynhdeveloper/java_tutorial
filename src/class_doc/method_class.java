package class_doc;

/**
 Bài 31: Hiểu rõ về phương thức trong lập trình Java

 */
//public class method_class {
//    public static void main(String[] args) {
// HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
//
//        HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
//        System.out.println("Tong tien Hd: " + hd.tinhTongTien());
//        System.out.println("Tong tien Hd2: " + hd2.tinhTongTien());
//        System.out.println("Kiem tra khoi luong > 2kg "+ hd.kiemTraKhoiLuongLonHon(2));
//        System.out.println("Kiem tra khoi luong > 1kg "+ hd.kiemTraKhoiLuongLonHon(1));
//        System.out.println("Kiem tra tong tien > 500k "+ hd.kiemTraTongTienLonHon500K());
//        System.out.println("Giam gia cua Hd: "+ hd.giamGia(10));
//        System.out.println("Giam gia cua Hd2: "+ hd2.giamGia(10));
//        System.out.println("Sau giam gia cua Hd: "+ hd.giaSauKhiGiam(10));
//        System.out.println("Sau giam gia cua Hd2: "+ hd2.giaSauKhiGiam(10));
//    }
//}

/**
 Bài 32: Hiểu rõ phương thức GET và SET
 */

//public  class method_class {
//    public static void main(String[] args) {
//        MyDate32 md = new MyDate32(31, 1, 2021);
//
//        System.out.println("Day = " + md.getDay());
//        md.setDay(35);
//        System.out.println("Day = " + md.getDay());
//        md.setDay(30);
//        System.out.println("Day = "+ md.getDay());
//
//        System.out.println("Month = "+ md.getMonth());
//        md.setMonth(13);
//        System.out.println("Month = " + md.getMonth());
//        md.setMonth(5);
//        System.out.println("Month = "+ md.getMonth());
//    }
//}


/**
 Bài 33: Hiểu rõ về phương thức toString trong lập trình Java
 Bài 34: Hiểu rõ phương thức so sánh equals và hascode
 */


public class method_class {
    public static void main(String[] args) {
        MyDate32 md1 = new MyDate32(15, 5, 2025);
        MyDate32 md2 = new MyDate32(11, 1, 2021);
        MyDate32 md3 = new MyDate32(30, 3, 2030);

        System.out.println(md1); // 15/5/2021
        System.out.println(md2);  // Nếu mà k có phương thức toString thì sẽ chỉ in dãy số chung chung - Không hiểu gì cả
        System.out.println(md3);

        		int a = 5;
		int b = 6;
		if(a==b) {
			System.out.println("a = b");
		}else {
			System.out.println("a != b");
		}

		if(md1==md3) {
			System.out.println("md1 == md3");
		}else {
			System.out.println("md1 != md3");
		}

		System.out.println("md1 so sanh bang md2: "
                + md1.equals(md2));

                System.out.println("md1 so sanh bang md3: "
                + md1.equals(md3));

        System.out.println("Hashcode md1 " + md1.hashCode());
        System.out.println("Hashcode md2 " + md2.hashCode());
        System.out.println("Hashcode md3 " + md3.hashCode());


    }


}