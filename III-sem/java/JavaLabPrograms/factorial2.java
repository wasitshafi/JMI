import java.math.*;
import javax.swing.*;

public class factorial2
{
    public static void main(String []args)
    {
        String input = JOptionPane.showInputDialog("Enter number ");
        int n = Integer.parseInt(input); // converting string to int  for more info read : https://www.mkyong.com/java/java-convert-string-to-int/

        BigInteger fact = new BigInteger("1"); // BigInteger has constructor that takes string argument


        for(int i = 1 ; i <= n ; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        System.out.print("Factorial of " + n + " is : " + fact);
    }
}