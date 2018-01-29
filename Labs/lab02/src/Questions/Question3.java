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
public class Question3 
{

    /**
     * For this portion of the assignment you will be working with the String class
     *  and using several different methods of the String class to manipulate String
     *  variables. 
     * 
     * You may need to refer to table 3.4 in chapter 3.7 to determine which methods you 
     *  should use. Additionally, you may want to look at the API for the String class:
     *  https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     * 
     * When you are finished, you can run the unit tests located in the Question3Test.java
     *  file to verify the correctness of your solution.
     * 
     * 1) In one line, declare a String variable with the identifier movieName and assign it the value: 
     *      It's a Mad, Mad, Mad, Mad World
     *
     *      Note: Capitalization, spacing and punctuation are important
     *
     * 2) In one line, declare a String variable with the identifier upperCase and assign it the result of a method call
     *      on the movieName object reference that returns a String with all uppercase letters. 
     *
     * 3) In one line, declare a String variable with the identifier lowerCase and assign it the result of a method call
     *      on the movieName object reference that returns a String with all lowercase letters.
     *
     * 4) In one line, declare a String variable with the identifier noCommas and assign it the result of a method call
     *      on the movieName object reference that replaces all of the commas in the String with nothing (i.e. removes them)
     *
     * 5) In one line, declare a char variable with the identifier firstCharacter and assign it the result of a method call
     *      on the movieName object reference that returns the char (letter) at the start of the String
     *
     * 6) Declare an int variable with the identifier lengthOfString and assign it the result of a method call
     *      on the movieName object reference that returns the length of the String. 
     *
     * 7) Declare an int variable with the identifier indexOfFirstLowerCaseA and assign it the result 
     *      of a method call on the movieName object reference that returns the index position (location) 
     *      of the first occurrence of the letter a within that String. 
     * 
     * 8) Declare an int variable with the identifer indexOfLastLowerCaseA and assign it the result
     *      of a method call on the movieName object reference that returns the index position (location)
     *      of the last occurrence of the letter a within that String. 
     * 
     * 9) Declare a String variable with the identifier substring and assign it the result 
     *      of a method call on the movieName object reference that returns the part of that String
     *      between index positions 7 and 10. 
     * 
     * 10) Declare a boolean variable with the identifier containsWordMad and assign it the result
     *      of a method call on the movieName object reference that returns whether or not that
     *      String contains the character sequence (String) "Mad".
     * 
     * 11) Declare a boolean variable with the identifier endsWith_world and assign it the result
     *      of a method call on the movieName object reference that returns whether or not that
     *      String ends with the String "world". 
     */

    // Your code here:
    String movieName = "It's a Mad, Mad, Mad, Mad World";
    String upperCase = movieName.toUpperCase();
    String lowerCase = movieName.toLowerCase();
    String noCommas = movieName.replaceAll(",", "");
    char firstCharacter = movieName.charAt(0);
    int lengthOfString = movieName.length();
    int indexOfFirstLowerCaseA = movieName.indexOf('a');
    int indexOfLastLowerCaseA = movieName.lastIndexOf('a');
    String substring = movieName.substring(7, 10);
    boolean containsWordMad = movieName.contains("Mad");
    boolean endsWith_world = movieName.endsWith("world");
}
