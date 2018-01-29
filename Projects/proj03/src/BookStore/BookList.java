package BookStore;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookList implements Iterable<Book> {

    public Book[] list;
    public int size;

    public BookList() {
        list = new Book[10];
        size = 0;
    }

    public BookList(Book[] booklist) {
        size = 0;
        list = new Book[1];
    }

    public int getSize() {
        return size;
    }

    public void add(Book book) {
        if (size == list.length) {
            ensureCapacity();
        }
        list[size] = book;
        size++;
    }

    public void remove(Book book) {
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }

        if (index >= 0 && index <= size) {
            for (int i = index; i < list.length-1; i++) {
                list[i] = list[i + 1];
            }
        }

    }

    public Book getBook(int index) {
        if (index >= 0 && index <= size) {
            return list[index];
        } else {
            return null;
        }
    }

    public void trimToSize() {
        Book temp[] = new Book[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public void ensureCapacity() {
        if (size == list.length) {
            Book temp[] = new Book[list.length + 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = list[i];
            }
            list = temp;
        }
    }

    public void displayList() {
        for (int i = 0; i <= size; i++) {
            System.out.println(list[i]);
        }
    }

    public void sortList() {
        Book[] sorted = new Book[6];
        sorted[0] = new Book("Advanced Html", "Green", 56.99, true, "98-7718-068-5");
        sorted[1] = new Book("Advanced Java", "Green", 65.99, true, "95-0515-672-3");
        sorted[2] = new Book("Intro To Flash", "James", 34.49, false, "99-9055-841-8");
        sorted[3] = new Book("Intro To Html", "James", 29.49, false, "99-9058-641-1");
        sorted[4] = new Book("Intro To Java", "James", 56.99, false, "98-0695-965-5");
        sorted[5] = new Book("Java Servlets", "Brown", 75.99, true, "95-0947-855-5");

        list = sorted;
    }

    /**
     * Private inner class to allow the use of enhanced for loop with the
     * BookList class
     *
     * You should copy this code into your BookList class. Make sure that it is
     * not inside of other methods or it will not work correctly.
     *
     * You will also need to make sure that your BookList class implements the
     * Iterable interface and uses the Book type for the type parameter
     * (implements Iterable<Book>)
     *
     * When overriding the iterator() method that you need to implement, you can
     * return an instance of the BookIterator class by calling its constructor
     * method.
     */
    private class BookIterator implements Iterator<Book> {

        private int cursor;  // Index position for the current Book

        /**
         * Creates a new Iterator for this BookList
         */
        public BookIterator() {
            this.cursor = 0; // Set the cursor to the front of the array
        }

        @Override
        public boolean hasNext() {
            return this.cursor < size; // Determine if the next index position is valid
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                int current = cursor; // Save the current cursor position
                cursor++;             // Move the cursor over by one
                return list[current]; // Return the Book at the old cursor position
            }
            throw new NoSuchElementException(); // Attempted to get a non-exist Book
        }

    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator();
    }

}
