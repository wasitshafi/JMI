import java.util.Scanner;

public class Solution2017Q3C
{
    static void swap(Integer x , Integer y)
    {
        x ^= y;
        y ^= x;
        x ^= y;
    }
    public static void main(String[] args)
    {
        Integer i = 10;
        Integer j = 20;

        System.out.println("Values Before Swapping :");
        System.out.println("Value of i : " + i);
        System.out.println("Value of j : " + j);

        swap(i, j);
        System.out.println("Values After Swapping :");
        System.out.println("Value of i : " + i);
        System.out.println("Value of j : " + j);
    }
}