/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

/**
 *
 * @author (Your Name Here)
 */
public class Question2 
{
    public static Object[] question2(int x, int y, int z, double a, double b, double c, double d)
    {   
        /**
         * For this portion of the assignment you will be working with static methods of the Math class. 
         * 
         * Additionally we will be using variables that are passed as parameters to a method.
         *  If you look immediately above these instructions you will notice what's referred to 
         *  as a method header. Among other things, this header specifies 7 variables, 3 of type int 
         *  and 4 of type double. These are parameters to a method and you will be using them as part 
         *  of your solution. Because the declaration for these variables has already been done as
         *  part of the method header, it is not necessary for you to declare any of the
         *  variables a, b, c, d, x, y, z that you will be using in the instructions below. You can
         *  use any of them by using their identifier as a part of your code. 
         * 
         * 1) Declare an int variable with the identifier minInt and assign it the value of the smallest 
         *      int variable x, y, or z using the min method of the Math class. You may need to use
         *      multiple statements or method calls to accomplish this. 
         * 
         * 2) Declare a double variable with the identifier maxDouble and assign it the value of the largest
         *      double variable, a, b, c, or d using the max method of the Math class. You may need to use 
         *      multiple statements or method calls to accomplish this. 
         * 
         * 3) Declare an int variable with the identifier rounded and assign it the value of maxDouble when
         *      rounded to the nearest whole number.
         *      Note: You will need to use explicit type casting to do this.
         * 
         * 4) Declare a double variable with the identifier absolute and assign it the absolute value of 
         *      the following mathematical expression: b - d - a - c
         * 
         * 5) Declare a double variable with the identifier cosine and assign to it the value of the cosine of variable c.
         *      Note: You may need to check the API to find a suitable method to use.
         * 
         * 6) Declare a double variable with the identifier answer and assign to it the value of 
         *      the following mathematical expression: 
         *      The value (rounded to the nearest number) of the variable b raised to the power of the square root of c.
         * 
         *  Note: The unit tests for this file cannot be run until all steps have been completed.
         * 
         * Your code should be placed immediately below these instructions. 
         */
        int minInt = Math.min(Math.min(x, y),z);
        double maxDouble = Math.max(Math.max(a,b), Math.max(c, d));
        int rounded = (int)Math.round(maxDouble);
        double absolute = Math.abs(b-d-a-c);
        double cosine = Math.cos(c);
        double answer = Math.pow(b, Math.sqrt(c));
        // Necessary for Unit Tests. Do not delete.
        return new Object[] {minInt, maxDouble, rounded, absolute, cosine, answer}; 
    } 
}
