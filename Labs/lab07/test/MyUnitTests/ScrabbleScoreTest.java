/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyUnitTests;

import static Questions.ScrabbleScore.calculateScore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class ScrabbleScoreTest {
    
    public ScrabbleScoreTest() {
    }

    @Test
    public void templateTest() 
    {
        // setup test values
        String test = "this is a test";
        // set expected result
        int testExpected = 14;
        // get actual result
        int testActual = calculateScore(test);
        // compare expected and actual results
        assertEquals("You failed",testExpected, testActual);
    }
    @Test
    public void templateTest2() 
    {
        // setup test values
        String test = "abcdefghijklmnopqrstuvwxyz";
        // set expected result
        int testExpected = 87;
        // get actual result
        int testActual = calculateScore(test);
        // compare expected and actual results
        assertEquals("You failed",testExpected, testActual);
    }
}
