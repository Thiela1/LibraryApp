public class book {
	    private int bookId;
	    private String title;
	    private String author;
	    private String isbn;
	    private int publicationYear;

	    public book(int bookId, String title, String author, String isbn, int publicationYear) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.publicationYear = publicationYear;
	    }

	    // Getters and Setters
	    public int getBookId() {
	        return bookId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public int getPublicationYear() {
	        return publicationYear;
	    }

	    @Override
	    public String toString() {
	        return bookId + ", " + title + ", " + author + ", " + isbn + ", " + publicationYear;
	    }
	}
