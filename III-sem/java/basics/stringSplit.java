//
//
//
//
//
import java.util.Scanner;
import javax.swing.*;

public class stringSplit
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String str;
        String tokens[];

        System.out.print("Enter string : ");
        str = scan.nextLine();

        tokens = str.split(" ");
        //     or
        //String tokens[] = str.split(" ");

        System.out.println("String : " + str);

        for( int i = 0 ; i < tokens.length ; i++)
            System.out.println("tokens[" + ( i+ 1) + "] : \"" + tokens[i] + "\"");
        
        
       // Application : we can take input for integer, double, BigInteger... as an string seperated by spaces and then parse those to different datatypes 
        System.out.print("\nEnter value of x, y & z sperated by spaces[int type] : ");
        str = scan.nextLine();

        tokens = str.split(" ");

        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        int z = Integer.parseInt(tokens[2]);

        System.out.println("\nValue of x is : " + x);
        System.out.println("Value of y is : " + y);
        System.out.println("Value of z is : " + z);

        // using dialogbox
        System.out.println("\nEnter value in Dialog Box:");
        str = JOptionPane.showInputDialog("\nEnter value of x, y & z sperated by spaces : " );
        tokens = str.split(" ");

        x = Integer.parseInt(tokens[0]);
        y = Integer.parseInt(tokens[1]);
        z = Integer.parseInt(tokens[2]);

        System.out.println("\nValue of x is : " + x);
        System.out.println("Value of y is : " + y);
        System.out.println("Value of z is : " + z);
    }
}
