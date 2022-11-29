package ClassChallenge.Exercise4Library;

public class LibraryDriver {

    public LibraryDriver(){
        Author newAuthor = new Author("Sam Smith", "SamSmith@gmail.com", 'M');
        Book newBook = new Book("On the Wall", newAuthor, 100, 50);
        System.out.println(newBook);
    }
}
