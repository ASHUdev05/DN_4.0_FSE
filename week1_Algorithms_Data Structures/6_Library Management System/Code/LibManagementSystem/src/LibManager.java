import java.util.List;

public class LibManager {
    private List<Book> books;

    public LibManager(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linSrchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Not found
    }

    public Book binSrchByTitle(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Book midBook = books.get(mid);

            if (midBook.title.equalsIgnoreCase(title)) {
                return midBook; // Found
            } else if (midBook.title.compareToIgnoreCase(title) < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return null; // Not found
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
