import static java.lang.System.*; // we can also import only selected members : import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo
{
    public static void main(String[] args)
    {
        out.println("Hello world"); // now we don't need to prefix Class name to fields/methods
        out.println("PI : " + PI);
        exit(0);
        out.println("End of main()");
    }
}