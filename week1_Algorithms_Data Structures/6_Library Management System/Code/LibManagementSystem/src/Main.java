import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibManager libManager = new LibManager(List.of(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell")
        ));

        libManager.printBooks();
        System.out.println("Searching for '1984' using linear search:");
        Book foundBook = libManager.linSrchByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Searching for 'The Great Gatsby' using binary search:");
        foundBook = libManager.binSrchByTitle("The Great Gatsby");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}