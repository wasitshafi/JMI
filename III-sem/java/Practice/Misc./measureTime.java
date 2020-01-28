import java.util.concurrent.TimeUnit;


public class measureTime
{
    public static void main(String []args)
    {
        // Method1
        long start = System.nanoTime();
        for( integer  i = 0 ; i < 10000; i++);
        long end = System.nanoTime();

        System.out.println("Start : " + start);
        System.out.println("end : " + end);
        System.out.println("Time Taken : " + start - end + "ns");
    }
}