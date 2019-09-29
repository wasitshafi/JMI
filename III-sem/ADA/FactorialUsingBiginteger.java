//
//factorial1.java
//
//Program to compute factorial of n
//
import java.util.Scanner;
import java.math.BigInteger; 

public class FactorialUsingBiginteger
{
    public BigInteger factorialOfN(int n)
    {
        BigInteger fact = new BigInteger("1"); //BigInteger has a constructor where you can pass string as an argument.

        for( int i = n ; i > 1 ; i--)
            fact = fact.multiply(BigInteger.valueOf(i)); // convert Integer to BigInteger  // valueOf() takes only primitive int as argument
                                                         // & multiply() takes BigInteger type object that is why we convert 'i' to BigInteger
        return fact;
    }
    public static void main(String []args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        FactorialUsingBiginteger obj = new FactorialUsingBiginteger();

        System.out.print("Enter value of n : ");
        n = scan.nextInt();


        System.out.println("Factorial of " + n + " is : " + obj.factorialOfN(n));
    }
}