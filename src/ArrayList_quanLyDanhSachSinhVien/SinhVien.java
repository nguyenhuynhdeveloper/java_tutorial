package ArrayList_quanLyDanhSachSinhVien;



import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{   // implement Comparable để có thể so sánh -- và override lại method compareTo
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    // Một class có thể có nhiều constructor : ví dụ rỗng , 1 2 tham số , đủ tham số
    public SinhVien(String maSinhVien) {   // Constructor chỉ nhận mã sinh viên thôi
        this.maSinhVien = maSinhVien;
    }

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }



    @Override
    public String toString() {
        return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
                + ", diemTrungBinh=" + diemTrungBinh + "]";
    }

    // implement Comparable + Override lại method compareTo để có thể so sánh lớn hơn nhỏ hơn hoặc bằng
    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);   // So sánh dựa trên trường mã sinh viên
    }

    @Override
    public int hashCode() {
        return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
    }

    // Để so sánh 2 đối tượng có bằng nhau hay không sử dụng equals --- Phục vụ cho method contains trong ArrayList
    @Override
    public boolean equals(Object obj) {   // Viết lại hàm so sánh 2 đối tượng
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Objects.equals(this.maSinhVien, other.maSinhVien); // Nếu 2 mã sinh viên bằng nhau thì tính là bằng nhau
    }


}