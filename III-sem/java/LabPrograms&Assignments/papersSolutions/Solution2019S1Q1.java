/** 
    @author wasitshafi
    @since  10-02-2020
*/
import java.util.Scanner;
import java.math.BigInteger; 

public class Solution2019S1Q1
{
    public static BigInteger factorial(int n)
    {
        BigInteger fact = BigInteger.ONE;
        for(int i = n ; i > 1 ; i--) fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }

    public static void main(String []args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("n... ");
        n = scan.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}