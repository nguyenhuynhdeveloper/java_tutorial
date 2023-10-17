public abstract class Hinh {
    protected ToaDo toaDo;

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public abstract double tinhDienTich();   // Phương thức trừu tượng : không có phần ruột phần triển khai

}