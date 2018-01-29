import acm.graphics.*;
import java.awt.*;

public class cpubox extends GCompound {
    GRect cpubox;
    GLabel cpubox1;

    public cpubox() {
        cpubox = new GRect(0, 0, 70, 50);
        cpubox.setColor(Color.LIGHT_GRAY);
        cpubox.setFilled(true);
        cpubox1 = new GLabel("CPU", 20, 30);
        cpubox1.setColor(Color.BLACK);
        add(cpubox);
        add(cpubox1);
    }
}