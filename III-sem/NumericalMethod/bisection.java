//
//bisection.java
//
//program to find square root of n using bisection method
//
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.lang.Math;
public class bisection
{
    public double getUpperLimit(double n)
    {
        int i;
        for( i = 0 ; i < n ; i++) // thie loop will not be executed n times
        {
            if(i * i >= n) break;
        }
        return (double)i;
    }

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        bisection root = new bisection();
        double n, ul, ll, mid = 0;
        int count = 0;

        System.out.print("Enter value of n : ");
        n = scan.nextDouble();
        ul = root.getUpperLimit(n);

        if(ul * ul == n)
            System.out.print("Sqrt(" + (int)n + ") is : " + (int)ul); //n has perfect square
        else
        {
            ll = ul - 1;
            System.out.println("\nupper limit is  : " + (int) ul + "\nlower limit is : " + (int)ll);
            System.out.println("abs ul - lb");

            while(Math.abs(ul - ll) > .00001)   // tolerance is .00001
            {
                mid = (ul + ll) / 2;

                if( mid * mid == n)
                    break;
                else if(mid * mid > n)
                    ul = mid;
                else
                    ll = mid;
            }
            System.out.print("Sqrt(" + n + ") is : " + mid);
        }
    }
}