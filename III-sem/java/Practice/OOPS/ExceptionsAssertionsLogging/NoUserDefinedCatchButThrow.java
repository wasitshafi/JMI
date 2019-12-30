// refer : https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
public class NoUserDefinedCatchButThrow
{
    public static void main(String[] args)
    {
        System.out.println("Inside Main().");

        int i = 10;
        int j = 0;

        if(j > 10)
            throw new ArrayIndexOutOfBoundsException(); // there are several build in exception in java
        else if(j == 0)
            throw new ArithmeticException();
        else
            System.out.println("i / j = " + i / j);

        System.out.println("End of main().");
    }
}