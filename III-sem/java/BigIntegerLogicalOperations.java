import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerLogicalOperations
{
    public static void main(String[] args)
    {
        String s1, s2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter BigInteger 1 : ");
        s1 = scan.next();
        System.out.print("Enter BigInteger 2 : ");
        s2 = scan.next();

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        System.out.print("Enter Integer Value : ");
        Integer x  = scan.nextInt();

        System.out.println("BigInteger 1 : " + b1);
        System.out.println("BigInteger 2 : " + b2);
        
        if( BigInteger.valueOf(x).compareTo(b1) > 0 )
            System.out.println("Integer Variable(x) is greater than biginteger(b1).");
        else if ( BigInteger.valueOf(x).compareTo(b1) > 0 )
            System.out.println("Integer Variable(x) is less than biginteger(b1).");
        else
            System.out.println("Both are equal");
        
        System.out.println("\n\n");
        System.out.println("b1 & b2 : " + b1.and(b2));
        System.out.println("b1 | b2 : " + b1.or(b2));
        System.out.println("b1 xor b2 : " + b1.xor(b2));
        scan.close();
    }
}