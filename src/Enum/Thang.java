package Enum;


public enum Thang {
    Tháng_một(31),
    Tháng_hai(29),
    Tháng_ba(31),
    Tháng_tư(30),
    Tháng_năm(31),
    Tháng_sáu(30),
    Tháng_bảy(31),
    Tháng_tám(31),
    Tháng_chín(30),
    Tháng_mười(31),
    Tháng_mười_một(30),  // Đây k phải thuộc tính mà là giá trị
    Tháng_mười_hai(31);   // Giá trị cuối cùng thêm dấy ;

    private final int soNgay;
    Thang(int soNgay){     // Constructor của Enum
        this.soNgay = soNgay;
    }

    public int getSoNgay() {   // Method getter của enum
        return soNgay;
    }

    public int soNgay() {   // Method của enum
        return soNgay;
    }
}
// enum có thể coi nó như 1 class luôn - Phía sau giá trị của từng enum có thể đưa giá trị cho nó trong cặp ngoặc
//  Những cái nào có số lượng giá trị hữu hạn có thể sử dụng dạng dư xliejeu enum
// Làm dự án lớn cần sử dụng nó để có thể sử dụng tránh lặp lại thao tác
