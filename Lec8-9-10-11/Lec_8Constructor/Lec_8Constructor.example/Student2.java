package Lec_8.Constructor;

public class Student2 {

    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student2 s1 = new Student2(111, "Karan");
        Student2 s2 = new Student2(321, "Aryan");
        s1.display();
        s2.display();
    }
}