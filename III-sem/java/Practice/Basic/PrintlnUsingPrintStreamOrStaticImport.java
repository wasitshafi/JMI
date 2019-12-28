import java.io.PrintStream;
import static java.lang.System.out;

public class PrintlnUsingPrintStreamOrStaticImport
{
    public static void main(String... arg)
    {
        PrintStream p = new PrintStream(System.out);
        p.println("Hello world");

        // Alternate option
        out.println("Hello world");
    }
}