/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.awt.Color;
/**
 *
 * @author Ethan
 */
public class Ball {
    private String  name, str2;
    private boolean isBouncy; 
    private Color ballColor;

    public Ball() {
        name        = "Wally";
        isBouncy      = true;
        ballColor    = new Color(28,72,63);
    }
    public Ball(String ballName, boolean isBallBouncy, Color ballColor)
    {
        this.name        = ballName;
        this.isBouncy      = isBallBouncy;
        this.ballColor    = ballColor;
    }   
    public String getName()
    {
        return name;
    }

    public boolean getIsBouncy()
    {
        return isBouncy;
    }

    public Color getBallColor()
    {
        return ballColor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIsBouncy(boolean isBouncy)
    {
        this.isBouncy = isBouncy;
    }
    public void setBallColor(Color ballColor) {
        this.ballColor = ballColor;
    }
    @Override
    public String toString() {
        if(this.isBouncy == true) {
            str2 = "bouncy!";
        } else {
            str2 = "not bouncy.";
        }
        String str = "The ball's name is " + this.name + ". It is " + str2 + " It's color is " + this.ballColor + ".";
        return str;
    }    
}
