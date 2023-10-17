package public_protected_private.test;

import public_protected_private.code.Infor;

public class Test {
    private Infor infor;
    public void method () {
//        this.infor.a  => Không thể truy cập được thuộc tính a của đối tượng dì là private
//        this.infor.b  => Khác package cũng k thể truy cập được
        // this.infor.c  => Khác package không thể truy cập được
        this.infor.d = 4 ;  // public có thể truy cập ở bất cứ đâu
    }
}
