/**
    @author wasitshafi
    @since  18-02-2020
*/
// Refer : horstman pg no : 543 - 548
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame; //'x' denotes swing belongs to extended version not from core java

class TestFrame extends JFrame
{
    public TestFrame()
    {
        Image icon = new ImageIcon("javaIcon.png").getImage();
        
        setIconImage(icon);
        setTitle("This is frame Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // By default frame is hidded when user clicks on close even while closing the last frame opened / we can also exit using 'System.exit()' method
        setResizable(false); // by default its true

        //setSize(500,500); //Default size id 0 by 0 pixels
        //setLocation(450, 10);// or setBound(x, y, width, height);
        //setLocationByPlatform(true); // It usually picks the location with a slight offset from the last window
              
        //setVisible(true); // Its by default false because after creating frame we can add components to it and later set its visibility true
    }
}
public class SwingDemo
{
    public static void main(String... args)
    {
        TestFrame f = new TestFrame();

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        int width  = screenSize.width;
        int height  = screenSize.height;


        EventQueue.invokeLater(()->{//we should initialize/configure all components in EvenQueue instead of outside (refer : horstman pg no 545)
            f.setVisible(true);
            f.setSize(width/2, height/2);
        });

        System.out.println("f.getTitle() : " + f.getTitle());
        System.out.println("f.ifLocationByPlatform() : " + f.getTitle());

        
        
        //System.out.println("width  : " + Toolkit.getDefaultToolkit().getScreenSize().width);
        //System.out.println("height : " + Toolkit.getDefaultToolkit().getScreenSize().height);
        //   or
        System.out.println("width  : " + width);
        System.out.println("height : " + height);
        System.out.println("End of main");
    }
}