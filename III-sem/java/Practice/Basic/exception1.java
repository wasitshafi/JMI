public class exception1{
     // for more info read : https://www.w3schools.com/java/java_try_catch.asp
     //                      https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
    public static void main(String a[])
    {
        try
        {
             int arr[] = {11, 22, 33, 44, 55};
             System.out.print("Arr = ");
             for( int val : arr)
                System.out.print(val + " ");
             arr[5] = 10; // will throw an error 

             System.out.println("End of try block");
        }
        catch(Exception e)
        {
             System.out.println("Something went wrong....");
        }
        finally
        {
             System.out.println("The 'try catch' is finished.");
        }
        System.out.print("End of main().");
    }
}