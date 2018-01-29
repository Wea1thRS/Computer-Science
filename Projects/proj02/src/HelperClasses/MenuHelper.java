/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import java.util.Scanner;

/**
 *
 * @author Ethan
 */
public class MenuHelper {
    String message, prompt;
    static int min, max;

    
    public static int displayMenu(String message, String[] menu) {
        System.out.println(message);
        min = 1;
        max = menu.length;
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
    public int displayMenu(String message, int min, int max) {
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
    public static int getNumInput(String prompt) {
        System.out.print(prompt);
        for(;;) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNextInt()) {
                System.out.println(prompt);
                continue;
            }
            int userInput = scan.nextInt();
            return userInput;
        }
    }
    public static String getTextInput(String prompt) {
        System.out.print(prompt);
        for(;;) {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNext()) {
                System.out.println(prompt);
                continue;
            }
            String userInput = scan.next();
            return userInput;
        }
    }
}
