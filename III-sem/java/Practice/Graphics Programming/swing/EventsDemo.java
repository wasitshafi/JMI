import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TestFrame extends JFrame implements ActionListener
{
        JButton btAdd, btSub, btExit;
        JLabel lblText, lblResult;
        JTextField txtf1, txtf2;
    TestFrame()
    {
        lblText = new JLabel("Enter Numbers : ");
        txtf1 = new JTextField(5);
        txtf2 = new JTextField(5);
        btAdd = new JButton(new ImageIcon("addButtonImage.jpg"));
        btSub = new JButton("Subtract");
        lblResult = new JLabel("");
        btExit = new JButton("EXIT");

        setLayout(new FlowLayout());        
        add(lblText);
        add(txtf1);
        add(txtf2);
        add(btAdd);
        add(btSub);
        add(lblResult);
        add(btExit);

        setLocationByPlatform(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btAdd.addActionListener(this);
        btSub.addActionListener(this);
        setSize(400, 400);
        setResizable(false);

        btExit.addActionListener(ae->System.exit(0)); // using lamda expression
    }
    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(txtf1.getText());
        int num2 = Integer.parseInt(txtf2.getText());
        if(ae.getSource() == btAdd)
            lblResult.setText("Result : " + (num1 + num2) + "");
        else
            lblResult.setText("Result : " + (num1 - num2) + "");
    }
}

public class EventsDemo
{
    public static void main(String... args)
    {
        EventQueue.invokeLater(()->{
            TestFrame f = new TestFrame();
        });
    }
}