/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author (Your Name Here)
 */
public class Animation extends JApplet {

    /*  For this portion of the assignment, you will be creating a simple animation 
        of a ball that moves around the screen of an applet and bounces off of the
        walls.
    
        As part of this assignment, you will need to have first completed the Ball class. 
    
        1) Create an instance of the Ball class and make sure it can draw itself
        2) Complete the detectCollisions method that determines when your Ball object
            has collided with any of the walls, in which case it should reverse direction.
        3) Create an instance of the Timer class and assign it an ActionListener that
            moves the ball around and repaints the screen every time it triggers its event
     */
    Ball ball;
    public void init() {
        this.setSize(800,480);
        ball = new Ball(50, 50, 30, 2, 2, Color.RED);
        Timer t = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detectCollisions();
                ball.move();
                repaint();
            }
        });
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ball.draw(g);
    }

    public void detectCollisions() {
        if (ball.getXPosition() <= 0) {
            ball.setXVelocity(-ball.getXVelocity());
        }
        if (ball.getXPosition() + ball.getDiameter() >= 800) {
            ball.setXVelocity(-ball.getXVelocity());
        }
        if (ball.getYPosition() <= 0) {
            ball.setYVelocity(-ball.getYVelocity());
        }
        if (ball.getYPosition() + ball.getDiameter() >= 480) {
            ball.setYVelocity(-ball.getYVelocity());
        }
    }
}
