// pseudorandom number vs random number 
// https://www.youtube.com/watch?v=GtOt7EBNEwQ
// https://kodehelp.com/how-to-generate-pseudo-random-numbers-in-java/
import java.util.Random;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class randomNo{ 
    public static void main(String []args)
    {
        // Method1 using util.Random; i.e Built-in Random Class
        // For more info ref. docs : https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
        // https://www.geeksforgeeks.org/generating-random-numbers-in-java/

        Random r = new Random();
        System.out.println("r.nextInt() is : " + r.nextInt()); // any random number
        System.out.println("r.nextInt(50) is : " + r.nextInt(50));  // Here 50 is exclusive. i.e range is 0 <= n < 50
                                                                    // nextInt() is the only function that takes arguments.
        System.out.println("r.nextLong() is : " + r.nextLong());
        System.out.println("r.nextFloat() is : " + r.nextFloat());
        System.out.println("r.nextDouble() is : " + r.nextDouble());
        System.out.println("r.nextBoolean() is : " + r.nextBoolean());

        // There is an another way to generate random no between specific rang;
        int min = 20, max = 60;

        //Observe that the minimum value it can generate is 'min' & maximum value it can generate is 'max'.
        System.out.print("rand(20, 60) [HINT : Both inclusive] : " + (r.nextInt(max-min)+min));

        // Method2 using math.random
        // math.random generates double number from 0.0 to 1.0
        System.out.println("\n\nMath.random() : " + Math.random()); // its does't take any arguments
        System.out.println("Math.random() : " + Math.random());
        System.out.println("Math.random() : " + Math.random());
        System.out.println("Math.random() : " + Math.random());
        System.out.println("((Math.random() * 100) % 200)) : " + ((Math.random() * 100) % 200)); // now it can generate random from 0 to 199
        // here '*10' will convert random no with decial no. & '%200' will always give remainder less than 200  
    

        // Method3
        // https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadLocalRandom.html

        int randomint = ThreadLocalRandom.current().nextInt();
        float randomfloat = ThreadLocalRandom.current().nextFloat();
        double randomdouble = ThreadLocalRandom.current().nextDouble();
        boolean randomboolean = ThreadLocalRandom.current().nextBoolean();

        System.out.println("\n\nRandom Int is : " + randomint);
        System.out.println("Random float is : " + randomfloat);
        System.out.println("Random double is : " + randomdouble);
        System.out.println("Random boolean is : " + randomboolean);
    }
}