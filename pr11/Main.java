package pr11;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Майстер і Маргарита", "Михайло Булгаков");
        library.addBook("Злочин і кара", "Федір Достоєвський");
        library.addBook("Тіні забутих предків", "Михайло Коцюбинський");
        library.addBook("Кобзар", "Тарас Шевченко");

        library.displayBooks();

        library.sortBooksByTitle();
        System.out.println("Після сортування за назвою:");
        library.displayBooks();

        library.filterBooks(new BookFilter() {
            @Override
            public boolean filter(Library.Book book) {
                return book.author().contains("Михайло");
            }
        });
    }
}
