/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

/**
 *
 * @author araderma
 */
public class Question2 {
    
    public static int[] question2()
    {
        /*
         *  For this part of the assignment, you will be converting while loops to an
         *   equivalent for loop and vice versa. 
         * 
         *  1) Declare three variables of type int, count1, count2, and count3
         *      and assign them intial values of 0.
         * 
         *  2) Create a while loop equivalent to the following for loop:
         *  
         *  for(int a = 0; a < 15; a += 3)
         *  {
         *      count1++; 
         *  }
         * 
         *  3) Create a while loop equivalent to the following for loop:
         *  
         *  for(int b = 25; b >= 0; b = b - 4)
         *  {
         *      count2++;
         *  }
         * 
         *  4) Create a for loop equivalent to the following while loop:
         * 
         *  int c = 0; 
         *  while(c < 5)
         *  {
         *      count3++;
         *      c++;
         *  }
         *
         *  Note: For parts 2 and 3, make sure to use the same identifiers a and b
         *   for your loop control variables as they are necessary for the solution
         *  Note 2: This program contains a main method that can be used to manually test your code by right-clicking Question2.java
         *    and selecting "Run File"   
        
         */
        
        // Your code goes here
        
        int count1 = 0, count2 = 0, count3 = 0;
        int a = 0, b = 25;
        while(a < 15) {
            a += 3;
            count1++;
        }
        while(b >= 0) {
            b -= 4;
            count2++;
        }
         int c = 0; 
         for(int i=0; i < 5; i++) 
             count3++;
        
        // necessary for unit test, do not remove
        return new int[] {count1, count2, count3, a, b}; 
    }
    
    public static void main(String[] args)
    {
        int[] results = question2(); 
        System.out.println("count1: " + results[0]);
        System.out.println("count2: " + results[1]);
        System.out.println("count3: " + results[2]);
        System.out.println("a: " + results[3]);
        System.out.println("b: " + results[4]);
    }
    
}
