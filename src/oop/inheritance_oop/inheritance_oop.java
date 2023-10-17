package oop.inheritance_oop;

/**
 Bài 40: Các dạng kế thừa trong Java
  Có 3 dạng kế thừa
 1. single: Đơn kế thừa - Class B kế thừa từ Class A
 2. Multilevel: Kế thừa nhiều tầng - Class C kế thừa tử Class B Kế thừa từ Class A
 3. Hierachical: Kế thừa thứ bậc - Nhiều Class khác nhau cùng kế thừa từ 1 Class A
 */

/**
 Bài 41 : Vì sao không có đa kế thừa trong Java
 Override lại các method của Class cha
 Trong Java không có đa kế thừa
 Vì nếu 1 Class được kế thừa từ nhiều Class -- mà các class đó cùng có 1 method A -> Thì class con sẽ sử dụng method của class nào

 */

/**
 Bài 42: Ghi đè phương thức - Override trong lập trình Java
 Có thể class con các method không thể nào giống hoàn toàn class cha được nên cần ghi đè lại để chính xác
 Quy tắc:
 - Class con và Class cha có mối quan hệ thừa.
 - Phương thức trong lớp con phải có tên giống với lớp cha
 - Phương thức trong lớp con phải có tham số giống với lớp cha
 */


public class inheritance_oop {
    public static void main(String[] args) {


        // Dog đơn kế thừa từ Animal
        Dog d = new Dog();
        d.eat();
        d.bark();
        d.makeSound();
        d.sleep();
        System.out.println("Name Dog: " + d.getName());

        // BabyDog là kế thừa nhiều tầng Animal
        System.out.println("--------------");
        BabyDog bbd = new BabyDog();
        bbd.eat();     // Method kế thừa từ Animal
        bbd.bark();    // Method kế thừa từ Dog
        bbd.weep();    // Method của bản thân BaByDog

        // Dog, Cat, Bird là kế thừa thứ bậc từ Animal
        Cat c = new Cat();
        c.eat();
        c.meow();
        c.makeSound();
        c.sleep();

        Bird b = new Bird();
        b.eat();
        b.fly();
        b.makeSound();
        b.sleep();



    }
}

