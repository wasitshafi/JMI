/**
    @author wasitshafi
    @since  09-02-2020
 */
import java.util.*;

class EvenOdd extends Thread
{
    int i;          // thread local variable
    EvenOdd(int n)
    {
        i = n;
    }
    public void run()
    {
        while(i <= 10)
        {
            System.out.print(i + " ");
            i = i + 2;
        }
    }
}
public class Solution2017Q4C
{
    public static void main(String[] args)
    {
        EvenOdd o = new EvenOdd(1);
        EvenOdd e = new EvenOdd(2);
        o.start();
        e.start();   
    }
}