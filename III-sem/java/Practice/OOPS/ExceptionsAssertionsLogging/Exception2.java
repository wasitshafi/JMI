public class Exception2{
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
             arr[10] = 10; // will throw an error 

             System.out.println("End of try block");
        }
        catch(UnknownError e)
        {
          
        }
        catch(ArithmeticException e)
        {
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println();
          System.out.println("ArrayIndexOutOfBoundException Occured");
          System.out.println("e.getMessage()               : " + e.getMessage());
          System.out.println("e.getStackTrace()            : " + e.getStackTrace());
          System.out.println("e.getClass().getName()       : " + e.getClass().getName());
          System.out.println("e.getClass().getSimpleName() : " + e.getClass().getSimpleName());
        }
        finally
        {
             System.out.println("The 'try catch' is finished.");
        }
        System.out.println("End of main().");
    }
}