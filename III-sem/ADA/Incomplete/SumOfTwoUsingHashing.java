import java.util.Scanner;

public class SumOfTwoUsingHashing
{
    public static void main(String[] args)
    {
        int n, k;
        int[] arr;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no of elements : ");
        n = scan.nextInt();

        arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("arr[" + (i + 1) + "] : ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter value of k : ");
        k = scan.nextInt();
        
    }
}