import java.util.Arrays;

public class Arrays1
{
    public static void main(String[] args)
    {
        int[] a;                    // prefer this style as is clearly seperates the data type from variable name instead of int []a, int a[].

        a = new int[]{1, 2, 3, 4};  // or Anonymous Arrrays  or  int a[] = {1, 2, 3, 4};

        System.out.println("Elements are as : " + Arrays.toString(a));
        
        // suppose we need to increase the size of array 'a' there are two ways to do that
        // Method 1 : use another array

        int temp[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        a = temp;

        System.out.println("Elements are as : " + Arrays.toString(a));

        // Method 2 : we can use Anonymous arrays.
        a = new int[]{11, 22, 33, 44, 55, 66, 77, 88};
        System.out.println("Elements are as : " + Arrays.toString(a));
    }
}