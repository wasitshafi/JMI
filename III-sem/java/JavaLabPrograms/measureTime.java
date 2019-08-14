// for more info : https://www.techiedelight.com/measure-elapsed-time-execution-time-java/

/* Read point2 : Ideally currentTimeMillis() should be used to measure wall-clock time and nanoTime() should be used to measure 
   the elapsed time of the program.If the elapsed time is measured with System.currentTimeMillis(), the result might not be accurate.*/

import java.util.concurrent.TimeUnit;
public class measureTime
{
    public static void main(String []args)
    {
        // Method1
        long start = System.nanoTime();
        for( long i = 0 ; i < 10000000; i++);

        long end = System.nanoTime();
        System.out.println("Start : " + start);
        System.out.println("End : " + end);
        long timeElapsed = end - start; 
        System.out.println("Time Taken : " + timeElapsed  + "ns");
        System.out.println("Time Taken : " + timeElapsed / 1000000 + "ms");
        
    }
}