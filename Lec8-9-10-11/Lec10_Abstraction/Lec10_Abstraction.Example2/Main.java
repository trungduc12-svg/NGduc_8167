package Lec10_Abstraction;

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Rectangle r = new Rectangle(4, 5);
        r.display();
        System.out.println("Area: " + r.area());

        Bird b = new Bird();
        b.fly();

        C c = new C();
        c.methodA();
        c.methodB();
    }
}