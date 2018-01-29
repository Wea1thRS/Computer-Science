/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.util.*;
import ProvidedClasses.*;
/**
 *
 * @author Ethan
 */
public class MyPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Student's name?");
        String name = scanner.nextLine();
        Random rand = new Random();
        int randomNumber = rand.nextInt(99999)+1;
        int num1 = 4;
        int num2 = 20;
        int num3 = 27;
        Student student = new Student(name, randomNumber, num1, num2, num3);
        System.out.println(student);J
    }
}
