import static java.lang.System.out;
import static java.lang.Math.pow;

// refer : c.horstman p no : 256

public class VarArgs
{
    public static int max(int ... values)
    {
        int max = -(int)pow(2, 31);
        /*
        for(int i = 0 ; i < values.length ; i++)
            if(values[i] > max) max = values[i];
        */

        // alternate
        for(int v : values)
            if(v > max) max = v;

        return max;
    }

    public static void main(String[] args)
    {
        out.println("max(10, 50, 20, 60, 80, 100, 23, 70) : " + max(10, 50, 20, 60, 80, 100, 23, 70));
    }
}