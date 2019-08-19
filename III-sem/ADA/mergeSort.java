//
//mergesort.java
//
//program to sort array using mergesort
//
import java.util.Scanner;

public class mergeSort
{
    public void printArray(int arr[])
    {
        for( int i = 0 ; i < arr.length ; i++ )
            System.out.print(arr[i] + "   ");
    }
    public void merge(int arr[], int l, int m, int r)
    {
        int n1, n2, i, j, k;
        int arrLeft[], arrRight[];
        n1  = m - l + 1;
        n2 = r - m;      // not +1 because array second starts from (m + 1) to r
        
        arrLeft = new int[n1];
        arrRight = new int[n2];
        
        // copying
        for( i = 0, j = l ; i < n1 ; i++, j++ )
            arrLeft[i] = arr[j];
        // copying
        for( i = 0, j = m+1 ; i < n2 ; i++, j++ )
           arrRight[i] = arr[j];

        i = 0;
        j = 0;
        k = l; // starting point of array is from l to r;
        while(i < n1 && j < n2)
        {
            if(arrLeft[i] < arrRight[j])
            {
                arr[k] = arrLeft[i];
                i++;
            }
            else
            {
                arr[k] = arrRight[j];
                j++;
            }
            k++; // k must be incremented each time;
        }

        while(i < n1)
        {
         arr[k] = arrLeft[i];       
         k++;
         i++;
        }

        while(j < n2)
        {
         arr[k] = arrRight[j];       
         k++;
         j++;
        }
    }
  
    public void mergesort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
  
    public static void main(String [] args)
    {
        /*mergeSort obj = new mergeSort();
        Scanner scan = new Scanner(System.in);
        int n, arr[];
 
        System.out.print("Enter no of elements : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println();
        for( int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print("Array[" + (i + 1) + "] << ");
            arr[i] = scan.nextInt();
        }

        // printing array elements
        System.out.println("Array elements are as : ");
        obj.printArray(arr);
        obj.mergesort(arr, 0, arr.length -1);
        System.out.println();  
        System.out.println("Array elements After Sorting are as : ");
        obj.printArray(arr);
        */

        int arr[] = {12, 4 , 5, 4, 2, 20, 40, -52, -47, -30,48, 11, 13, 5, 6, 7}; 
  
        mergeSort ob = new mergeSort(); 
        System.out.println("Given Array"); 
        ob.printArray(arr); 
  
        ob.mergesort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        ob.printArray(arr); 

    }
}