import java.applet.*;
import java.awt.*;

/*
<applet code="ShapeApplet" width=300 height=300></applet>
*/

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 60); // rectangle
        g.setColor(Color.RED);
        g.drawOval(50, 150, 100, 100); // circle
    }
}
