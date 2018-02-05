package lab103;

import java.util.Scanner;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 27, 2018
 *
 */
public class Client {

    public static void main(String[] args) {
        ArrayBag footballTeam = new ArrayBag(2);
        ArrayBag courses = new ArrayBag();
        LinkedBag basketballTeam = new LinkedBag();
        Scanner scan;
        String name, position;
        String econ = "ECON 105", engl = "ENGL 120", chem = "CHEM 121", csci = "CSCI 161", hnes = "HNES 111";
        int number;
        for (int i = 0; i < 6; i++) {
            scan = new Scanner(System.in);
            System.out.print("\nWhat is the players name?: ");
            name = scan.nextLine();
            System.out.print("\nWhat is the players position?: ");
            position = scan.nextLine();
            System.out.print("\nWhat is the players jersey number?: ");
            number = scan.nextInt();
            Player temp = new Player(name, position, number);
            scan.reset();
            footballTeam.add(temp);
        }
        footballTeam.remove();
        footballTeam.add(new Player("Joey", "Quarter Back", 13));
        System.out.println(footballTeam.getCurrentSize());
        footballTeam.remove(new Player("Joey", "Quarter Back", 13));
        System.out.println(footballTeam.getCurrentSize());
        courses.add(econ);
        courses.add(engl);
        courses.add(chem);
        courses.add(csci);
        courses.add(hnes);
        courses.remove();
        for (int i = 0; i <= footballTeam.getCurrentSize(); i++) {
            System.out.println(footballTeam.get(i));
        }
        for (int i = 0; i <= courses.getCurrentSize(); i++) {
            System.out.println(courses.get(i));
        }
        for (int i = 0; i < 6; i++) {
            scan = new Scanner(System.in);
            System.out.print("\nWhat is the players name?: ");
            name = scan.nextLine();
            System.out.print("\nWhat is the players position?: ");
            position = scan.nextLine();
            System.out.print("\nWhat is the players jersey number?: ");
            number = scan.nextInt();
            Player temp = new Player(name, position, number);
            scan.reset();
            basketballTeam.add(temp);
        }
        basketballTeam.remove();
        basketballTeam.add(new Player("John","Forward",7));
        System.out.println(basketballTeam.getCurrentSize());
        basketballTeam.remove(new Player("John","Forward",7));
        System.out.println(basketballTeam.getCurrentSize());
    }
}
