package interface_doc;

// 1 Class Kế thừa implements lại 2 interface
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{
// Các method của MayTinhBoTuiInterface
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    // Các method của SapXepInterface
    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        double key;
        int i, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


}
