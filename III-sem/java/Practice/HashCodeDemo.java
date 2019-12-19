import static java.lang.System.*;
import java.util.Scanner;

public class HashCodeDemo
{
    public static long getHashCode(String str)
    {
        long hash = 0;
        for(int i = 0 ; i < str.length() ; i++)
            hash = hash * 31 + str.charAt(i);
        
        return hash;
    }

    public static void main(String[] args)
    {
        String str;
        
        out.print("Enter String : ");
        str = (new Scanner(System.in)).nextLine();

        out.println("String : " + str);
        out.println("HashCode of str is : " + str.hashCode());
        out.println("HashCode of str is : " + getHashCode(str));
    }
}