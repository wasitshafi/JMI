//
//breakContinue.java
//
//program to show how break & continue works inside loops in java
//
import java.util.Scanner;
public class breakContinue
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter  a number : ");
        int n = s.nextInt();

        for(int i = 0 ; i <= n ; i++) 
        {
            if(i == 15)
             break;
            else if ( i % 2 == 0)
             continue;
            else
             System.out.print(i + " ");
        }
    }
}