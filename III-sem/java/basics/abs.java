//
//abs.java
//
//Program to print absolute value using buit-in function.
//
import java.lang.Math;

public class abs
{
    public static void main(String []args)
    {
        int x = -1;
        int y =  2;
        double p = 3.5;
        double q = -6.47;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
       
        System.out.println("");
        System.out.println("Math.abs(x) = " + Math.abs(x));
        System.out.println("Math.abs(y) = " + Math.abs(y));
        System.out.println("Math.abs(p) = " + Math.abs(p));
        System.out.println("Math.abs(q) = " + Math.abs(q));
    }
}