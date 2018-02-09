package lab104;
/**
 * @author Ethan Hedrick
 * @version Feb 6, 2018
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Recursion {
    Scanner scan;
    int[] numbers = new int[10];
    
    public double harmonic(int n) {
        if(n == 1)
            return 1.0;
        else {
            return (1.0 / n) + (1.0 / harmonic(n - 1));
        }
    }
    
    public int isabels(File file) {
        try {
            scan = new Scanner(file);
            while(scan.hasNextLine()) {
                
                int i = scan.nextInt();
                System.out.println(i);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}
