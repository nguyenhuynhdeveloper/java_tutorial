package interface_doc;

public interface SapXepInterface {  // interface có 2 method
    public void sapXepTang(double[] arr);  // Không được hiện thực , những claas nào kế thừa thì phải tự viết lại method này
    public void sapXepGiam(double[] arr);
}