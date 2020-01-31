import static java.lang.System.out;
import java.io.PrintStream;
import java.util.Scanner;

public class LongArrays
{
    public static void main(String... args)
    {
        int n = 5, len;
        long arr[] = {1l, 2l, 3l, 4l, 5l};
        long arr2[] = new long[5];
        long arr3[];
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        PrintStream p = new PrintStream(System.out);

        arr2[0] = 11l;
        arr2[1] = 22l;
        arr2[2] = 33l;
        arr2[3] = 44l;
        arr2[4] = 55l;

        arr3 = new long[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("Enter value of arr[" + (i + 1) + "] : ");
            arr3[i] = scan.nextLong();
        }

        sb.append("arr[]  : ");
        len = arr.length;
        for(int i = 0 ; i < len ; i++)sb.append(arr[i] + " ");
        
        sb.append("\narr2[] : ");
        len = arr2.length;
        for(int i = 0 ; i < len ; i++)sb.append(arr2[i] + " ");
        
        sb.append("\narr3[] : ");
        len = arr3.length;
        for(int i = 0 ; i < len ; i++)sb.append(arr3[i] + " ");
        
        out.println();
        p.println(sb); // or System.out.println(sb);
        scan.close();
        p.close();
    }
}