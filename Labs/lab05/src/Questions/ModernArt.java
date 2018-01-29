/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JApplet;

/**
 *
 * @author ethan.hedrick
 */
public class ModernArt extends JApplet {

    @Override
    public void paint(Graphics g) {
        this.setSize(1000, 800);
        super.paint(g);
        Font h = new Font("Helvetica", Font.BOLD, 43);
        Random rand = new Random();
        int[] xPoints;
        xPoints = new int[5];
        for (int i = 0; i < xPoints.length; i++) {
            Color col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            g.setColor(col);
            xPoints[i] = (int) (Math.random() * (570) + 30);
        }
        int[] yPoints;
        yPoints = new int[5];
        for (int i = 0; i < yPoints.length; i++) {
            Color col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            g.setColor(col);
            yPoints[i] = (int) (Math.random() * (770) + 30);
        }
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        for (int i = 0; i < xPoints.length; i++) {
            Color col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            g.setColor(col);
            xPoints[i] = (int) (Math.random() * (570) + 30);
        }
        for (int i = 0; i < yPoints.length; i++) {
            Color col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            g.setColor(col);
            yPoints[i] = (int) (Math.random() * (770) + 30);
        }
        g.fillPolygon(xPoints, yPoints, xPoints.length);
        g.drawRect(0, 0, 100, 100);
        Color col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.setColor(col);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.drawOval(300, 240, 75, 50);
        g.setColor(col);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.fillOval(300, 20, 40, 80);
        g.setColor(col);
        g.setFont(h);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.setColor(col);
        g.drawString("Hello World!", this.getWidth() / 2, this.getHeight() / 2);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.setColor(col);
        g.drawLine(500, 300, 650, 750);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.setColor(col);
        g.drawLine(800, 100, 150, 350);
        col = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
        g.setColor(col);
        g.drawLine(400, 200, 350, 250);
    }
}
