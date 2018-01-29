/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import ProvidedClasses.Student;

/**
 *
 * @author (Your Name Here)
 */
public class Question2 
{
    public static Object[] method()
    {
        /*
         * For this portion of the assignment you will be instantiating objects and calling methods using the Student class. 
         * The API for the Student class is included in the instructions posted on Blackboard.
         * 
         * When following the instructions, make sure that you have the correct identifiers for each step. If the identifiers
         *  are not correct, your code will not compile. 
         * 
         * Note: At the bottom of the code block is a line of code that is necessary for the unit test to function. 
         *  Ensure that you do not accidentally remove or modify it. 
         * 
         * When you are finished, you can run the unit tests located in the Question2Test.java
         *  file to verify the correctness of your solution.
         * 
         *
         * 1) Declare a String variable with the identifier oldName and assign it the value returned by calling
         *      the getName method on the student1 object reference. 
         *
         * 2) Declare an int variable with the identifier oldExamScore and assign it the value returned by calling
         *      the getFirstExamScore method on the student2 object reference. 
         *
         * 3) Declare a variable of type Student with an identifier of your choosing and make it reference the same object
         *      as the student1 object reference (i.e. assign it the value of the student1 variable)
         *
         * 4) Call the setName method on the object reference you declared in Part 3. 
         *      You may choose your own argument but should not use "John Doe". 
         *
         * 5) Declare a String variable with the identifier newName and assign it the result returned by calling the
         *      getName method on the student1 object reference. 
        * 
         * 6) Make the object reference you created in Part 3 reference the same object as the student2 object reference
         *      (i.e. assign it the value of the student2 variable)
         *
         * 7) Call the setExamScores method on the object reference you created in Part 3 and reassigned in Part 6. 
         *      You may choose your own arguments but should not use 0 for any of the values.
         *
         * 8) Declare an int variable with the identifier newExamScore and assign it the result returned by calling the
         *      getFirstExamScore method on the student2 object reference. 
         *
         * 9) Call the setName method on the student3 object reference. You may choose any value
         *      for the argument so long as it is different than "Farris Bueller". 
         *
         * When running the unit tests for this class you may want to pay special attention to the output that lists the
         *  values for the different object references and variables in order to see if the values they contain
         *  match your expectations for what you think they should be. If they do not, you may want to stop
         *  and spend some time examining your thinking to determine why you expected something different. 
         * 
         */

        // Provided Code. Do not remove.
        Student student0 = new Student(); 
        Student student1 = new Student();
        Student student2 = new Student("Farris Bueller");
        Student student3 = new Student("Farris Bueller");

        // Your code here:
        String oldName = student1.getName();
        int oldExamScore = student2.getFirstExamScore();
        Student aStudent = student1;
        aStudent.setName("Johnny Doe");
        String newName = student1.getName();
        aStudent = student2;
        aStudent.setExamScores(100,100,100);
        int newExamScore = student2.getFirstExamScore();
        student3.setName("Fairest Bowler");
     
        // This code is necessary for the unit tests to function. 
        // If it contains any compiler errors, it is likely because you have mispelled one of the identifiers for your variables
        return new Object[] {student0, student1, student2, student3, oldName, oldExamScore, newName, newExamScore};
    }
        
        
        

   
    
  
}
