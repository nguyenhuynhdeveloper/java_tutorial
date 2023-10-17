package oop.Overloading;

public class MyMath {

    // Không viết constructor là mặc định có 1 rỗng không có tham số
    public int timMin(int a, int b) {
        if (a < b  ){
//            System.out.println(a);
            return a;
        }
        else {
            return b;
        }

    }


    public double timMin(double a, double b) {
        if (a < b  ){

            return  a;
        }
        else {
            return b;
        }

    }

    public  double tinhTong(double a, double b) {
        return  a +b;
    }
    public double tinhTong (double[] arr ) {
        double tong = 0 ;
        for (int i = 0 ; i < arr.length ; i++) {
            tong +=arr[i];
        }
        return  tong ;
    }
}

