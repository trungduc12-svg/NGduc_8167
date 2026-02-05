package Lec_8.Constructor;

public class Student3 {

    int id;
    String name;

    Student3() {
        System.out.println("default constructor is invoked");
    }

    Student3(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student3 e1 = new Student3(111, "Karan");
        Student3 e2 = new Student3(222, "Aryan");
        Student3 e3 = new Student3(333, "Todaku");
        Student3 e4 = new Student3(444, "Kaja rio");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}