/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;

/*
 *
 * @author Ethan
 */
public class Ball {

    int xPosition, yPosition, diameter, xVelocity, yVelocity;
    Color color;

    Ball() {
        this.xPosition = 0;
        this.yPosition = 0;
        this.diameter = 20;
        this.xVelocity = 0;
        this.yVelocity = 0;
        this.color = Color.RED;
    }

    Ball(int xPosition, int yPosition, int diameter, int xVelocity, int yVelocity, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.color = color;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public int getXVelocity() {
        return this.xVelocity;
    }

    public int getYVelocity() {
        return this.yVelocity;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public Color getColor() {
        return this.color;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move() {
        this.xPosition += this.xVelocity;
        this.yPosition += this.yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }
}
