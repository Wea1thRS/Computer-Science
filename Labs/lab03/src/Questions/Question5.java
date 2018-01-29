package Questions;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author (Your Name Here)
 */
public class Question5 
{
   
    
    public static void main (String[] args)
    {
        /**
         * For this part of the assignment you will be working with the JOptionPane class to 
         *  create several pop-up dialog messages.
         * 
         * Note: There are no unit tests for this exercise so you will need to run this program
         *  (i.e., right-click Question5.java and select Run File) in order to manually test it.
         * 
         * 1) Use an input dialog pop-up to prompt the user to enter their age. 
         *      You will want to assign this to some variable for later use. 
         * 
         * 2) Use an input dialog pop-up to prompt the user to enter their name. 
         *      You will want to assign this to some variable for later use.
         * 
         * 3) Use a message dialog pop-up to great the user by name. 
         * 
         * 4) Use a message dialog pop-up to tell the user how old they are. 
         * 
         * 5) Use a message dialog pop-up to tell the user how fun pop-ups are.
         * 
         * 6) Use a message dialog pop-up to tell the user that they're even more 
         *      fun once you learned about looping.
         * 
         * 7) Use an input dialog pop-up to prompt the user to make a solemn promise 
         *      not to use JOptionPane ever again. 
         * 
         * Your code should be placed immediately following these instructions. 
         */
        String age = JOptionPane.showInputDialog("Please insert your age.");
        String name = JOptionPane.showInputDialog("Please enter your name.");
        JOptionPane.showMessageDialog(null,"Hello " + name + ".");
        JOptionPane.showMessageDialog(null,"You are " + age + " years old.");
        JOptionPane.showMessageDialog(null,"Pop-ups are fun, aren't they?");
        JOptionPane.showMessageDialog(null,"They are even more fun when you've learned about looping...");
        int test = JOptionPane.showConfirmDialog(null,"Do you agree to never use JOptionPane ever again?");
        while(test == 1) {
            JOptionPane.showMessageDialog(null,"Okay.. must not have heard me.");
            test = JOptionPane.showConfirmDialog(null,"I said, do you agree to never use JOptionPane ever again?");
        }
    } 
}
