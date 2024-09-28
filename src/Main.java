import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	String path = "books.csv"; // Path to books.csv
   	    Library library = new Library();
   	 
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            library.readBooksFromCSV(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("CSV file not found. Please check the file path.");
        }

        // Start the gui
        LibraryGui gui = new LibraryGui(library);
    }
}







