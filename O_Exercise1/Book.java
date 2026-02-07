package O_Exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {

    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;

    public Book() {
    }

    public Book(String bookId, String publisher, Date entryDate,
            double unitPrice, double quantity) {
        this.bookId = bookId;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public void addBook() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter book ID: ");
            bookId = sc.nextLine();
            System.out.print("Enter publisher: ");
            publisher = sc.nextLine();
            System.out.print("Enter unit price: ");
            unitPrice = sc.nextDouble();
            System.out.print("Enter quantity: ");
            quantity = sc.nextDouble();
            sc.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter entry date (dd/MM/yyyy): ");
            entryDate = sdf.parse(sc.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        }
    }

    public void updateBook(String id) {
        if (bookId.equals(id)) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter publisher: ");
                publisher = sc.nextLine();
                System.out.print("Enter unit price: ");
                unitPrice = sc.nextDouble();
                System.out.print("Enter quantity: ");
                quantity = sc.nextDouble();
                sc.nextLine();

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Enter entry date: ");
                entryDate = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format!");
            }
        }
    }

    public void displayBook() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(
                "ID: " + bookId
                + ", Publisher: " + publisher
                + ", Entry Date: " + sdf.format(entryDate)
                + ", Unit Price: " + unitPrice
                + ", Quantity: " + quantity
        );
    }
}