//factorial_BigIntegerNswing.java
//
//Q:  Write a Factorial problem using Big Number classes (such as BigInteger) to compute Factorial of a large number.
//    Take inputs from the user using Swing input dialog box and display output using message dialog.
//
import java.math.*;
import javax.swing.*;

public class factorial_BigIntegerNswing
{
    public static void main(String []args)
    {
        String input = JOptionPane.showInputDialog("Enter number ");
        int n = Integer.parseInt(input); // converting string to int  for more info read : https://www.mkyong.com/java/java-convert-string-to-int/

        BigInteger fact = new BigInteger("1"); // BigInteger has constructor that takes string argument


        for(int i = 1 ; i <= n ; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        JOptionPane.showMessageDialog(null, "Factorial of " + n + " is : " + fact);
       // JOptionPane.showMessageDialog
    }
}