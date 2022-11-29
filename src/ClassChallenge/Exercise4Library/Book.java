package ClassChallenge.Exercise4Library;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String _name, Author _author, double _price){
        name = _name;
        author = _author;
        price = _price;
    }

    public Book(String _name, Author _author, double _price, int _qty){
        name = _name;
        author = _author;
        price = _price;
        qty = _qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double _price){
        price = _price;
    }

    public void setQty(int _qty){
        qty = _qty;
    }

    public String toString(){
        return "Book[Name = " + name + " , Author[" + author.toString() +"], Price = " + price + " , Qty = " + qty + "]";
    }
}
