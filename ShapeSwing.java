import javax.swing.*;
import java.awt.*;

public class ShapeSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 60);

        // Draw circle
        g.setColor(Color.RED);
        g.drawOval(50, 150, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometrical Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new ShapeSwing());
        frame.setVisible(true);
    }
}
