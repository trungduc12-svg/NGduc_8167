package Lec11_ExceptionHandling.MultipleCatch;

public class MultipleCatchExample {

    public static void test(int[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}