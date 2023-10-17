package oop.inheritance_oop;


public class Animal {
    protected String name;  // Các Class nằm bên dưới thì sử dụng được - các Class khác không thể sử dụng được

    // Constructor của Animals : Có 1 thuộc tính là Tên của động vật
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("I'm eating");
        System.out.println("Tôi đang ăn .... ");
    }
    public void makeSound() {
        System.out.println("................");
    }
    public void sleep() {
        System.out.println("Zzzzzzzzzzzzzzzz");
    }

}