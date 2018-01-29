/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Radermacher
 */
public class LoanTest {
    
   
    @Test
    public void testMethod_setHolder()
    {
        Loan testLoan = new Loan("Bank of America", 0, 0, 0, 0); 
        
        testLoan.setHolder("Wells Fargo");
        
        assertEquals("Wells Fargo", testLoan.getHolder());
        
        testLoan.setHolder("Bank of America");
        
        assertEquals("Bank of America", testLoan.getHolder());
    }
    
    @Test
    public void testMethod_calculateInterest()
    {
        Loan testLoan = new Loan("Bank of America", 25000.0, 0.05, 12, 10); 
        
        double expected = 41175.24;
        double actual   = testLoan.calculateInterest();
        
        assertEquals(expected, actual, 0.01);
        
        testLoan = new Loan("Wells Fargo", 1000.00, 0.00, 12, 10);
        
        expected = 1000.00;
        actual   = testLoan.calculateInterest();
        
        assertEquals(expected, actual, 0.01);
    }
    
}
