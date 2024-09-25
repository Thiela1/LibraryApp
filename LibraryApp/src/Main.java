import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.readBooksFromCSV("books.csv");  // Load the books from the CSV file

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display top 10 books");
            System.out.println("2. Search by book ID");
            System.out.println("3. Sort by author (ascending)");
            System.out.println("4. Sort by publication year (ascending)");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Display top 10 books from the library
                    library.displayTopBooks();
                    break;
                case 2:
                    // Search for a book by its ID
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    book foundBook = library.binarySearchById(id);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.toString());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    // Sort books by author in ascending order and display the top 10
                    library.sortByAuthor(true);  // true indicates ascending
                    library.displayTopBooks();
                    break;
                case 4:
                    // Sort books by publication year in ascending order and display the top 10
                    library.sortByPublicationYear(true);  // true indicates ascending
                    library.displayTopBooks();
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }
}







