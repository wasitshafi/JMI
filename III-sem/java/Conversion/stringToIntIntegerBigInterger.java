import java.util.Scanner;
import java.math.BigInteger;
public class stringToIntIntegerBigInterger
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String str;
        int INT;          // primitive int data type
        Integer INTEGER;       // wrapper class object
        BigInteger BIGINTEGER1;   // BigInteger class object

        System.out.print("Enter number(String) : ");
        str = scan.nextLine();

        // for more info read : https://bit.ly/2Zzmfk6    // i have used bitly for URL shortener
        INT = Integer.parseInt(str);          // parseInt returns primitive int
        INTEGER = Integer.valueOf(str);       // valueof return object 
        BIGINTEGER1 = BigInteger.valueOf(INT); // CTM valueOf(long) it takes int value rather than str
         
        BigInteger BIGINTEGER2 = new BigInteger(str);  // Instead of using valueOf(long) and parse(), you can directly use 
                                                      // the BigInteger constructor that takes a string argument:
        System.out.println("Value of str is " + str);
 
        System.out.println("\nint        : " + INT);
        System.out.println("Integer    : " + INTEGER);
        System.out.println("Biginteger : " + BIGINTEGER1);  
        System.out.println("Biginteger : " + BIGINTEGER2);  
    }
}