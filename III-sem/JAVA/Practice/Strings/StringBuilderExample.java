/**
	@author wasitshafi
	@since 10-02-2020
*/
//unlike StringBuffer, StringBuilder is not thread safe, so it is faster than StringBuffer
import java.util.Scanner;

public class StringBuilderExample     // Ref : Horstmann P.no 78
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(); // it is mutable quite similar to general String.
                                                     // setCharAt(i) = ...;  for direct change in bilder string. 
        System.out.print("Enter no strings : ");
        n = scan.nextInt();
        scan.nextLine();    // flush

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.print(i + " > ");
            builder.append(scan.nextLine());
            if(i != n) builder.append(' '); // append() is overloaded for string & char arguments.
        }
        builder.append('.');

        String str = builder.toString(); // only single immutable string will be created.
        System.out.println("Builder : " + builder); // for length use builder.length()
        System.out.println("String  : " + str);
    }
}