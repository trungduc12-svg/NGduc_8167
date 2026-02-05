package Lec11_ExceptionHandling.FinallyBlock;

public class FinallyExample {

    public static void test() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception");
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}