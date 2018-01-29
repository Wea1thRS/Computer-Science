/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Scanner;

/*
 *
 * @author Ethan
 */
public class MenuHelper {
    static String[] course = {"Chicken", "Beef", "Pork"};
    static String[] side = {"Baked Potato", "Soup", "Salad", "Vegetables"};
    static String[] side2 = {"Baked Potato", "Soup", "Salad", "Vegetables"};
    public static void main(String[] args) {
        int a = displayMenu("test", 1, 3, course);
        int b = displayMenu("test2", 1, 4, side);
        int c = displayMenu("test3", 1, 4, side2);
        System.out.printf("You selected options %d, %d, %d for your choices.\n",a,b,c);
    }
    public static int displayMenu(String message, int min, int max, String[] menu) {
        System.out.println(message);
        for(int i = min; i <= max; i++) {
            System.out.println(i + ") "+menu[i-1]);
        }
        System.out.print("Please enter a selection: " + min + "-" + max + ": ");
        for(;;) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNextInt()) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            int userInput = scan.nextInt();
            if(userInput < min || userInput > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            return userInput;
        }
    }
    public static int displayMenu(String message, int min, int max) {
        System.out.println(message);
        for(int i = min; i <= max; i++) {
            System.out.println(i + ")");
        }
        System.out.print("Please enter a selection: " + min + "-" + max + ": ");
        for(;;) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNextInt()) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            int userInput = scan.nextInt();
            if(userInput < min || userInput > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            return userInput;
        }
    }
}
