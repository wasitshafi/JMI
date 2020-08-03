/**
 * @author wasitshafi
 * @since  01-08-20
 */
import java.util.Arrays;

public class Arrays_copyOfRange
{
    public static void main(String[] args)
    {
       int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
       int[] brr = Arrays.copyOfRange(arr, 2, 6); // (array, from, to) range[from, to)

       System.out.print("brr[] : " + Arrays.toString(brr));
    }
}