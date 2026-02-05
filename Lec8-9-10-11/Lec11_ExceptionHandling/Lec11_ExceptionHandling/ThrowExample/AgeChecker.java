package Lec11_ExceptionHandling.ThrowExample;

public class AgeChecker {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be >= 18");
        }
        System.out.println("Age is valid");
    }
}