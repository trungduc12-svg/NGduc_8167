package O_Exercise1;

import java.util.ArrayList;

public class BookList {

    private final ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
    }

    public void updateBook(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equals(id)) {
                b.updateBook(id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteBookById(String id) {
        Book b = findBookById(id);
        if (b != null) {
            bookList.remove(b);
            System.out.println("Deleted successfully.");
        }
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equals(id)) {
                return b;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            for (Book b : bookList) {
                b.displayBook();
            }
        }
    }
}