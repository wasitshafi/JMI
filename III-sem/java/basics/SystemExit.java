//
//SystemExit.java
//
//Program to show the use of SystemExit();
//
import java.util.Scanner;
public class SystemExit{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int x;

        System.out.print("Enter any Natural Number : ");
        x = scan.nextInt();

        if( x > 0 )
            System.out.println("x = " + x);
        else
            System.exit(-1); //any non zero argument refers unsuccessful \ abnormal termination like 'return -1' in c/c++
    }
}