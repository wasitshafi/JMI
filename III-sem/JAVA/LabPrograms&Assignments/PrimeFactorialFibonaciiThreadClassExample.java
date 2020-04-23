import java.math.BigInteger;
import java.util.Scanner;

class PrimeThread extends Thread
{
    private int n;
    PrimeThread(int n)
    {
        this.n = n;
    }
    public void run()
    {
        for(int i = 2 ; i <= n ; i++)
        {
                if(isPrime(i)) System.out.println("PrimeThread => isPrime(" + i + ") == true");
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e){ }
        }
    }
    public boolean isPrime(int n)
    {
        boolean result = true;
        for(int i = 2 ; i * i <= n ; i++)  //  or use condition 'i <= sqrt(n)'
            if(n % i == 0)
            {
                result = false;
                break;
            }
        return result;
    }
}

class FactorialThread extends Thread
{
    private int n;
    FactorialThread(int n)
    {
        this.n = n;
    }
    public void run()
    {
        for(int i = 1 ; i <= n ; i++)
        {
            System.out.println("FactoiralThread => Factorial(" + i + ") : " + factorial(i));
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e){ }
        } 
    }
    public BigInteger factorial(int n)
    {
        BigInteger fact = new BigInteger(Integer.toString(n));        
        while(--n > 1)
            fact = fact.multiply(BigInteger.valueOf(n));
        
        return fact;
    }
}

// we can also use binets formula : ((pow(1 + sqrt(5), n)) - (pow(1 - sqrt(5), n))) / (pow(2,n) * sqrt(5));
class FibonaciiThread extends Thread
{
    private int n;
    FibonaciiThread(int n)
    {
        this.n = n;
    }
    public void run()
    {
        BigInteger term1 = new BigInteger("0");
        BigInteger term2 = new BigInteger("1");
        BigInteger term = new BigInteger("1");

        System.out.println("FibonaciiThread => Fibonacii(1) : 0");
        System.out.println("FibonaciiThread => Fibonacii(2) : 1");

        for(int i = 3 ; i <= n ; i++)
        {
            term = term1.add(term2);
            System.out.println("FibonaciiThread => Fibonacii(" + i + ") : " + term);
            term1 = term2;
            term2 = term;
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e){ }
        }
    }
}

public class PrimeFactorialFibonaciiThreadClassExample
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        n = scan.nextInt();

        PrimeThread primeThread = new PrimeThread(n);
        FactorialThread factorialThread = new FactorialThread(n);
        FibonaciiThread fibonaciiThread = new FibonaciiThread(n);

        primeThread.start();
        factorialThread.start();
        fibonaciiThread.start();
       
        try
        {
            primeThread.join();
            factorialThread.join();
            fibonaciiThread.join();
        }
        catch(Exception e){}
        scan.close();
        System.out.println("End of main thread.");
    }
}