package Questions.Chapter9;

import ProvidedClasses.Person; 
import java.util.ArrayList; 

/**
 *
 * @author (Your Name Here)
 */

/*  For this exercise, you will need to declare a number of multidimensional arrays based on the following instructions.
    *NOTE You do not need to instantiate any of these arrays.
    *NOTE All of these should be declared as instance variables of the Question1 class. 

    Make sure to use meaningful identifiers for your object references as you will be graded on this as well. 

    1) Declare a two-dimensional array of type int to store student grades.
    2) Declare a multi-dimensional array that can be used to store tax rates across multiple cities and states. 
    3) Declare a multi-dimensional array that can be used to store several friends' top 3 movies (the array will store the movie titles)
        from different genres for each decade over the last 30 years.
    4) Declare a multi-dimensional array that can be used to store the results of a multiple choice survey (answers a, b, c, d, e)
        for a group of students. 
    5) Declare a multi-dimensional array of type Person that can be used to store a chore list for a group of people for every day of the week
        and every week of the year. 
    6) Declare a multi-dimensional array that can be used to track the results of a true/false quiz given to students. Make sure that
        your solution can account for students' leaving an answer blank. 
    7) Declare a nine-dimensional array of type int. 
*/
public class Question1 
{  
     int[][] grades = new int[10][100];
     double[][] rates = new double[10][5];
     String[][][] movies = new String[10][3][30];
     char[][] answers = new char[100][100];
     Person[][][] chores = new Person[10][7][52];
     Boolean[][] quiz = new Boolean[10][20];
     int[][][][][][][][][] ninedimensions;
}
