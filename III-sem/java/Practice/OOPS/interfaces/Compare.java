import static java.lang.System.out;
import java.util.Scanner;

// Refer cay Horstman p.no : 271(TIP)
public class Compare
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

    public static int myCompare2(int x, int y) // don't use this if the absolute difference can overflow
    {
        return x - y;
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
    }
}