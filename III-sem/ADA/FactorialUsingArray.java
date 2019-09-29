import java.util.Scanner;
import java.lang.Math.*;

class factorial
{
    int result[];
    factorial()
    {
//      int size = Math.floor(Math.log10(n)) + 1;
        final int SIZE = 200000;
        result = new int[SIZE];
        for(int i = 0 ; i < result.length - 1; i++) result[i] = 0;
        result[result.length - 1] = 1;  // set result = 1;
    }

    public void getFactorial(int n)
    {
        for(int i = n ; i > 1 ; i--)
            multiplyArray(i);
        printResult();
    }

    private void multiplyArray(int x)
    {
        int temp, carry = 0;               // It can store value 9 * 3641 + carry === 32769 + carry 
        int noOfDigits = getNoOfDigits();
    
        for(int i = result.length - 1 ; i >= result.length - noOfDigits ; i-- )
        {
            temp = result[i] * x + carry;
            result[i] = temp % 10;
            carry = temp / 10;
        }
        
        while(carry != 0)
        {
            result[(result.length - 1) - noOfDigits++ ] = carry % 10;
            carry = carry / 10; 
        }
    }

    private int getNoOfDigits()
    {
        int i;
        for( i = 0 ; result[i] == 0 ; i++);
        return result.length - i;
    }

    public void printResult()
    {
        int i;
        for( i = 0 ; result[i] == 0 ; i++);
        while(i < result.length) System.out.print(result[i++]);
    }
}
public class FactorialUsingArray
{
    public static void main(String []args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        factorial f = new factorial();
        System.out.print("Enter value of n : ");
        n = scan.nextInt();

        System.out.print("\nFactorial of " + n + " is : ");
        f.getFactorial(n);
        scan.close();
    }
}