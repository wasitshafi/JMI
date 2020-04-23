//
//methods.java
//
//program to show basice of methods/functions
//
//for more info read : https://www.w3schools.com/java/java_ref_math.asp

import java.util.Scanner;
public class methods
{
    static float sum( float x, float y)
    {
        return x + y;
    }
    public static void main(String a[])
    {
        float num1, num2, s;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");        
        num1 = scan.nextFloat();

        System.out.print("Enter a number : ");        
        num2 = scan.nextFloat();

        s = sum(num1, num2);
        System.out.println( num1 + " + " + num2 + " = " + s);
    }
}