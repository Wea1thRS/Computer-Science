package Questions.Chapter9;

import ProvidedClasses.Person;
import java.util.ArrayList;

/**
 *
 * @author (Your Name Here)
 */
public class Question3 {

    /*  For this part of the assignment, you will need to help your young relative who is just learning multiplication. 
        Your method should generate a two-dimensional int array that stores the value of multiplying the value of the 
        index for the current row and column together and storing that result in the correct index location. 
    
        The method has a single parameter, an int maxNumber which you will need to use as part of your solution. 
        maxNumber is the largest index value that you should use in the table that you generate. If, for example, the value
        of maxNumber is five, you should construct the array to multiply values in the range 0 - 5 inclusive. 
    
        You should also make sure that your code does not generate any run-time exceptions. 
    
     */
    public static int[][] multiplicationTable(int maxNumber) {
        int[][] table = new int[maxNumber + 1][maxNumber + 1];
        for (int row = 1; row <= maxNumber; row++) {
            for (int column = 1; column <= maxNumber; column++) {
                table[row][column] = (row) * (column);
            }
        }
        return table;
    }

    /*  For this part of the assignment you will use an ArrayList to handle the guest list for party you wanted to have.
        Intially you had planned to only invite 3 people and keep things rather relaxed, however eventually the word got out
        and more people want to come. Being a good person you've decided to invite them.
    
        1) Declare an ArrayList that only accepts Person objects as elements and give it an inital capacity of 3, the original
            number of guests you wanted to invite. 
        2) Create 3 new Person objects (you can use the default constructor) and add them to your list. 
        3) Now use a for loop to add an additional 25 guests to the list (again you can use the default constructor). 
    
     */
    public static ArrayList partyList() {
        ArrayList<Person> guestList = new ArrayList<>();
        Person aPerson = new Person();
        Person anotherPerson = new Person();
        Person yetAnotherPerson = new Person();
        guestList.add(aPerson);
        guestList.add(anotherPerson);
        guestList.add(yetAnotherPerson);
        for (int i = 0; i <= 24; i++) {
            Person person = new Person();
            guestList.add(person);
        }
        return guestList;
    }

    /*  One of your friends who is also having a party has decided it would be really cool if you just combined your parties into
        one incredibly large super-party. Since your friend has agreed to have it at their house, you've decided this isn't such a bad idea.
    
        1) Declare a new ArrayList that only accepts Person objects that will be a master guest list. 
        2) Use an enhanced for loop to add all of the Person objects in your list (yourGuestList parameter) to the master guest list. 
        2) Rather than add guests individually to the list, use a single method to add every element from your and your friend's lists 
            to the new master list. (the friendsGuestList parameter)
        3) A few people have called to inform you that they cannot make it to your party. Use a different method of the ArrayList class
            to remove all of the Persons from the master guest list that are in the cannotAttend list. 
        4) Make sure to return your master guest list for the party. 
    
     */
    public static ArrayList combinedList(ArrayList<Person> yourGuestList, ArrayList<Person> friendsGuestList, ArrayList<Person> cannotAttend) {
        ArrayList<Person> master = new ArrayList<>();
        yourGuestList.forEach((peep) -> {
            master.add(peep);
        });
        friendsGuestList.forEach((peep) -> {
            master.add(peep);
        });
        cannotAttend.forEach((peep) -> {
            master.remove(peep);
        });
        return master;
    }
}
