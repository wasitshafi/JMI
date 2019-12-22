import java.util.Scanner;
import static java.lang.System.out;

public class ComputeHashCode
{
    public static long getHashCode(String s)
    {
        int hash = 0;

        for(int i = 0 ; i < s.length() ; i++)
            hash = 31 * hash + s.charAt(i);
        return hash;
    }

    public static void main(String... args)
    {
        String s;

        out.println("Enter String : ");
        s = (new Scanner(System.in)).nextLine();

        out.println("String   : " + s);
        out.println("HashCode : " + s.hashCode());
        out.println("HashCode : " + getHashCode(s));
    }
}