/**
    @author wasitshafi
    @since  09-02-2020
*/
import java.util.Scanner;
import java.math.BigInteger;

public class Solution2017Q1B
{
    static BigInteger getFactorial(BigInteger n)
    {
        if(n.compareTo(BigInteger.valueOf(1)) <= 0)
        {
            return n;
        }
        return n.multiply(getFactorial(n.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String... args)
    {
        String s;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter n... ");
        s = scan.next();

        BigInteger n = new BigInteger(s);
        System.out.println(s + "! = " + getFactorial(n));   
    }
}