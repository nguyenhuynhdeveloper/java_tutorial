package public_protected_private.test;

import public_protected_private.code.Infor;

public class Sub_Infor_orther_package extends  Infor{
    public Infor infor ;
    public void method() {
//        super.a  => Không truy cập được
        //super.b  => Không truy cập được vì khác gói - dù là sub class
        super.c = 4; // Là sub class nên truy cập được
        super.d = 4; // Public nên ở đâu cũng truy cập được
    }
}
