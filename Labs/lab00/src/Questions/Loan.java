package Questions;

/**
 *
 * @author araderma
 */
public class Loan 
{
    private String holder; 
    private double principal; 
    private double interestRate;
    private double numberOfPeriodsPerYear; 
    private double numberOfYears; 
    
    public Loan()
    {
        holder                  = "Bank of America";
        principal               = 25000.00;
        interestRate            = 0.05; 
        numberOfPeriodsPerYear  = 12;
        numberOfYears           = 10; 
    }
    
    public Loan (String holder, double principal, double interestRate, double numberOfPeriodsPerYear, double numberOfYears)
    {
        this.holder = holder; 
        this.principal = principal; 
        this.interestRate = interestRate; 
        this.numberOfPeriodsPerYear = numberOfPeriodsPerYear; 
        this.numberOfYears = numberOfYears; 
    }
    
    public void setHolder(String newHolder)
    {
        // needs implementation here
        this.holder = newHolder;
    }
    
    public String getHolder()
    {
        return holder; 
    }
    
    public double calculateInterest()
    {
        // should use the following formula
        // A = P (1 + r/n)^nt where
        //  P is the principal of the loan
        //  r is the interest rate
        //  n is the number of periods per year
        //  t is the duration of the loan in years
        double Amount = this.principal*(Math.pow((1+(this.interestRate/this.numberOfPeriodsPerYear)),(this.numberOfPeriodsPerYear*this.numberOfYears)));
        return Amount;  // needs implementation 
    }    

    @Override
    public String toString()
    {
        return "Loan: (holder: " + holder + ", principal: " + principal + ", future value: " + this.calculateInterest() + ")"; 
    }
}
