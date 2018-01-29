package Questions;

/**
 *
 * @author araderma
 */
public class Main 
{
    public static void main(String[] args) 
    {
        // Example of a loan using default constructor
        Loan defaultLoan = new Loan(); 
        System.out.println("Total due for default loan: " + defaultLoan.calculateInterest());
        
        // Example of a custom loan using alternate constructor 
        Loan customLoan = new Loan("Wells Fargo", 30000, 0.06, 12, 10); 
        System.out.println("Total due for custom loan: " + customLoan.calculateInterest());
        
        // Create and print out your own loan here: 
        
          
    }
}
