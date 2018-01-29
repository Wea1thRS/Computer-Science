package Questions.Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author (Your Name Here)
 */
public class Question4 {

    /*  For this exercise you will be doing some basic operations to write to a file. 
        You will be creating your very own Secrets of the Universe (TM)
    
        You can use the PrintWriter class to write to files (Chapter 11.4)
    
        Your code should perform the following actions:
    
        1) Open/Create a file for writing at the following location: "files/question4/MySecretsOfTheUniverse.txt"
            * If the file already exists you will want to overwrite its contents.
        2) Add at least 3 of your own secrets of the universe to the file.
            * Each secret should be on its own line. 
        3) Make sure to close your file so that the results are saved. 

        *Note: Your code should not throw any checked exceptions. 
        *Note: You will need to import some classes from the java.io package. 
     */
    public static void Question4() {

        FileOutputStream f;
        try {
            f = new FileOutputStream("files/question4/MySecretsOfTheUniverse.txt", false);

            PrintWriter pw = new PrintWriter(f);
            pw.println("secret1");
            pw.println("secret2");
            pw.println("secret3");
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
}
