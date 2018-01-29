package BookStore;

public class Book {

    String title;
    String author;
    double price;
    boolean hardCover;
    String ISBN;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.hardCover = true;
        this.ISBN = "Unknown";
    }

    public Book(String newTitle, String newAuthor, double newPrice) {
        this.title = newTitle;
        this.author = newAuthor;
        this.price = newPrice;
    }
    
    public Book(String newTitle, String newAuthor, double newPrice, boolean hardCover, String ISBN) {
        this.title = newTitle;
        this.author = newAuthor;
        this.price = newPrice;
        this.hardCover = hardCover;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public double getCost() {
        return this.price;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public boolean getIfHardCover() {
        return this.hardCover;
    }
    @Override
    public String toString() {
        String cover;
        if(this.getIfHardCover())
            cover = "Hard";
        else
            cover = "Soft";
        
        return ("Title: " + this.title + "\t"
                + "Author: " + this.author + "\t"
                + "Price: " + this.price + "\t"
                + "Cover: " + cover + "\t"
                + "ISBN: " + this.ISBN);
    }

}
