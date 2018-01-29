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

public class Ball extends GameObject implements Moveable{
   private int xVelocity;
   private int yVelocity;
   private int diameter; 

    
    Ball(int xPosition, int yPosition, int diameter, Color color) {
       this.xCoordinatePos = xPosition;
       this.yCoordinatePos = yPosition;
       this.diameter = diameter;
       this.color = color;
       this.xVelocity = 1;
       this.yVelocity = 2;
       
    }

   @Override
   public void draw(Graphics g) {
       g.setColor(color);
       g.fillOval(xCoordinatePos, yCoordinatePos, diameter, diameter);
   }
   
   @Override
   public Rectangle getBounds() {
       Rectangle rectangle = new Rectangle(xCoordinatePos, yCoordinatePos, diameter, diameter);
       return rectangle;
   }
   
   @Override
   public void move() {
       xCoordinatePos += xVelocity;
       yCoordinatePos += yVelocity;
   }
}

