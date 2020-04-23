import static java.lang.System.out;

// we can convert one type of exception to another Exception or in case if a called exception is not able to handle it then we may want to throw another one.
public class RethrowException
{
    public static void main(String[] arg)
    {
        try
        {
            int arr[] = new int[10];
            arr[15] = 20;
        }
        catch(ArithmeticException e)
        {
            out.println("ArithmeticException");
        }
        catch(ArrayStoreException e)
        {
            out.println("ArrayStoreException");
        }
        catch(ClassCastException e)
        {
            out.println("ClassCastException");
        }
        catch(NullPointerException e)
        {
            out.println("Inside NullPointerException");
            out.println("Error Message : " + e.getMessage());
        }
        catch(IndexOutOfBoundsException e)
        {
            out.println("Inside IndexOutOfBoundsException");
            throw new NullPointerException("Error : " + e.getMessage()); //it is a better idea to set the original exception as the "cause" of the new exception
        }
         catch(NegativeArraySizeException e)
        {
            out.println("NegativeArraySizeException");
        }
    }
}