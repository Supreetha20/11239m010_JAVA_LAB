import javax.swing.*;
import java.awt.*;

public class FaceSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face outline
        g.setColor(Color.ORANGE);
        g.fillOval(70, 50, 150, 150);

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(100, 90, 20, 20);
        g.fillOval(150, 90, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(107, 97, 6, 6);
        g.fillOval(157, 97, 6, 6);

        // Nose
        g.setColor(Color.BLACK);
        g.drawLine(135, 110, 135, 130);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(110, 140, 50, 20, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new FaceSwing());
        frame.setVisible(true);
    }
}
