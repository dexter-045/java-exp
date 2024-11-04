import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.drawLine(70, 30, 200, 30);
        g.drawString("Line", 120, 50);

        
        g.drawOval(10, 10, 50, 100);
        g.drawString("Oval", 25, 130);

       
        g.drawRect(70, 70, 70, 70);
        g.drawString("Rectangle", 80, 160);

        
        g.drawString("It is a demo of various graphics objects", 40, 250);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Demo");
        GraphicsDemo panel = new GraphicsDemo();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
