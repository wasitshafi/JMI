//
//areaOfTriangle.java
//
//program to compute area of triangle using heron's formula
//
import java.util.Scanner;
import java.lang.Math;


public class areaOfTriangle
{
    public boolean checkValid(double a, double b, double c)
    {
     if( (a + b > c) && (b + c > a) && (c + a > b) )   
       return true;
    else
       return false; 
    }

    public double area(double a, double b, double c)
    {
         double s = ( a + b + c ) / 2.0;
         double area = Math.sqrt(s * (s - a) * (s - b) * (s - c) );
         
         return area;
    }
    public static void main(String []args)
    {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        areaOfTriangle obj = new areaOfTriangle();

        System.out.print("Enter value of a :");
        a = scan.nextDouble();

        System.out.print("Enter value of b :");
        b = scan.nextDouble();

        System.out.print("Enter value of c :");
        c = scan.nextDouble();

       if(obj.checkValid(a, b, c))
            System.out.print("Area of triangle with sides(" + a + ", " + b + ", " + c  + ") : " + obj.area(a, b, c));
        else
            System.out.print("Invalid input...!");
   }
}