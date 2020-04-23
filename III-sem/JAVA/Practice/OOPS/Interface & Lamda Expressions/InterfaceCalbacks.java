import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import static java.lang.System.out;

class Mytask implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        out.println("Hello World");
        Toolkit.getDefaultToolkit().beep();0
    }
}

public class InterfaceCalbacks
{
    public static void main(String... args)
    {
        // Method 1
        /*
        Mytask mt = new Mytask();
        ActionListener listener = mt;
        Timer t = new Timer(1000, listener);
        */
        
        // Method 2
        /*
        Mytask mt = new Mytask();
        Timer t = new Timer(1000, mt);
        */
        
        // Method 3
        Timer t = new Timer(1000, new Mytask()); // using Anonmyous object
   
        t.start();
        // to hold the program
        JOptionPane.showMessageDialog(null, "Quit Program?");
        t.stop(); // or System.exit();
    }
}