/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions.Files;

import ProvidedClasses.melody.audio.Note;
import ProvidedClasses.melody.audio.Pitch;
import java.io.File;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author araderma
 */
public class MelodyTest {
    
    static Melody testMelody;
    
    static Field[] instanceVars; 
    static Constructor[] constructors;
    static Method[] methods;
    
    @BeforeClass
    public static void setUpClass() 
    {
        testMelody = new Melody(new File("res/melodies/happybirthday.txt"));
        
        instanceVars = testMelody.getClass().getDeclaredFields();
        constructors = testMelody.getClass().getDeclaredConstructors();
        methods = testMelody.getClass().getDeclaredMethods();
        
        outputInformation();
    }
    
    @Before
    public void setUp() {
        //Reload the melody before each test!
        testMelody = new Melody(new File("res/melodies/happybirthday.txt"));
    }
    
     public static void outputInformation()
    {
        System.out.println("Instance Variables:");
        for(Field f : instanceVars)
        {
            System.out.print(" Identifier: " + f.getName() + "\n");
            System.out.print(" Access Modifier: " + Modifier.toString(f.getModifiers()) + "\n");
            System.out.print(" Type: " + f.getType().getCanonicalName().substring(f.getType().getCanonicalName().lastIndexOf(".") + 1) + "\n\n");
            
        }
        
        System.out.println("Methods:");
        for(Method m : methods)
        {
             System.out.print(" Identifier: " + m.getName() + "\n");
             System.out.print(" Access Modifier: " + Modifier.toString(m.getModifiers()) + "\n");
             System.out.print(" Return Type: " + m.getReturnType().getCanonicalName().substring(m.getReturnType().getCanonicalName().lastIndexOf(".") + 1) + "\n");
             System.out.print(" Parameters:");
             
             Class[] params = m.getParameterTypes(); 
             
             for(int i = 0; i < params.length; i++)
             {
                 String name = params[i].getName().substring(params[i].getName().lastIndexOf(".") + 1);
                 
                 System.out.print(" " + name);
                 
                 if(i != params.length -1)
                 {
                     System.out.print(",");
                 }
             }
             
             System.out.println("\n");
        }   
        
        System.out.println("Constructors:");
        for(Constructor m : constructors)
        {
             System.out.print(" Identifier: " + m.getName().substring(m.getName().lastIndexOf(".") + 1) + "\n");
             System.out.print(" Access Modifier: " + Modifier.toString(m.getModifiers()) + "\n");
             System.out.print(" Parameters:");
             
             Class[] params = m.getParameterTypes(); 
             
             for(int i = 0; i < params.length; i++)
             {
                 String name = params[i].getName().substring(params[i].getName().lastIndexOf(".") + 1);
                 
                 System.out.print(" " + name);
                 
                 if(i != params.length -1)
                 {
                     System.out.print(",");
                 }
             }
             
             System.out.println("\n");
        }
    }
        
    
    @Test
    public void testInstanceVariables_CorrectNumber()
    {
        int num = instanceVars.length; 
        
        assertEquals("Incorrect number of instance variables." , 3, num);
    }
    
    @Test
    public void testInstanceVariables_CorrectAccessModifiers() 
    {
        if (instanceVars.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for(Field f : instanceVars)
        {
            int mod = f.getModifiers();
            
            if(!Modifier.isPrivate(mod))
            {
                fail("The access modifier for the instance variable " + f.getName() + " is not set to private.");
            }
        }
    }
    
    @Test
    public void testInstanceVariables_CorrectTypes()
    {
        if (instanceVars.length != 3)
        {
            fail("Incorrect number of instance variables");
        }
        
        for (Field f : instanceVars)
        {
            // Gets the type and removes package formatting
            String type = f.getType().toString().substring(f.getType().toString().lastIndexOf(".") + 1);
            
            if(f.getName().toLowerCase().contains("title"))
            {
                assertEquals(f.getName() + " is the wrong type.", "String", type);
            }
            else if(f.getName().toLowerCase().contains("artist"))
            {
                assertEquals(f.getName() + " is the wrong type.", "String", type);
            }
            else if(f.getName().toLowerCase().contains("note"))
            {
                assertEquals(f.getName() + " is the wrong type.", "Note;", type); // Not sure why, but the semicolon allows me to use arrays as the type?
            }
            else
            {
                fail(f.getName() + " may not be a good identifier.");
            }
        }   
    }
        
    //Don't need to test method names, because they are given. So onto specific method calls.
    @Test
    public void testGetArtist() {
        String actual = testMelody.getArtist();
        String expected = "Patty Hill and Mildred J. Hill";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTitle() {
        String actual = testMelody.getTitle();
        String expected = "Happy Birthday";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTotalDuration() {
        double actual = testMelody.getTotalDuration();
        double expected = 13.0;
        assertEquals(expected, actual, .0001);
    }
    
    @Test
    public void testGetTotalDurationWithRepeat() {
        testMelody = new Melody(new File("res/melodies/twolownotes.txt"));
        double actual = testMelody.getTotalDuration();
        double expected = 2.0;
        assertEquals(expected, actual, .0001);
    }
    
    private Note[] getNoteArray(Melody melody) {
        Note[] retval = null;
        for (Field f : instanceVars)
        {
            try {
                // Gets the type and removes package formatting
                if(f.getName().toLowerCase().contains("note")) {
                    f.setAccessible(true);
                    retval = (Note[])f.get(testMelody);
                }
                //Hashtable iWantThis = (Hashtable) f.get(testMelody); //IllegalAccessException
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(MelodyTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MelodyTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        return retval;
    }
    
    @Test
    public void testOctaveUp() {
        testMelody.octaveUp();
        Note[] testArray = getNoteArray(testMelody);
        int[] newOctave = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 5, 5, 5, 5, 6, 6, 5, 5, 5, 5};
        for (int i = 0; i < newOctave.length; i++) {
            if (testArray[i].getOctave() != newOctave[i]) {
                assertEquals(newOctave[i], testArray[i].getOctave());
            }
        }
    }
    
    @Test
    public void testOctaveUpReturnValueTrue() {
        boolean actual = testMelody.octaveUp();
        boolean expected = true;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testOctaveUpReturnValueFalse() {
        testMelody = new Melody(new File("res/melodies/onehighnote.txt"));
        boolean actual = testMelody.octaveUp();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    
    @Test
    public void testOctaveUpNoChangeValues() {
        testMelody = new Melody(new File("res/melodies/onehighnote.txt"));
        Note[] testArray = getNoteArray(testMelody);
        testMelody.octaveUp();
        int[] newOctave = {10};
        for (int i = 0; i < newOctave.length; i++) {
            if (testArray[i].getOctave() != newOctave[i]) {
                assertEquals("Melody changed when it shouldn't have during OctaveUp", newOctave[i], testArray[i].getOctave());
            }
        }
    }
    
    @Test
    public void testOctaveDown() {
        testMelody.octaveDown();
        Note[] testArray = getNoteArray(testMelody);
        int[] newOctave = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 3, 3, 4, 4, 3, 3, 3, 3};
        for (int i = 0; i < newOctave.length; i++) {
            if (testArray[i].getOctave() != newOctave[i]) {
                assertEquals(("Error on note " + i), newOctave[i], testArray[i].getOctave());
            }
        }
    }
    
    @Test
    public void testOctaveDownReturnValueTrue() {
        boolean actual = testMelody.octaveDown();
        boolean expected = true;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testOctaveDownReturnValueFalse() {
        testMelody = new Melody(new File("res/melodies/twolownotes.txt"));
        boolean actual = testMelody.octaveDown();
        boolean expected = false;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testOctaveDownNoChangeValues() {
        testMelody = new Melody(new File("res/melodies/twolownotes.txt"));
        Note[] testArray = getNoteArray(testMelody);
        testMelody.octaveDown();
        int[] newOctave = {1, 1};
        for (int i = 0; i < newOctave.length; i++) {
            if (testArray[i].getOctave() != newOctave[i]) {
                assertEquals("Melody changed when it shouldn't have during OctaveDown", newOctave[i], testArray[i].getOctave());
            }
        }
    }
    
    @Test
    public void testChangeTempoFaster() {
        double newTempo = 0.5;
        testMelody.changeTempo(newTempo);
        Note[] testArray = getNoteArray(testMelody);
        double[] newTempoArray = {.25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            .5 * newTempo, 1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, 
            .5 * newTempo, 1.5 * newTempo};
        for (int i = 0; i < newTempoArray.length; i++) {
            if (testArray[i].getDuration() != newTempoArray[i]) {
                assertEquals(("Error on note " + i), newTempoArray[i], testArray[i].getOctave(), .0001);
            }
        }
    }
    
    @Test
    public void testChangeTempoSlower() {
        double newTempo = 2.0;
        testMelody.changeTempo(newTempo);
        Note[] testArray = getNoteArray(testMelody);
        double[] newTempoArray = {.25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, .5 * newTempo, 
            .5 * newTempo, 1 * newTempo, .25 * newTempo, .25 * newTempo, .5 * newTempo, .5 * newTempo, 
            .5 * newTempo, 1.5 * newTempo};
        for (int i = 0; i < newTempoArray.length; i++) {
            if (testArray[i].getDuration() != newTempoArray[i]) {
                assertEquals(("Error on note " + i), newTempoArray[i], testArray[i].getOctave(), .0001);
            }
        }
    }
    
    @Test
    public void testReverseOdd() {
        testMelody.reverse();
        Note[] testArray = getNoteArray(testMelody);
        Pitch[] newPitchArray = {Pitch.G, Pitch.A, Pitch.G, Pitch.B, Pitch.C, Pitch.C, Pitch.E, Pitch.F,
            Pitch.G, Pitch.B, Pitch.D, Pitch.D, Pitch.D, Pitch.G, Pitch.A, Pitch.D, Pitch.E, Pitch.D, Pitch.D,
            Pitch.F, Pitch.G, Pitch.D, Pitch.E, Pitch.D, Pitch.D};
        for (int i = 0; i < newPitchArray.length; i++) {
            if (testArray[i].getPitch() != newPitchArray[i]) {
                assertEquals(("Error on note " + i), newPitchArray[i].toString(), testArray[i].getPitch().toString());
            }
        }
    }
    
    
    //TODO: Load an even length song
    @Test
    public void testReverseEven() {
        testMelody = new Melody(new File("res/melodies/twolownotes.txt"));
        testMelody.reverse();
        Note[] testArray = getNoteArray(testMelody);
        Pitch[] newPitchArray = {Pitch.D, Pitch.C};
        for (int i = 0; i < newPitchArray.length; i++) {
            if (testArray[i].getPitch() != newPitchArray[i]) {
                assertEquals(("Error on note " + i), newPitchArray[i].toString(), testArray[i].getPitch().toString());
            }
        }
    }
    
    @Test
    public void testNoteArraySize() {
        Note[] testArray = getNoteArray(testMelody);
        int actual = testArray.length;
        int expected = 25;
        assertEquals("Note Array has an incorrect size.", expected, actual);
    }
    
    
}
