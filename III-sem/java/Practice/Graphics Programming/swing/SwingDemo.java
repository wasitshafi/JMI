import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class TestFrame extends JFrame implements ActionListener
{
    JLabel label1, label2, lblAns;
    JButton btadd, btsub;
    JTextField txtf1, txtf2;

    TestFrame()
    {
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());

        label1 = new JLabel("Enter number1 : ");
        label2 = new JLabel("Enter number2 : ");
        lblAns = new JLabel("");
        txtf1 = new JTextField(20); // size of textbox
        txtf2 = new JTextField(20); // size of textbox
        btadd = new JButton("ADD");
        btsub = new JButton("SUB");
        btadd.addActionListener(this);
        btsub.addActionListener(this);

        add(label1);
        add(txtf1);
        add(label2);
        add(txtf2);
        add(btadd);
        add(btsub);

        add(lblAns);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        int num1 = Integer.parseInt(txtf1.getText());
        int num2 = Integer.parseInt(txtf2.getText());
        if(ae.getSource() == btadd)
            lblAns.setText((num1 + num2) + ""); 
        else if(ae.getSource() == btsub)
            lblAns.setText((num1 - num2) + ""); 

    }
}
public class SwingDemo
{
    public static void main(String... args)
    {
        TestFrame obj = new TestFrame();

    }
}