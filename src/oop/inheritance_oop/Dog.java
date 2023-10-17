package oop.inheritance_oop;


public class Dog extends Animal{

    // Constructor của Dog
    public Dog() {
        super("Dog");  // Cố định thuộc tính name của Dog -- chứ k phải dùng tham số của constructor như bình thường
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void bark() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Tôi ăn xương!");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Meo Meo ");
    }
}