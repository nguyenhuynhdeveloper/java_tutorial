package quanLyMayTinh;


public class HangSanXuat {
    private String tenHangSanXuat;
    private QuocGia quocGia;

    public HangSanXuat(String tenHangSanXuat, QuocGia quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public String layTenQuocGia() {
        // TODO Auto-generated method stub
        return this.quocGia.getTenQuocGia();
    }


}