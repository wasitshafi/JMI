/**
    @author wasitshafi
    @since  21-02-2020
*/
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class Component1 extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g; // casting

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(200, 200, 50, 50);
        g2.setPaint(Color.BLUE);
        g2.fill(circle);
        g2.draw(circle);

        Rectangle2D rect = new Rectangle2D.Double(400, 200, 300, 300);
        g2.setPaint(new Color(125, 145, 200)); //using RGB()
        g2.fill(rect);
        g2.draw(rect);
                
        setBackground(Color.BLUE);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(400, 400);
    }
}
class TestFrame extends JFrame
{
    TestFrame()
    {
        Component1 c = new Component1();
        add(c);
        pack();
        setLocationByPlatform(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class ColorDemo
{
    public static void main(String... args)
    {
        EventQueue.invokeLater(()->{
            TestFrame f = new TestFrame();
            f.setVisible(true);
        });
    }
}