package Lec8_Constructor;

public class Student5 {

    int id;
    String name;

    Student5(int id, String name) {
        id = id;
        name = name;

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan");
        s1.display();
        s2.display();
    }
}