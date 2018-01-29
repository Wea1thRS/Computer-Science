import acm.graphics.*;
import java.awt.*;

public class friendbox extends GCompound {
    GRect friend;
    GLabel friendl;

    public friendbox() {
        friend = new GRect(0, 0, 70, 50);
        friend.setColor(Color.LIGHT_GRAY);
        friend.setFilled(true);
        friendl = new GLabel("Friend", 20, 30);
        friendl.setColor(Color.BLACK);
        add(friend);
        add(friendl);
    }
}