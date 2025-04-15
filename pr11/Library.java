package pr11;

import java.util.ArrayList;

import java.util.Comparator;

public class Library {

    private final ArrayList<Book> books = new ArrayList<>();

    public static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getInfo() {
            return "Книга: " + title + ", Автор: " + author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Бібліотека порожня.");
        } else {
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
        }
    }


    public void sortBooksByTitle() {
        books.sort(new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareToIgnoreCase(b2.getTitle());
            }
        });
    }


    interface BookFilter {
        boolean filter(Book book);
    }


    public void filterBooks(BookFilter filter) {
        for (Book book : books) {
            if (filter.filter(book)) {
                System.out.println(book.getInfo());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Майстер і Маргарита", "Михайло Булгаков");
        library.addBook("Фауст", "Йоганн Вольфганг фон Ґете");
        library.addBook("Гаррі Поттер", "Дж.К. Ролінґ");

        System.out.println("Список книги");
        library.displayBooks();
        System.out.println(" ");

        System.out.println("Після сортування за назвою:");
        System.out.println("Список книги");
        library.sortBooksByTitle();
        library.displayBooks();
        System.out.println(" ");

        System.out.println("Результат фільтрації");
        library.filterBooks(new BookFilter() {
            @Override
            public boolean filter(Book book) {
                return book.getAuthor().equalsIgnoreCase("Михайло Булгаков");
            }
        });
    }
}
