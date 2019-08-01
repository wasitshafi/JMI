//
//hornerMethod.java
//
//Horner’s Method for Polynomial Evaluation
//
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class hornerMethod
{
    public void getCoefficient(int coefficient[], int n)
    {
        Scanner scan = new Scanner(System.in);

        for( int i = 0 ; i < n ; i++ )
        {
            System.out.print("Enter coefficient of x^" + (n - i - 1) + " : ");
            coefficient[i] = scan.nextInt();
        }
    }
    public String printSign(int x)
    {
        if(x < 0)
          return "-";
        else 
          return "+";
    }
    public void printPolynomial(int coefficient[], int n)
    {
        for( int i = 0 ; i < n ; i++ )
        {
          if(i == 0)
            System.out.print(coefficient[i] + "x^" + (n - i - 1) + " ");
          else
            System.out.print(printSign(coefficient[i]) + Math.abs(coefficient[i]) + "x^" + (n - i - 1) + " ");
        }
    }
    public int getValue(int coefficient[], int n, int x)
    {
      int result = coefficient[0], i;

      for( i = 1 ; i < n ; i++)
        result = result * x + coefficient[i];
      return result;
    }
    public static void main(String []args)
    {
        int n, x, coefficient[];
        Scanner scan = new Scanner(System.in);
        hornerMethod obj = new hornerMethod();

        System.out.print("Enter value of n (Degree of polynomial) : ");
        n = scan.nextInt();
        System.out.print("Enter value of x : ");
        x = scan.nextInt(); 
         coefficient = new int[n + 1];

        obj.getCoefficient(coefficient, n + 1);
        
        System.out.print("Array elements are as ");
        obj.printPolynomial(coefficient, n + 1);

        System.out.print("Value of polynomial is : " + obj.getValue(coefficient, n + 1, x));

    }
}