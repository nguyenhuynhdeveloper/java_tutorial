package generic;


// Box mà không sử dụng Generic
public class Box {
    private int value;

    // Constructor của class Box
    public Box(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}