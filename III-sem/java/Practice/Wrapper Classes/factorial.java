//factorial.java
//
//program to print factorial of numbers from 1 to n
//
import java.util.Scanner;
import java.lang.*;

public class factorial{
    public static void main(String []args)
    {
        BigInteger fact = 1;
        Scanner scan = new Scanner(System.in);
        int i, n;
        System.out.print("Enter value of n : ");
        n = scan.nextInt();
System.out.print("Value of fact is : " + fact);

/*        for( i = 0 ; i <= n ; i++)
        {
            System.out.println("Factorial of " + i + " is : " + fact);
            fact = fact.multiply(BigInteger.ValuOf(i));
        }
    */    }

}