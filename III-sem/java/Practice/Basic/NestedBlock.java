/**
 * Program to to Block Scope of variable in java
 * @author wasitshafi
 */

public class NestedBlock
{
    public static void main(String[] args)
    {
        int x = 10;

        System.out.println("x = " + x);
        {
         // int x = 20;   // not allowed in java (allowed in c/c++)
            System.out.println("x = " + x);
        }
        System.out.println("x = " + x);
    }
}