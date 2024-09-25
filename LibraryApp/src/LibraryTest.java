import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
       
        Library library = new Library();

        // Manually add sample books to the library
        List<book> sampleBooks = new ArrayList<>();
        sampleBooks.add(new book(1, "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925));
        sampleBooks.add(new book(2, "1984", "George Orwell", "9780451524935", 1949));
        sampleBooks.add(new book(3, "To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960));
        sampleBooks.add(new book(4, "Moby-Dick", "Herman Melville", "9781503280786", 1851));
        sampleBooks.add(new book(5, "Pride and Prejudice", "Jane Austen", "9781503290563", 1813));
        sampleBooks.add(new book(6, "War and Peace", "Leo Tolstoy", "9781420954300", 1869));
        sampleBooks.add(new book(7, "The Odyssey", "Homer", "9780143039952", -800));
        sampleBooks.add(new book(8, "The Catcher in the Rye", "J.D. Salinger", "9780316769488", 1951));
        sampleBooks.add(new book(9, "The Hobbit", "J.R.R. Tolkien", "9780547928227", 1937));
        sampleBooks.add(new book(10, "Fahrenheit 451", "Ray Bradbury", "9781451673319", 1953));
        sampleBooks.add(new book(11, "Brave New World", "Aldous Huxley", "9780060850524", 1932));

        // Add sample books to the library's list
        for (book book : sampleBooks) {
            library.getBooks().add(book);
        }

        // Test: Display top 10 books
        System.out.println("Top 10 Books:");
        library.displayTopBooks();

        // Test: Search for a book by ID
        int searchId = 1; // Example book ID to search for
        book foundBook = library.binarySearchById(searchId);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Test: Sort by author (ascending) and display top 10
        library.sortByAuthor(true);
        System.out.println("\nBooks sorted by author (ascending):");
        library.displayTopBooks();

        // Test: Sort by publication year (ascending) and display top 10
        library.sortByPublicationYear(true);
        System.out.println("\nBooks sorted by publication year (ascending):");
        library.displayTopBooks();

        // Exit
        System.out.println("Exiting test...");
    }
}



