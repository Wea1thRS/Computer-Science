package Questions;

import java.util.Scanner;


/**
 *
 * @author (Your Name Here)
 */
public class Question4 
{
    public static Object[] question4(String value1, String value2)
    {
        /**
         * For this Question you will be using two of the prominent wrapper classes to convert String
         *  variables which represent numerical data into primitive types.
         * 
         * Additionally we will be using variables that are passed as parameters to a method.
         *  If you look immediately above these instructions you will notice what's referred to as a method header
         *  Among other things, this header specifies 2 variables of type String.
         *  These are parameters to a method and you will be using them as part of your solution.
         * 
         * Because the declaration for these variables has already been done as part of the method header,
         *  it is not necessary for you to declare any of the variables value1 or value2 that you will use below.
         * 
         * 1) Instantiate a new Scanner object to read input from the console.
         *      Note: The argument for the constructor should be System.in
         * 
         * 2) Declare an int variable with the identifier parsedInt and use a static method 
         *      of the Integer class to convert the String object reference value1 
         *      to an int and assign it to parsedInt.
         * 
         * 3) Declare an double variable with the identifier parsedDouble and use a static method 
         *      of the Double class to convert the String object reference value2 to a double 
         *      and assign it to parsedDouble.
         * 
         * 4) Declare a Double (the wrapper class) variable with the identifier your choosing and 
         *      assign it the value of reading in the next line of input from the console using the
         *      nextLine method of the Scanner class and using a static method of the Double class 
         *      to convert that String value to type Double (the wrapper class)
         *      Note: You DO NOT need to prompt the user with any message.
         * 
         * 5) Declare another Double (the wrapper class) variable with the identifier your choosing 
         *      and assign it the value of reading in the next line of input from the console 
         *      using the nextLine method of the Scanner class and using a static method of the 
         *      Double class to convert that String value to type Double (the wrapper class)
         *      Note: You DO NOT need to prompt the user with any message.
         * 
         * 6) Declare a boolean variable with the identifier isInfinite and assign it the value of 
         *      whether or not the Double wrapper class object you created in part 4 is infinite 
         *      (i.e., has the value POSITIVE_INFINITY)
         * 
         * 7) Declare a boolean variable with the identifier isNaN and assign it the value of whether 
         *      or not the Double wrapper class object you created in part 5 is not a number 
         *      (i.e., has the value NaN)
         * 
         * 8) Declare an int variable with the identifier result and assign it the value of 
         *      getting the int value of the Double wrapper class object you created in part 4 and 
         *      subtracting from it the int value of the Double wrapper class object 
         *      you created in part 5. 
         * 
         * Note: The unit tests for this file cannot be run until all steps have been completed.
         * 
         * Your code should be placed immediately after these instructions:
         */
        Scanner scanner = new Scanner(System.in);
        int parsedInt = Integer.parseInt(value1);
       
        double parsedDouble = Double.parseDouble(value2);
        Double dooble = Double.parseDouble(scanner.nextLine());
        Double duuble = Double.parseDouble(scanner.nextLine());
        boolean isInfinite = Double.isInfinite(dooble);
        boolean isNaN = Double.isNaN(duuble);
        int result = (int)dooble.doubleValue()-(int)duuble.doubleValue();
        // Necessary for Unit Tests. Do not delete.
        return new Object[] {parsedInt, parsedDouble, isInfinite, isNaN, result}; 
    }

}
