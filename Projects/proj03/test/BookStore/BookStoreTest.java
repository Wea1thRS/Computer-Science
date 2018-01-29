/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ethan
 */
public class BookStoreTest {
    static BookStore bs = new BookStore();

    @Test
    public void testLookupAuthor() {
        assertEquals(bs.lookupAuthor("Java Servlets"), "Brown");
    }
    @Test
    public void testLookupAuthor2() {
        assertEquals(bs.lookupAuthor("Advanced Html"), "Green");
    }

    @Test
    public void testLookupPrice() {
        assertEquals(bs.lookupPrice("Advanced Java"), 65.99,0.02);
    }
    @Test
    public void testLookupPrice2() {
        assertEquals(bs.lookupPrice("Intro To Flash"), 34.49, 0.02);
    }
    @Test
    public void testSearchForTitle() {
        BookList list = new BookList();
        list.add(new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5"));
        list.add(new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3"));
        list.add(new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5"));
        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForTitle("Java")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testSearchForTitle2() {
        BookList list = new BookList();
        list.add(new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8"));
        list.add(new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1"));
        list.add(new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5"));
        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForTitle("Intro")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testSearchForAuthor() {
        BookList list = new BookList();
        list.add(new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8"));
        list.add(new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1"));
        list.add(new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5"));
        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForAuthor("James")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testSearchForAuthor2() {
        BookList list = new BookList();
        list.add(new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5"));
        list.add(new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3"));
        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForAuthor("Green")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testSearchForPrice() {
        BookList list = new BookList();
        list.add(new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5"));
        list.add(new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8"));
        list.add(new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1"));
        list.add(new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5"));
        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForPrice("60.00")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testSearchForPrice2() {
        BookList list = new BookList();
        list.add(new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8"));
        list.add(new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1"));

        String result = "";
        for (Book tempBook : list) {
            result = result + tempBook.toString() + "\n";
        }
        String initial = "";
        for (Book tempBook : bs.searchForPrice("35.00")) {
            initial = initial + tempBook.toString() + "\n";
        }
        assertEquals(initial, result);
    }
    @Test
    public void testGetLowestPrice() {
        assertEquals(bs.getLowestPrice().toString(), new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1").toString());
    }
    @Test
    public void testGetLowestPrice2() {
        bs.library.add(new Book("Treasure Island", "Robert Louis Stevenson", 7.95));
        assertEquals(bs.getLowestPrice().toString(), new Book("Treasure Island", "Robert Louis Stevenson", 7.95).toString());
    }
    @Test
    public void testGetBookByISBN() {
        assertEquals(bs.getBookByISBN("95-0515-672-3").toString(), new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3").toString());
    }
    @Test
    public void testGetBookByISBN2() {
        assertEquals(bs.getBookByISBN("98-0695-965-5").toString(), new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5").toString());
    }
}
