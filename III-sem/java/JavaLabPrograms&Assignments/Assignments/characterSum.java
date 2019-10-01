//
//
//characterSum.java
//
//
import java.util.Scanner;

public class characterSum
{
    public static void main(String []args)
    {
        String str;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        str = scan.nextLine();

        System.out.print("String : ");
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' )
                sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("sum = "+ sum);
    }
}