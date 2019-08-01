//
//factorial.java
//
//Program to compute factorial of n
//
import java.util.Scanner;
import java.math.BigInteger; 

public class factorial
{
    public BigInteger factorialOfN(int n)
    {
        BigInteger fact = new BigInteger("1");
        for( int i = n ; i > 1 ; i--)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
    public static void main(String []args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        factorial obj = new factorial();

        System.out.print("Enter value of n : ");
        n = scan.nextInt();

        System.out.println("Factorial of " + n + " is : " + obj.factorialOfN(n));
    }
}