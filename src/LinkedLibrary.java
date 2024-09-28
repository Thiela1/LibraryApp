import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class LinkedLibrary {
    private List<book> books = new LinkedList<>();
    
    public void readBooksFromCSV(String fileName) {
        String line = "";
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Skip the header line if it exists
            br.readLine();

            // Read each line of the CSV file
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);

                int bookId = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                String isbn = data[3];
                int publicationYear = Integer.parseInt(data[4]);

                // Create a book object and add it to the list
                book newBook = new book(bookId, title, author, isbn, publicationYear);
                books.add(newBook);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<book> getBooks() {
        return books;
    }


    public String displayTopBooks() {
        // Display the first 10 books, or all if there are less than 10
        String temp = "";
        int limit = Math.min(10, books.size());
        for (int i = 0; i < limit; i++) {
            temp += "" + books.get(i).toString() + "\n";
        }
        return temp;
    }

    public book binarySearchById(int id) {
        books.sort(Comparator.comparingInt(book::getBookId));  // Sort by bookId
        int index = Collections.binarySearch(books, new book(id, "", "", "", 0), 
                Comparator.comparingInt(book::getBookId));
        
        if (index >= 0) {
            return books.get(index);
        }
        return null;  // Not found
    }

    public void sortByAuthor(boolean ascending) {
        // Sort by author name
        books.sort(Comparator.comparing(book::getAuthor));
        if (!ascending) {
            Collections.reverse(books);
        }
    }

    public void sortByPublicationYear(boolean ascending) {
        // Sort by publication year
        books.sort(Comparator.comparingInt(book::getPublicationYear));
        if (!ascending) {
            Collections.reverse(books);
        }
    }
}





