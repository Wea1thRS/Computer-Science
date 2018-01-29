package Questions;

/**
 * @author (Your Name Here)
 */
public class Question6 
{
    /*
     * For this portion of the assignment you will be performing different types of division and 
     *  performing some explicit type casting. 
     * Additionally, we will be adding some code to a method that has a pre-written header!
     * 
     * Three (3) variables have already been declared an initialized as part of this assignment. 
     *  You will be using these variables as part of your solution.
     * 
     * Note: You should declare and initialize any variables as a single statement (i.e., using a single line of code)
     *
     * When you are finished, you can run the unit tests located in the Question5Test.java
     *  file to verify the correctness of your solution.
     * Note: This class does not contain a main method so you should not run this program.
     * 
     * 1) Declare a variable of type double with the identifier result1 and assign it the value of dividing otherDouble by zeroDouble
     * 2) Declare a variable of type double with the identifier result2 and assign it the value of dividing zeroDouble by zeroDouble
     * 3) Declare a variable of type int with the identifier result3 and assign it the value of type casting result1 to an int
     * 4) Declare a variable of type int with the identifier result4 and assign it the value of type casting result2 to an int
     * 5) Inside of the code block for the method with the identifier resultOfIntegerDivisionByZero perform the following:
     *      a) Declare a variable of type int with the identifier result5 and assign it the value dividing zeroInt by zeroInt
     *    WARNING: Doing this would typically cause a program to crash
     */
    
    // Previously declared variables. DO NOT REMOVE! 
    int    zeroInt = 0; 
    double zeroDouble = 0.0;
    double otherDouble = 16.5; 
    
    // Your code goes here (Parts 1 - 4) 
double result1 = otherDouble / zeroDouble, result2 = zeroDouble / zeroDouble;
int result3 = (int)result1, result4 = (int)result2;    
    // Pre-written method header used for part 5
    public void resultOfIntegerDivisionByZero()
    {
        // Your code goes here (Part 5)
        int result5 = zeroInt / zeroInt;
    }
}
