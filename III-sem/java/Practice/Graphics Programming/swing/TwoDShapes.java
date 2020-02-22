/**
    @author wasitshafi
    @since  21-02-2020
*/
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class Component1 extends JComponent
{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g; // casting

        int leftX = 100;
        int topY = 100;
        int width = 200;
        int height = 150;

        // rectangle        
        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);

        // ellipse within rectange
        Ellipse2D ellip = new Ellipse2D.Double();
        ellip.setFrame(rect); // or we can simply provide coordinate 
        g2.setPaint(Color.GREEN);
        g2.draw(ellip);

        // line
        Line2D line = new Line2D.Double(leftX, topY, leftX + width, topY + height);
        g2.setPaint(Color.RED);
        g2.draw(line);

        //circle
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;
        
        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.setPaint(Color.BLUE);
        g2.draw(circle); 
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(WIDTH, HEIGHT);
    }
}
class TestFrame extends JFrame
{
    TestFrame()
    {
        Component1 c = new Component1();
        c.setBackground(Color.PINK);
        add(c);
        pack();
        setLocationByPlatform(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class TwoDShapes
{
    public static void main(String... args)
    {
        EventQueue.invokeLater(()->{
            TestFrame f = new TestFrame();
            f.setVisible(true);
        });
    }
}