/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class LiopleurodonTest
{

    @Test
    public void testIsMagicalMutatorMethod()
    {
        // Create an instance of the class
        Liopleurodon testObject = new Liopleurodon();
        
        // Predetermine the expected result assuming the method works
        boolean expected = false; 
        
        // Call the method that performs the operation we want to test
        testObject.setIsMagical(false);
        
        // Get the actual result by using an accessor method
        boolean actual = testObject.isIsMagical();
        
        // Use an assert method to check if the results match
        assertEquals(expected, actual);
        
        // Note: Full version of this method call would be of the form:
        //
        //      org.junit.Assert.assertEquals(expected, actual);
        //
        // However, we have imported the static methods of the package org.junit.Assert 
        //  so that part of the method call in this case 
    }
    @Test
    public void testSetNameMutatorMethod() {
        Liopleurodon testObject = new Liopleurodon();
        testObject.setName("Penguin");
        String expected = "Penguin";
        String actual = testObject.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void testSetOccupationMutatorMethod() {
        Liopleurodon testObject = new Liopleurodon();
        testObject.setOccupation("Dentist");
        String expected = "Dentist";
        String actual = testObject.getOccupation();
        assertEquals(expected, actual);
    }
    @Test
    public void testSetLocationMutatorMethod() {
        Liopleurodon testObject = new Liopleurodon();
        testObject.setLocation("Boston");
        String expected = "Boston";
        String actual = testObject.getLocation();
        assertEquals(expected, actual);
    }
    
}
