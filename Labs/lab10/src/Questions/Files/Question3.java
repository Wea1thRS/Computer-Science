package Questions.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author (Your Name Here)
 */
public class Question3 {

    /*  For this portion of the assignment, you will writing a simple method to perform basic reads from a specified file, the name
        of which will be passed in as an argument to the method below. 
    
        You can use the Scanner class to read from a file (Chapter 11.3)
    
        Your code should perform the following actions:
    
        1) If the parameter fileName is null, you should change it to a default value of "files/question3/sample.txt"
        2) Read the file line by line and keep track of all of the input you have read, which will be returned as a String
            * Make sure to preserve spacing and other special characters. 
        3) If the specified file could not be found, you should return the String "Error: Could not find file!"
            * Your code should not throw any exceptions. 
    
        *Note: You should not print anything to the console for this exercise. 
        *Note: You will need to import some classes from the java.io package. 
     */
    public static String Question3(String fileName) {
        File file;
        try {
            file = new File(fileName);
        } catch (NullPointerException e) {
            file = new File("files/question3/sample.txt");
        }
        String str = "";
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                str += scan.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            return "Error: Could not find file!";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(Question3(null));
    }
}
