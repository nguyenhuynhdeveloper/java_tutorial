package arrayList.ArrayList_quanLyDanhSachSinhVien;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList();
    }

    public DanhSachSinhVien(ArrayList danhSach) {
        this.danhSach = danhSach;
    }

    // 1.	Thêm sinh viên vào danh sách.
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    //		2.	In danh sách sinh viên ra màn hình.
    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();   // Kiểm tra xem có rỗng hay không
    }

    //		4.	Lấy ra số lượng sinh viên trong danh sách.
    public int laySoLuongSinhVien() {
        return this.danhSach.size();  // Lấy ra số lượng phần từ
    }

    //		5.	Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);  // removeAll danh sách
    }

    //		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);   // Kiểm tra 1 phần tử có nằm trong ArrayList hay không - Class SinhVien mà chỉ có method compareTo là chưa đủ , cần có thêm equals
    }

    //		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);   // Xoá 1 phần tử ra khỏi ArrayList
    }

    //		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {    // Lặp qua từng phần tử của danhSach
            if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
                System.out.println(sinhVien);
            }
        }
    }
    	//	9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {  // Khi sử dụng tham số Comparator cần Override lại 1 method là compare
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                }else if(sv1.getDiemTrungBinh()> sv2.getDiemTrungBinh()){
                    return -1 ;
                }

                else {
                    return 0;  // Trường hợp bằng nhau
                }

            }
        });
    }
}