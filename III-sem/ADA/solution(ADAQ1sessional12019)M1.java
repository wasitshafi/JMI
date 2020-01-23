/**
    @author wasitshafi
    @since 23-01-2020
*/
/* Problem : Suppose that the number is 8759432976 is stored in an integer type array arr[]. Write an algorithm
   to multiply number by 'x' where  1 < x < 3641, and store the result in same array and print the result.
   arr[] = |0|0|0|0|0|8|7|5|9|4|3|2|9|7|6| */
import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionADAQ1sessional12019
{
    public static void main(String... args)throws Exception
    {
        int i, x, temp, carry, noOfDigits;
        int arr[] = {0, 0, 0, 0, 0, 8, 7, 5, 9, 4, 3, 2, 9, 7, 6};
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        out.print("Enter value of x... ");
        x = Integer.parseInt(br.readLine());

        for(i = 0 ; arr[i] ==  0 ; i++);
        noOfDigits = arr.length - i;
        
        carry = 0;       
        i = arr.length - 1;
        while(i >= arr.length - noOfDigits)
        {
            temp =  x * arr[i] + carry;
            arr[i--] = temp % 10;
            carry = temp / 10;
        }
        while(carry!= 0)
        {
            arr[i--] = carry % 10;
            carry = carry / 10;
        }

        for(i = 0 ; arr[i] == 0 ; i++);
        for(; i < arr.length ; i++) sb.append(arr[i]);
        System.out.println("Ans : " + sb);
    }
}