import java.util.Arrays;
import java.util.Scanner;

public class ArrayAPI
{
    public static void main(String[] args)
    {
        int arr [] = new int[]{9, 8, 7, 6, 5, 4};
        
        // To sort an array in ascending order
        Arrays.sort(arr);
        System.out.println("Elements in soted order are as : " + Arrays.toString(arr));

        // To copy content of one array into another array starting from index 0
        int arr2[] = Arrays.copyOf(arr, arr.length); // it will not create a reference like in case arr2[] = arr;
        // arr.length will be the length of arr2[] and if is more than the length of arr then last values will be flled with 0 & in case its length is less than arr then only first n elements will be copied in arr2
        System.out.println("Elements of arr2 : " + Arrays.toString(arr2));


        // To copy sub array into another
        int arr3[] = Arrays.copyOfRange(arr, 3,5); // 5 is excluded
        System.out.println("Elements of arr3 : " + Arrays.toString(arr3));


        int key;
        System.out.println();
        System.out.print("Enter key to be found in arr1 : ");
        key = new Scanner(System.in).nextInt();

        int index = Arrays.binarySearch(arr, key); // CTM : Overloaded version binarySearch(type[] a, startIndex, endIndex, key) where startIndex is included but endIndex is excluded to find the key within the specified index values 
        if(index >= 0)
            System.out.println("Element found at index : " + index);
        else
            System.out.println("Element not found");

        
        // to fill array with some values;
        System.out.println();
        System.out.print("Enter a value to fill in array : ");
        int fillValue = new Scanner(System.in).nextInt();
        int arr4[] = new int[4];
        Arrays.fill(arr4, fillValue);
        System.out.println("Elements of arr4 : " + Arrays.toString(arr4));

        //To compare if two arrays are exactly of same length and have same values at corresponding index.

        int arr5[] = {1, 2, 3, 4};
        int arr6[] = {1, 2, 3, 4};

        if(Arrays.equals(arr5, arr6))
            System.out.println("arr5 == arr6");
        else
            System.out.println("arr5 != arr6");
    }
}