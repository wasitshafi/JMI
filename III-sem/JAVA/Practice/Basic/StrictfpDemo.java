/**
    @author wasitshafi
    @since  11-02-2020
*/
strictfp class Test1
{
}

class Test2 extends Test1 // strictfp is also applicable in this class as well
{
}

strictfp abstract class Test3
{
}

class Test4 extends Test3 // strictfp is also applicable in this class as well
{
}

class Test5
{
    public strictfp void fun1()
    {
    } 
}

strictfp interface Iter1
{   
}

interface Iter2 extends Iter1 // strictfp is also applicable in this class as well
{
}

public class StrictfpDemo
{
    public static void main(String... args)
    {
        System.out.println("strictfp ensures that you get exactly the same results from your floating point calculations on every platform. If you don't use strictfp, the JVM implementation is free to use extra precision where available.");
        System.out.println("\nstrictfp can't be used with abstract methods, constructors and variables.");
    }
}