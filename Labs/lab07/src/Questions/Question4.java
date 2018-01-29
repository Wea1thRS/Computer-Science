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
public class Question4 {

    public static Object[] question4(Student student1, Student student2) {
        /*  For this exercise you will be using for loops to calculate various values.
            You will be making use of the following object references which are passed as arguments to this method:
                A Student object reference student1
                A Student object reference student2
            You will need to use various accessor methods of the Student class to complete this assignment. 
            Additional variables that you will use have already been declared.

            1) Set the value of student1HighestGrade to the highest grade for student1
            2) Set the value of student2HighestGrade to the highest grade for student2
            3) Set the value of student1AverageGrade to the average grade for student1
            4) Set the value of student2AverageGrade to the average grade for student2
            5) Assign the bestHighGradeStudent object reference whichever student has the best high grade
            6) Assign the bestAverageGradeStudent object reference whichever student has the best average grade

            This program contains a main method that can be used to manually test your code by right-clicking Question4.java
            and selecting "Run File"   
         */

        int student1HighestGrade = 0, student2HighestGrade = 0;
        double student1AverageGrade, student2AverageGrade;
        Student bestAverageGradeStudent, bestHighGradeStudent;
        double total = 0;
        // Your code goes Here:
        for (int i = 0; i <= 7; i++) {
            double examScore = student1.getExamScore(i);
            if(student1HighestGrade < examScore)
                student1HighestGrade = (int) examScore;
            total += examScore;            
        }
        student1AverageGrade = total/8;
        total = 0;
        for (int i = 0; i <= 7; i++) {
            double examScore = student2.getExamScore(i);
            if(student2HighestGrade < examScore)
                student2HighestGrade = (int) examScore;
            total += examScore;            
        }
        student2AverageGrade = total/8;
        if(student1AverageGrade > student2AverageGrade)
            bestAverageGradeStudent = student1;
        else
            bestAverageGradeStudent = student2;
        if(student1HighestGrade > student2HighestGrade)
            bestHighGradeStudent = student1;
        else
            bestHighGradeStudent = student2;

        // Necessary for Unit Test  
        return new Object[]{student1HighestGrade, student2HighestGrade, student1AverageGrade, student2AverageGrade, bestHighGradeStudent, bestAverageGradeStudent};
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s2.setName("John Doe");

        System.out.println("Student1: " + s1);
        System.out.println("Student2: " + s2);

        Object[] o = question4(s1, s2);

        System.out.println("student1HighestGrade    = " + (int) o[0]);
        System.out.println("student2HighestGrade    = " + (int) o[1]);
        System.out.println("student1AverageGrade    = " + (double) o[2]);
        System.out.println("student2AverageGrade    = " + (double) o[3]);
        System.out.println("bestHighGradeStudent    = " + ((Student) o[4]).getName());
        System.out.println("bestAverageGradeStudent = " + ((Student) o[5]).getName());
    }
}
