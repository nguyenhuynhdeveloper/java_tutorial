package generic;



public class TestBox2 {
    public static void main(String[] args) {
//        Box2 b1 = new Box2<Integer>(15);  // Phải nhận 1 kiểu đối tượng là Integer chứ k được để Int
        Box2 b1 = new Box2(15); // Có thể nó tự hiểu không cần viết kiểu dữ liệu
        System.out.println("Giá trị: "+ b1.getValue());

        Box2 b2 = new Box2("Hello TITV!");
        System.out.println("Giá trị: "+ b2.getValue());

        Box2 b3 = new Box2(15.5);
        System.out.println("Giá trị: "+ b3.getValue());

    }
}