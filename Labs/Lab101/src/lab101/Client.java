package lab101;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ethan Hedrick
 * @version Jan 18, 2018
 * @info A main class to test the Employees.
 */
public class Client {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean test = true;
        ArrayList<Employee> employeeList = new ArrayList<>(10);
        
        //populate list
        if (test) {
            employeeList = testdata();
        } else {
            employeeList = keyboardInput();
            while (employeeList.size() < 10) {
                employeeList.add(null);
            }
        }

        //print out employees including nulls
        printList(employeeList, true);

        //give employees a raise
        giveRaise(employeeList);
        
        //print out employees not including nulls
        printList(employeeList, false);
        
        //test equals methods
        testEquals(employeeList);
    }

    /**
     *
     * @return Returns ArrayList of type Employee filled with Employees made
     * from default test data.
     */
    public static ArrayList<Employee> testdata() {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Salaried(0, "Joe", "CEO", 75000));
        employeeList.add(new Hourly(1, "Johnny", "Store Manager", 10.57));
        employeeList.add(new Salaried(2, "Jacob", "COO", 68000));
        employeeList.add(new Hourly(3, "Jimmy", "Sales Advisor", 11.22));
        employeeList.add(new Salaried(4, "Jalyn", "CFO", 62000));
        employeeList.add(new Hourly(5, "Jakey", "Clerk", 8.73));
        employeeList.add(new Salaried(6, "Justin", "CIO", 59555));
        employeeList.add(new Hourly(7, "Jamie", "Department Manager", 14.55));
        employeeList.add(new Salaried(8, "Jared", "CXO", 72000));
        employeeList.add(new Hourly(9, "Jerome", "District Visual Manager", 13.37));
        return employeeList;
    }

    /**
     *
     * @return Returns ArrayList of type Employee filled with Employees made
     * using data input by user.
     */
    public static ArrayList<Employee> keyboardInput() {
        int userInput;
        boolean inputIsValid = false;
        ArrayList<Employee> employee = new ArrayList<>();
        OUTER:
        do {
            System.out.println("Enter 2 to add an Hourly Employee, 1 to add a Salaried Employee, or 0 to continue.");
            try {
                userInput = scan.nextInt();
                switch (userInput) {
                    case 2:
                        employee.add(newEmployee(1));
                        break;
                    case 1:
                        employee.add(newEmployee(0));
                        break;
                    case 0:
                        break OUTER;
                    default:
                        scan.nextLine();
                        System.out.println("Please insert an integer that is either 2, 1, or 0.");
                        break;
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please insert an integer that is either 1 or 0.");
            }
        } while (!inputIsValid);
        return employee;
    }

    /**
     *
     * @param s Specifies what type of value the integer is for.
     * @return Returns an integer input by user.
     */
    public static int getInt(String s) {
        System.out.println("Enter an integer to represent the: " + s);
        int userInput = 0;
        boolean inputIsValid = false;
        do {
            try {
                userInput = scan.nextInt();
                inputIsValid = true;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please insert an integer.");
            }
        } while (!inputIsValid);
        return userInput;
    }

    /**
     *
     * @param s Specifies what type of value the double is for.
     * @return Returns a double input by user.
     */
    public static double getDouble(String s) {
        System.out.println("Enter an double to represent the: " + s);
        double userInput = 0;
        boolean inputIsValid = false;
        do {
            try {
                userInput = scan.nextDouble();
                inputIsValid = true;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please insert a double.");
            }
        } while (!inputIsValid);
        return userInput;
    }

    /**
     *
     * @param s Specifies what type of value the string is for.
     * @return Returns a string input by user.
     */
    public static String getString(String s) {
        boolean inputIsValid = false;

        System.out.println("Enter a string to represent the: " + s);
        String userInput = null;
        do {
            try {
                userInput = scan.next();
                inputIsValid = true;
            } catch (InputMismatchException e) {
                scan.nextLine();
            }
        } while (!inputIsValid);
        return userInput;
    }

    /**
     *
     * @param type The type of employee.
     * @return returns a new employee of type.
     */
    public static Employee newEmployee(int type) {
        Employee employee;
        if (type == 1) {
            employee = new Hourly(getInt("Id"), getString("Name"), getString("Position"), getDouble("Hourly Rate"));
        } else {
            employee = new Salaried(getInt("Id"), getString("Name"), getString("Title"), getInt("Salary"));
        }
        return employee;
    }

    /**
     *
     * @param employeeList list of employees.
     */
    public static void giveRaise(ArrayList<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null) {
                if (employeeList.get(i) instanceof Salaried) {
                    Salaried s = (Salaried) employeeList.get(i);
                    s.setSalary((int) (s.getSalary() * 1.10));
                } else {
                    Hourly h = (Hourly) employeeList.get(i);
                    h.setHourlyRate(h.getHourlyRate() * 1.10);
                }
            }
        }
    }

    /**
     *
     * @param employeeList list of employees.
     * @param nulls test whether the nulls should be printed.
     */
    public static void printList(ArrayList<Employee> employeeList, boolean nulls) {
        employeeList.forEach((employee) -> {
            if (nulls) {
                System.out.println(String.valueOf(employee));
            } else {
                if (employee != null) {
                    System.out.println(String.valueOf(employee));
                }
            }
        });
    }
    
    public static void testEquals(ArrayList<Employee> employeeList) {
        ArrayList<Employee> employeeList2 = new ArrayList<>(10);
        employeeList = testdata();
        employeeList2.add(new Salaried(0, "Joe", "CEO", 75000));
        employeeList2.add(new Hourly(1, "Johnny", "Store Manager", 10.57));
        employeeList2.add(new Salaried(2, "Jacob", "COO", 68000));
        employeeList2.add(new Hourly(3, "Jimmy", "Sales Advisor", 11.22));
        
        System.out.println(employeeList.get(0).equals(employeeList2.get(0)));
        System.out.println(employeeList.get(1).equals(employeeList2.get(1)));
        System.out.println(employeeList.get(2).equals(employeeList2.get(2)));
        System.out.println(employeeList.get(3).equals(employeeList2.get(3)));
    }
}
