import java.util.Scanner;

public class Exception
{
    public static void main(String a[])
    {
        int divisor, divident;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter divident : ");
        divident = s.nextInt();

        System.out.print("\nEnter divisor :  : ");
        divisor = s.nextInt();
         
        // Simplest way is to only throw exception on detecting without providing catch mechanism.
        if (divisor == 0)
            throw new ArithmeticException("Can't divide  Zero");
         else
            System.out.println(divident + "/" + divisor + " = " + (float)divident / divisor);
       
        System.out.println("End of main().");  //if error ocured the program  will terminate and this will not be printed on console unlike user-defined 'try-catch'
        s.close();
    }
}