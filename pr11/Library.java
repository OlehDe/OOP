package pr11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    // Внутрішній клас Book
        public record Book(String title, String author) {

        public void displayInfo() {
                System.out.println("Книга: " + title + ", Автор: " + author);
            }
        }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void displayBooks() {
        System.out.println("Список книг:");
        for (Book book : books) {
            book.displayInfo();
        }
        System.out.println();
    }

    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::title));
    }

    // Фільтрація книг
    public void filterBooks(BookFilter filter) {
        System.out.println("Результати фільтрації:");
        for (Book book : books) {
            if (filter.filter(book)) {
                book.displayInfo();
            }
        }
        System.out.println();
    }
}
