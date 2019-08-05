import javax.swing.*;

public class eg extends JFrame
{
    public static void main(String []args)
    {
        new eg();
    }
    public eg()
    {
        this.setTitle("Illustration of the swing");
        this.setSize(300,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}