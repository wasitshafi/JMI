/**
    @author wasitshafi
    @since  28-01-2020
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.math.BigInteger; 
import java.math.BigDecimal;
//
public class ScannerDemo
{
    public static void main(String []args) throws Exception // because of BufferedReader
    {
        StringBuilder sb = new StringBuilder(""); // Using println() severl time take a lot of time, so append all output in sb & finally print at last
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //faster as compared to scanner
        Scanner scan = new Scanner(System.in);    // Syntax : Scanner obj = new Scanner(inputStreamReference) // CTM: System.in is a reference to standard input stream that is most of the time keyboard on PC.
        String str;                               // CTM : String is not primitive data type in java
        
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
        //or 
        //str = br.readLine();
        str = scan.nextLine(); // reading string along with spaces. Alternate Method : scan.next() reads the string without spaces

        System.out.print("Enter char : ");
        ch = scan.next().charAt(0);
        
        System.out.print("Enter Integer : ");
        // or
        i = Integer.parseInt(br.readLine());
        //i = scan.nextInt();

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

        System.out.print("Enter BigInteger value : ");
        bigInteger = scan.nextBigInteger();

        System.out.print("Enter BigDecimal value : ");
        bigDecimal = scan.nextBigDecimal();

        sb.append("\n\nValues are:\n\n");
        sb.append("String is     : " + str + "\n"); 
        sb.append("Char  is      : " + ch + "\n");
        sb.append("Integer is    : " + i + "\n");
        sb.append("Short is      : " + s + "\n");
        sb.append("Long is       : " + l + "\n");
        sb.append("Float is      : " + f + "\n");
        sb.append("Double is     : " + d + "\n");
        sb.append("Boolean is    : " + bool + "\n");
        sb.append("Integer is    : " + integer + "\n");
        sb.append("BigInteger is : " + bigInteger + "\n");
        sb.append("BigDecimal is : " + bigDecimal + "\n");
        
        System.out.println(sb);
        scan.close();
        br.close();
      }
}