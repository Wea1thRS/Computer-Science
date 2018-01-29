/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ethan.hedrick
 */
public class Brick {
    int xPos, yPos, width, height;
    Color color;

    Brick(int xPos,int yPos,int width,int height, Color color) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void setX(int xPos) {
        this.xPos = xPos;
    }
    public void setY(int yPos) {
        this.yPos = yPos;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getX() {
        return xPos;
    }
    public int getY() {
        return yPos;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Color getColor() {
        return color;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPos,yPos, width, height);
        g.setColor((color.darker().darker()));
        g.drawLine(xPos, yPos, xPos+width, yPos); //top of brick
        g.drawLine(xPos,yPos+height,xPos+width,yPos+height); //bottom of brick
        g.drawLine(xPos,yPos,xPos,(yPos+height)/2); //top half of left side of brick
        g.drawLine(xPos+width,yPos+height/2,xPos+width,yPos+height); //bottom half of right side of brick
        g.drawLine((xPos+width)-((width/3)*2),(yPos+height)/2,(xPos+width)-((width/3)*2),yPos+height); //1/3 of width to bottom
        g.drawLine((xPos+width)-(width/3), yPos,(xPos+width)-(width/3), (yPos+height)/2); //2/3 of width to top 
        g.drawLine(xPos,(yPos+height)/2,xPos+width,(yPos+height)/2); //horizontal middle of brick
        g.setColor(color);
        //g.fillRect(xPos, yPos, width, height);
    }
}