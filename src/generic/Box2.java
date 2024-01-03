package generic;


// Sử dụng Generic ký hiệu kiểu dữ liệu sẽ nhận của Class là T
public class Box2<T> {
    private T value;

    // Constructor có 1 tham số có kiểu dữ liệu là T
    public Box2(T value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }


}