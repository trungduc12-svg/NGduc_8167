package O_Exercise1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();

        while (true) {
            System.out.println(
                    "\n1. Add new book"
                    + "\n2. Update book by ID"
                    + "\n3. Delete book by ID"
                    + "\n4. Find book by ID"
                    + "\n5. Display all books"
                    + "\n0. Exit"
            );
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. TextBook\n2. ReferenceBook");
                    int type = sc.nextInt();
                    sc.nextLine();
                    if (type == 1) {
                        list.addBook(new TextBook());
                    } else if (type == 2) {
                        list.addBook(new ReferenceBook());
                    }
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    list.updateBook(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    list.deleteBookById(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    Book b = list.findBookById(sc.nextLine());
                    if (b != null) {
                        b.displayBook();
                    }
                    break;
                case 5:
                    list.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
            }
        }
    }
}