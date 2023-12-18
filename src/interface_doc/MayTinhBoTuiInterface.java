package interface_doc;


public interface MayTinhBoTuiInterface {
	public abstract double cong(double a, double b);   // Các phương thức cần được override lại ở các lớp extends lại interface

	public double tru(double a, double b);   // Có để abstract hay không để thì cũng tự động hiểu là abstract

	public double nhan(double a, double b);

	public double chia(double a, double b);
}