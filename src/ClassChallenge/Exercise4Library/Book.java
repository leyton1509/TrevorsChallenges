package ClassChallenge.Exercise4Library;

/**
 * Class to represent a book
 */
public class Book {

    /**
     * The name of the book
     */
    private String name;

    /**
     * The author of the book
     */
    private Author author;

    /**
     * The price of the book
     */
    private double price;

    /**
     * The quantity of the book, initialised at 0
     */
    private int qty = 0;

    /**
     * Constructor 1
     * @param _name The name of the book
     * @param _author The author of the book
     * @param _price The price of the book
     */
    public Book(String _name, Author _author, double _price){
        name = _name;
        author = _author;
        price = _price;
    }

    /**
     * Constructor 2
     * @param _name The name of the book
     * @param _author The author of the book
     * @param _price The price of the book
     * @param _qty The amount of books
     */

    public Book(String _name, Author _author, double _price, int _qty){
        name = _name;
        author = _author;
        price = _price;
        qty = _qty;
    }

    /**
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author of the book
     */

    public Author getAuthor() {
        return author;
    }

    /**
     * @return the price of the book
     */

    public double getPrice() {
        return price;
    }

    /**
     * @return the quantity of the book
     */

    public int getQty() {
        return qty;
    }

    /**
     * @param _price Sets the price of the book
     */
    public void setPrice(double _price){
        price = _price;
    }

    /**
     * @param _qty Sets the quantity of the book
     */
    public void setQty(int _qty){
        qty = _qty;
    }

    /**
     * @return The String representation of the book
     */
    public String toString(){
        return "Book[Name = " + name + " , Author[" + author.toString() +"], Price = " + price + " , Qty = " + qty + "]";
    }
}
