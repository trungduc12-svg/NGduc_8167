package Lec10_Abstraction.MultiInheritance;

public class C implements A, B {

    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}