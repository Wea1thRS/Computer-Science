package BookStore;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {

    String name;
    int Book[];
    public BookList library;

    public BookStore() {
        library = new BookList();
        library.add(new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5"));
        library.add(new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5"));
        library.add(new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3"));
        library.add(new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8"));
        library.add(new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1"));
        library.add(new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5"));
        library.trimToSize();
    }


    public String getName() {
        return name;
    }

    public BookStore(ArrayList<Book> library) {
        library = library;
    }

    public BookStore(BookList[] library) {
        library = library;
    }

    public BookStore(String name, BookList library) {
        name = name;
        library = library;
    }

    public String toString() {
        String result = "";
        for (Book tempBook : library) {
            result = result + tempBook.toString() + "\n";
        }
        return result;
    }

    public String lookupAuthor(String searchString) { //looks up author by book title.
        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                return currentBook.getAuthor();
            }
        }
        return "Could Not Find Book.";
    }

    public double lookupPrice(String searchString) { //looks up price by book title.
        for (Book currentBook : library) {
            if ((currentBook.getTitle()).equals(searchString)) {
                return currentBook.getPrice();
            }
        }
        return Double.NaN;

    }

    public BookList searchForTitle(String searchString) { //searches for books by title
        BookList searchResult = new BookList();
        for (Book currentBook : library) {
            if ((currentBook.getTitle()).toLowerCase().contains(searchString.toLowerCase())) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }

    public BookList searchForAuthor(String searchString) { //searches for books by an author
        BookList searchResult = new BookList();
        for (Book currentBook : library) {
            if ((currentBook.getAuthor()).equals(searchString)) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }

    public BookList searchForPrice(String searchString) { //searches for books cheaper than an amount
        BookList searchResult = new BookList();
        double min = Double.parseDouble(searchString);
        for (Book currentBook : library) {
            if (currentBook.getPrice() < min) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;

    }

    public Book getLowestPrice() { //searches for cheapest book
        Book min = new Book("Hi", "Me", 1000);
        for (Book currentBook : library) {
            if (currentBook.getPrice() < min.getPrice()) {
                min = currentBook;
            }
        }
        return min;
    }

    public Book getBookByISBN(String searchString) { //searches for book by ISBN
        for (Book currentBook : library) {
            if (currentBook.getISBN().equals(searchString)) {
                return currentBook;
            }
        }
        return null;
    }

}
