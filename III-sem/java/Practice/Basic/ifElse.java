//
//ifElse.java
//
//program to show if-else control statement
//
import java.util.Scanner;
public class ifElse
{
    public static void main(String a[])
    {
        System.out.print("Enter an number[n >= 0] :  ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num % 2 == 0)
         System.out.println(num + " is even number.");
        else
         System.out.println(num + " is odd number.");
    }
}