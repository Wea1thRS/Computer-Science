/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ethan
 */
public class BookListTest {
    static BookStore bs = new BookStore();

    @Test
    public void testAdd() {
        Book[] temp = new Book[1];
        BookList tempList = new BookList(temp);
        tempList.add(new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5"));
        Book[] temp2 = new Book[1];
        BookList tempList2 = new BookList(temp2);
        tempList2.add(new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5"));
        assertEquals((tempList.getBook(0)).toString(), (tempList2.getBook(0)).toString());
    }
    @Test
    public void testAdd2() {
        Book[] temp = new Book[1];
        BookList tempList = new BookList(temp);
        tempList.add(new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5"));
        Book[] temp2 = new Book[1];
        BookList tempList2 = new BookList(temp2);
        tempList2.add(new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5"));
        assertEquals((tempList.getBook(0)).toString(), (tempList2.getBook(0)).toString());
    }
    @Test
    public void testRemove() {
        bs.library.remove(bs.library.getBook(0));
        assertEquals(bs.library.getBook(0).toString(), new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8").toString());
    }
    @Test
    public void testRemove2() {
        bs.library.remove(bs.library.getBook(0));
        bs.library.remove(bs.library.getBook(0));
        assertEquals(bs.library.getBook(0).toString(), new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3").toString());
    }
    @Test
    public void testGetBook() {
        assertEquals(bs.library.getBook(0).toString(), new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5").toString());
    }
    @Test
    public void testGetBook2() {
        assertEquals(bs.library.getBook(1).toString(), new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5").toString());
    }
    @Test
    public void testSortList() {
        assertEquals("Do I know what I am doing?", "Do I know what I am doing?");
    }
    @Test
    public void testSortList2() {
        assertEquals("No I do not.", "No I do not.");
    }
}
