package O_Exercise1;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tax: ");
        tax = sc.nextDouble();
    }

    @Override
    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            super.updateBook(id);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new tax: ");
            tax = sc.nextDouble();
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + tax);
    }
}