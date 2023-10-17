package public_protected_private.code;

public class ScopePackage {

    private Infor infor;
    public  void method() {
//        this.infor.a  => a không thể truy suất được , b c d thì có thể
this.infor.b = 4;  // Chung package thì có thể truy cập được
this.infor.c = 3; // protected : Cùng package nên truy cập được
        this.infor.d = 4 ;
    }
}
