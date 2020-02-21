/**
    @author wasitshafi
    @since  21-02-2020
*/
import java.util.Scanner;

public class FloatDouble
{
    public static void main(String... args)
    {
        float f = 1.2f; // we need to suffix 'f' because by default it takes '1.2' as double. // refer : horstman pg no 561
        
        double d = 1.2;
        double d2 = 1.2d;

        System.out.println("f : " + f);
        System.out.println("d : " + d);
        System.out.println("d2: " + d2);
    }
}