package oop.inheritance_oop;


public class Bird extends Animal{

    public Bird() {
        super("Bird");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(" Tôi ăn sâu!");
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Líu lo");
    }
}