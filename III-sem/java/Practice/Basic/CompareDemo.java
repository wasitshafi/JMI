import java.util.Scanner;
import static java.lang.System.out;

public class CompareDemo
{
    public static int myCompare1(int x ,int y)
    {
        if(x < y)
            return -1;
        else if(x > y)
            return 1;
        else
            return 0; 
    }

    public static int myCompare2(int x, int y)
    {
        return x - y; //don't use this with float/double as it may round the value
    }

    public static void main(String... args)
    {
        int x, y;
        Scanner scan = new Scanner(System.in);

        out.print("Enter x : ");
        x = scan.nextInt();

        out.print("Enter y : ");
        y = scan.nextInt();
        

        out.println("Value of x : " + x);
        out.println("Value of y : " + y);

        // Below functions will return -ve if x < y, +ve if x > y, 0 if x == y
        out.println(Integer.compare(x, y));
        out.println(myCompare1(x, y));
        out.println(myCompare2(x, y));

        scan.close();
    }
}