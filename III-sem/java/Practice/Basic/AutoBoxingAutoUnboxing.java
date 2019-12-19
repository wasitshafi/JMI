import static java.lang.System.out;

public class AutoBoxingAutoUnboxing
{
    public static void main(String[] args)
    {
        // as we know 'x' is a primitive where as y is object so, how they are compatible with assignment operator ...? because of auto-boxing and auto-unboxing
        int x  = 10;
        Integer y = x; // y = Integer.valueOf(x);;
        x = y;         // x = y.intValue()

        out.println("x : " + x);
        out.println("y : " + y);
    }
}