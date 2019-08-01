//
//mysqrt.java
//
//program to compute square root of a given no
//
import java.util.Scanner;
import java.lang.Math;

public class mysqrt
{
    double mysqrt1(int n)
    {
        return Math.pow(n, 0.5);
    }
    public static void main(String []args)
    {
        mysqrt obj = new mysqrt();
        Scanner scan = new Scanner(System.in);
        int n, i;

        System.out.print("Enter value of n : ");
        n = scan.nextInt();
  
        for(i = 1 ; i <= n ; i++)
        {
            System.out.println("\nmysqrt1( " + i + ") is  : " + obj.mysqrt1(i));
            System.out.println("Math.sqrt( " + i + ") is: " + Math.sqrt(i));
        }
    }
}