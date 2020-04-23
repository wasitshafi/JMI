/**
    @author wasitshafi
    @since  20-02-2020
*/
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.EventQueue;

class ComponentDemo extends JComponent
{
    public static final int MESSAGE_X = 50;
    public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g)
    {
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
class TestFrame extends JFrame
{
    TestFrame()
    {
        add(new ComponentDemo());
        pack(); // top window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class JComponentDemo
{
    public static void main(String... args)
    {        
        EventQueue.invokeLater(()->{
            TestFrame f = new TestFrame();
            f.setTitle("JComponent Demo Program");
        });
    }
}