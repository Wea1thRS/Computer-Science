/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Ethan
 */
public abstract class GameObject implements Drawable {

    protected int xCoordinatePos;
    protected int yCoordinatePos;
    protected Color color;

    public int getXCoordinatePos() {
        return xCoordinatePos;
    }

    public int getYCoordinatePos() {
        return yCoordinatePos;
    }

    public Color getColor() {
        return color;
    }

    public void setXCoordinatePos(int setXCoordinatePos) {
        xCoordinatePos = setXCoordinatePos;
    }

    public void setYCoordinatePos(int setYCoordinatePos) {
        yCoordinatePos = setYCoordinatePos;
    }

    public void setColor(Color setColor) {
        color = setColor;
    }

    @Override
    public abstract void draw(Graphics g);

    public abstract Rectangle getBounds();
}
