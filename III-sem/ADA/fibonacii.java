import java.util.Scanner;
 
public class fibonacii
{
    public long printTermUsingIteration(long n)
    {
        long term1 = 0, term2 = 0, term = 1;
        
        while(n-- != 1)
        {
            term1 = term2;
            term2 = term;
            term = term1 + term2;
        }
        return term;
    }

    public long printTermUsingRecursion(long n)
    {   if(n < 2)
            return n;
       else 
            return printTermUsingRecursion(n - 1 ) + printTermUsingRecursion(n - 2);
    }
    public static void main(String []args)
    {
        fibonacii obj = new fibonacii();
        Scanner scan = new Scanner(System.in);
        long n, i;

        System.out.print("Enter value of n : ");
        n = scan.nextLong();
    
        System.out.print("Fibonacii series are as follows (Using Iteration): ");
        for(i = 1 ; i <= n ; i++ )
            System.out.print(obj.printTermUsingIteration(i) + " ");

            
        System.out.print("\nFibonacii series are as follows (Using Recursion): ");
        for(i = 1 ; i <= n ; i++ )
            System.out.print(obj.printTermUsingRecursion(i) + " ");

        scan.close();
    }
}