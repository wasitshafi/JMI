//
//TwoSumProblem.java
//
/*Problem Statement : Given an array of n elements along with a constant K, write an algorithm to find out whether in a
  given array there exists two numbers whose sum is exactly equal to a given number K or not, if present then print those
*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class TwoSumProblem
{
    public static void sortArray(int arr[])
    {
        int minIndex, temp;

        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++)
                if(arr[j] < arr[i])
                    minIndex = j;
                    
            if(minIndex != i)
            {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String []args)
    {
        int left, right, k, n, arr[];

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of Elements... ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.print("K... ");
        k = scan.nextInt();

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Arr[" + (i + 1) + "] : ");
            arr[i] = scan.nextInt();
        }

        sortArray(arr);
        System.out.println();
        System.out.print("Array elements are as : ");
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");

        System.out.println("Pairs are as : ");
        left = 0;
        right = arr.length - 1;
        while(left < right)
        {
            if(arr[left] + arr[right] == k)
            {
                System.out.println("(" + arr[left] + ", "  + arr[right] + ")");
                left ++; // or right--;
            }
            else if(arr[left] + arr[right] < k)
                left++;
            else
                right--;
        }
    }
}











