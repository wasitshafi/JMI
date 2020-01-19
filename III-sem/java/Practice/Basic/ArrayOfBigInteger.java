/**
    @author wasitshafi
    @since 19-01-2020
*/
// CTM : By default assertions are disable so use cmd  "java -ea ArrayOfBigInteger"
import static java.lang.System.out;
import java.util.Scanner;
import java.math.BigInteger;

public class ArrayOfBigInteger
{
    public static void main(String... args)
    {
        int n;
        BigInteger arr[];
        Scanner scan = new Scanner(System.in);
        
        out.print("Enter no Of Elements...");
        n = scan.nextInt();

        System.out.println("n : " + n);
        assert(n > 0): "Invalid no Of Elements...!"; //Assertion
        out.println();
        arr = new BigInteger[n];
        for(int i = 0 ; i < n ; i++)
        {
            out.print("Enter value...");
            arr[i] = new BigInteger(scan.next());
        }
        out.print("Array Elements are as : ");
        for(int i = 0 ; i < n ; i++)
        {
            out.print(arr[i]);
            if(i - 1 != n) out.print(", ");
        }
    }
}