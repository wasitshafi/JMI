/**
	@author wasitshafi
	@since  12-02-2020
*/
/*
	Write a GUI application using swing that calculates the income tax of a person. The program takes annual income as input
	& computes income tax(IT) based on following criteria :
	Income 				      Tax Rate
	0 - 2,00,000				NIL
	2,50,001  - 5,00,000        5%
	5,00,0001 - 10,00,000		20%
	Above 10 lakh               30%
*/
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI extends JFrame implements ActionListener{
	JButton bt1;
	JTextField txtF;
	JLabel lbl, lb;
	GUI()
	{
		setVisible(true);
		setSize(400, 400);
		setLayout(new FlowLayout());
		lb = new JLabel("Tax Amount : ");
		lbl = new JLabel("0");
		
		bt1 = new JButton("OK");
		txtF = new JTextField(10);
		add(txtF);
		add(bt1);
		add(lb);
		add(lbl);

	   bt1.addActionListener(this);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{		 
		 double income, amt, tax;
		 income = 0;
		 try
		 {
  			 income = Double.parseDouble(txtF.getText());
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 if(income > 1000000)
		 {
			amt = income - 1000000;
			tax = amt * .3;
			tax += 500000 * .2;
			tax += 250000 * .05;
		 }
		 else if(income > 500000)
		 {
			amt = income - 500000;
			tax = amt * .2;
			tax += 250000 * .05;
		 }
		 else if(income > 250000)
		 {
			amt = income - 250000;
			tax = amt * .05;
		 }
		 else
			 tax = 0;
		 lbl.setText(tax + "");
	}
}
public class Solution2019LAB
{
	public static void main(String args[])
	{
		GUI o = new GUI();
	}
}