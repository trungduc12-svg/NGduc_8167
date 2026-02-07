package O_Exercise1;

import java.util.Scanner;

public class TextBook extends Book {

    private String status;

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter status: ");
        status = sc.nextLine();
    }

    @Override
    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            super.updateBook(id);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new status: ");
            status = sc.nextLine();
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + status);
    }
}