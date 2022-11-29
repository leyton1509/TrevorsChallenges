package ClassChallenge.Exercise4Library;

public class LibraryDriver {

    /**
     * The Driver to control the library exercise
     */
    public LibraryDriver(){
        // Creates a new author
        Author newAuthor = new Author("Sam Smith", "SamSmith@gmail.com", 'M');
        // Creates a new book with the author
        Book newBook = new Book("On the Wall", newAuthor, 100, 50);
        // Prints out the new book
        System.out.println(newBook);
    }
}
