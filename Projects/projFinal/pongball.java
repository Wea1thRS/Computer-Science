import acm.graphics.*;
import java.awt.*;

public class pongball extends GCompound {
    GOval inside, outside, glow, base;

    public pongball() {
        glow = new GOval(0, 0, 25, 25);
        glow.setColor(new Color(30, 255, 30, 70));
        add(glow);
        glow.setFilled(true);
        outside = new GOval(5, 5, 15, 15);
        base = new GOval(5,5,15,15);
        base.setColor(Color.RED);
        base.setFilled(true);
        outside.setColor(new Color(255, 255, 0));
        outside.setFilled(true);
        add(base);
        add(outside);
        inside = new GOval(10, 10, 5, 5);
        inside.setFilled(true);
        inside.setColor(new Color(94, 94, 94));
        add(inside);
    }
}

