import java.util.Scanner;
import java.math.BigInteger; 
import java.math.BigDecimal;

public class scannerClass
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in); // Syntax : Scanner obj = new Scanner(inputStreamReference) // CTM: System.in is a reference to standard input stream that is most of the time keyboard on PC.
        
        String str; // CTM : String is not primitive data type in java
        
        byte byt;       // 1 bytes 
        short s;        // 2 bytes
        int i;          // 4 bytes
        long l;         // 8 bytes

        float f;        // 4 bytes
        double d;       // 8 bytes

        char ch;        // 2 bytes

        boolean bool;   // 1 bit

        Integer integer = 0;                          // This is also object
        BigInteger bigInteger = new BigInteger("0");  // Creating Object  // BigInteger has constructor that takes string arguments
        BigDecimal bigDecimal = new BigDecimal("0");  // Creating Object

        System.out.print("Enter String : ");
        str = scan.nextLine(); // reading string along with spaces. Alternate Method : scan.next() reads the string without spaces

        System.out.print("Enter char : ");
        ch = scan.next().charAt(0);
        
        System.out.print("Enter Integer : ");
        i = scan.nextInt();

        System.out.print("Enter Short : ");
        s = scan.nextShort();
        
        System.out.print("Enter long : ");
        l = scan.nextLong();
        
        


        System.out.print("Enter float : ");
        f = scan.nextFloat();
        
        System.out.print("Enter double : ");
        d = scan.nextDouble();

        System.out.print("Enter boolean value(true/false) : ");
        bool = scan.nextBoolean();

        System.out.print("Enter Integer value : ");
        integer = scan.nextInt();

        System.out.print("Enter BigInteger value : ");
        bigInteger = scan.nextBigInteger();

        System.out.print("Enter BigDecimal value : ");
        bigDecimal = scan.nextBigDecimal();

        System.out.println("\n\nValue are :\n\n");
        
        System.out.println("String is : " + str); 
        System.out.println("Char  is : " + ch + "\n");
        System.out.println("Integer is : " + i);
        System.out.println("Short is : " + i);
        System.out.println("Long is : " + l + "\n");
        System.out.println("Float is : " + f);
        System.out.println("Double is : " + d + "\n");
        System.out.println("Boolean is : " + bool);
        System.out.println("Integer is : " + integer);
        System.out.println("BigInteger is : " + bigInteger);
        System.out.println("BigDecimal is : " + bigDecimal);
        scan.close();
      }
}