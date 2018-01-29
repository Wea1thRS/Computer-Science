/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questions;
import java.awt.Color;
/**
 *
 * @author ethan.hedrick
 */
public class Dog {
    private final String  name; 
    private int tricks; 
    private final Color furColor;

    public Dog() {
        name        = "Bill";
        tricks      = 3;
        furColor    = new Color(28,72,63);
    }
    public Dog(String dogName, int amountOfTricks, Color coatColor)
    {
        name        = dogName;
        tricks      = amountOfTricks;
        furColor    = coatColor;
    }   
    public String getName()
    {
        return name;
    }

    public int getTricks()
    {
        return tricks;
    }

    public Color getFurColor()
    {
        return furColor;
    }
    public void setTricks(int tricksLearned)
    {
        this.tricks = tricksLearned;
    }
    @Override
    public String toString() {
        String str = "The dog's name is " + this.name + ". It can perform " + this.tricks + " tricks. It's fur color is " + this.furColor + ".";
        return str;
    }    
}
