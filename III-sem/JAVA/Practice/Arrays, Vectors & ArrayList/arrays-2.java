import java.util.Scanner;
public class arrays{
    public static void main(String []args)
    {
        int n;
        int arr[]; // declaration
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of elements : ");
        n = scan.nextInt();
        arr = new int[n]; // instantiation        

        // alternate methods
        // int arr[] = new int[n];   // declaration & instantiation.
        //int a[] = {33, 3, 4, 5};   //declaration, instantiation and initialization.
        System.out.println("Enter Array elements : ");
        for( int i = 0 ; i < n ; i++ )
        {
            System.out.print("arr[" + (i + 1) + "] << ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Array elements are as : ");
        System.out.print("Enter Array elements : ");
        for( int i = 0 ; i < n ; i++ )
            System.out.print(arr[i] + "  ");     
    }
}