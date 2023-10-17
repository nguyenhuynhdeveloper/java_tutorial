package public_protected_private.code;

public class Sub_Infor extends  Infor{

    public  void method() {   // super chính là thằng class cha
        //        super.a  => Không thể truy cập được
        super.b = 6;  //=> Truy cập được vì chung 1 gói chứ không phải do là sub_class
        super.c = 3;
        super.d = 4;
    }
}
