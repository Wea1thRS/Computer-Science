/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import javax.swing.JApplet;
/**
 *
 * @author ethan.hedrick
 */
public class Wall extends JApplet{
    @Override
    public void paint(Graphics g) {
        AffineTransform tx = AffineTransform.getScaleInstance(1,-1);
        this.setSize(1000, 800);
        super.paint(g);
        Brick brick = new Brick(0,0,150,75,Color.RED);
        //Brick brick2 = new Brick(brick.getX()+brick.getWidth(),brick.getY(),brick.getWidth(),brick.getHeight(),Color.CYAN);
        Brick brick2 = new Brick(brick.getX()+brick.getWidth()+brick.getWidth(),brick.getY(),-brick.getWidth(),brick.getHeight(),Color.CYAN);
        Brick brick3 = new Brick(brick2.getX(),brick.getY(),brick.getWidth(),brick.getHeight(),Color.MAGENTA);
        //Brick brick4 = new Brick(brick3.getX()+brick.getWidth(),brick.getY(),brick.getWidth(),brick.getHeight(),Color.PINK);
        Brick brick4 = new Brick(brick3.getX()+brick.getWidth()+brick.getWidth(),brick.getY(),-brick.getWidth(),brick.getHeight(),Color.PINK);
        brick.draw(g);
        brick2.draw(g);
        brick3.draw(g);
        brick4.draw(g);
        Brick brick5 = new Brick(0+brick.getWidth(),75,-150,75,Color.WHITE);
        Brick brick6 = new Brick(brick5.getX(),brick5.getY(),brick.getWidth(),brick.getHeight(),Color.YELLOW);
        Brick brick7 = new Brick(brick6.getX()+brick.getWidth()+brick.getWidth(),brick5.getY(),-brick.getWidth(),brick.getHeight(),Color.ORANGE);
        Brick brick8 = new Brick(brick7.getX(),brick5.getY(),brick.getWidth(),brick.getHeight(),Color.GREEN);
        brick5.draw(g);
        brick6.draw(g);
        brick7.draw(g);
        brick8.draw(g);
        g.setColor(Color.BLACK);
        g.drawLine(brick.getX(),(brick5.getY()+brick5.getHeight()/2),brick.getX()+(brick.getWidth()*4),(brick5.getY()+brick5.getHeight()/2));
    }
}
