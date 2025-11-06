import java.applet.*;
import java.awt.*;

/*
<applet code="FaceApplet" width=300 height=300></applet>
*/

public class FaceApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(70, 50, 150, 150);

        g.setColor(Color.WHITE);
        g.fillOval(100, 90, 20, 20);
        g.fillOval(150, 90, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(107, 97, 6, 6);
        g.fillOval(157, 97, 6, 6);

        g.setColor(Color.BLACK);
        g.drawLine(135, 110, 135, 130);

        g.setColor(Color.RED);
        g.drawArc(110, 140, 50, 20, 0, -180);
    }
}
