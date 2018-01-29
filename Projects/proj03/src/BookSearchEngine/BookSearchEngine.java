package BookSearchEngine;

import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;
import javax.swing.JOptionPane;

public class BookSearchEngine {

    static BookStore bs = new BookStore();

    public static void main(String[] args) {
        try {
            int option = 0;
            System.out.println("Welcome to the " + bs.getName() + "Bookstore.");

            while (option != 9) {

                System.out.println("Please make a menu selection:");
                System.out.println("0 - List Books.");
                System.out.println("1 - List Books Alphabetically");
                System.out.println("2 - Lookup Book Auther.");
                System.out.println("3 - Lookup Price.");
                System.out.println("4 - Search By Auther.");
                System.out.println("5 - Search By Cost.");
                System.out.println("6 - Search By Book title.");
                System.out.println("7 - Find Cheapest Book.");
                System.out.println("8 - Find Book by ISBN.");
                System.out.println("9 - Quit.");

                String s = JOptionPane.showInputDialog(null, "Please make a selection.");
                option = Integer.parseInt(s);
                if (option == 0) {
                    System.out.println(bs.toString());
                } else if (option == 1) {
                    bs.library.sortList();
                    System.out.println(bs.toString());
                } else if (option == 2) {
                    s = JOptionPane.showInputDialog(null, "Please enter a Book Title.");
                    s = toTitleCase(s);
                    String s1 = bs.lookupAuthor(s);
                    System.out.println("The Auther for " + s + " is: " + s1);
                } else if (option == 3) {
                    s = JOptionPane.showInputDialog(null, "Please enter a Book Title");
                    s = toTitleCase(s);
                    double d = bs.lookupPrice(s);
                    System.out.println("The Price for " + s + " is: $" + d);
                }
                if (option == 4) {
                    s = JOptionPane.showInputDialog(null, "Please enter an Author: ");
                    BookList list1 = bs.searchForAuthor(s);
                    System.out.println("List of books by the author is: ");
                    for (Book b : list1) {
                        System.out.println(b.toString());
                    }
                }
                if (option == 5) {
                    s = JOptionPane.showInputDialog(null, "Please enter a minimum cost.");
                    BookList list2 = bs.searchForPrice(s);
                    System.out.println("List of books below the $" + s + " cost: ");
                    for (Book b : list2) {
                        System.out.println(b.toString());
                    }
                } else if (option == 6) {
                    s = JOptionPane.showInputDialog(null, "Please enter a keyword:");
                    BookList list3 = bs.searchForTitle(toTitleCase(s));
                    System.out.println("List of Books matching: " + s);
                    for (Book b : list3) {
                        System.out.println(b.toString());
                    }
                } else if (option == 7) {
                    Book cheap = bs.getLowestPrice();
                    System.out.println("Cheapest Book:" + "\n"
                            + cheap);
                } else if (option == 8) {
                    s = JOptionPane.showInputDialog(null, "Please enter an ISBN:");
                    System.out.println(bs.getBookByISBN(s).toString());
                } else {
                    System.out.println("Thank you for using our program.");
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Please only enter integer numbers.");
            main(null);
        }

    }

    public static String toTitleCase(String givenString) {
        givenString.trim();
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
