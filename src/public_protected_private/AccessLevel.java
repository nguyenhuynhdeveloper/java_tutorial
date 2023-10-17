package public_protected_private;

/**
 Bài 48: Phân biệt điều kiển public . protected,  private
 Phạm vi biến được sủw dụng ở các khu vực nào
 private :chỉ có thể sử dụng biến ở bên trong class đó thôi

 public : class package subclass world  --> có thể dùng ở bất kỳ nơi nào
 protected : class Package subclass
 no modifier: class package
 private : class


 // tổng kết
 private : khuyến khích dùng để nếu thay đổi và lấy ra phải sử dụng getter và setter
 no modifier : Dùng trong 1 package
 protected : dùng trong cùng package + sub_class  dù khác package
 public : Ở đâu cũng có thể truy cập được

 */
public class AccessLevel {

}
