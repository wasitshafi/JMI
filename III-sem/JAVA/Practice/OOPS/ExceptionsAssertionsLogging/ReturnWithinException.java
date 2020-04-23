import java.io.PrintStream;
import static java.lang.System.out;
import static java.lang.System.exit;

public class ReturnWithinException
{
    PrintStream p = new PrintStream(System.out);

    static void fun()
    {
        try
        {
            out.println("Hello from fun()");
            return; //Although we are trying to return from the function, as it may seem that finally block will not be executed, but actually it will be executed except we don't use exit(0)
        }
        catch(Exception e)
        {
            out.println("Exception Occured");
        }
        finally
        {
            out.println("You can't skip Me._.");
        }
    }

    public static void main(String[] args)
    {
        PrintStream p = new PrintStream(System.out);

        p.println("Hello from main()");
        fun();
        p.println("End of main()");
    }
}