/**
    @author wasitshafi
    @since  09-02-2020
 */

import java.util.ArrayList;
import java.util.Scanner;

class Triangle
{
    ArrayList<Double> sides= new ArrayList<Double>();

    public void set()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Side 1 : ");
        sides.add(scan.nextDouble());
    
        System.out.print("Enter Side 2 : ");
        sides.add(scan.nextDouble());
       
        System.out.print("Enter Side 3 : ");
        sides.add(scan.nextDouble());
        System.out.println();
    }
    
    public void get()
    {
        System.out.println("Sides of triange are as : " + sides.get(0) + ", " + sides.get(1) + ", " + sides.get(2));
    }
}
public class Solution2017Q4A
{
    public static void main(String... args)
    {
        int noOfObjects = 3;

        Triangle t[] = new Triangle[noOfObjects];

        for(int i = 0 ; i < noOfObjects ; i++)
            t[i] = new Triangle();

        // input data
        for(int i = 0 ; i < noOfObjects ; i++)
            t[i].set();

        // display data
        for(int i = 0 ; i < noOfObjects ; i++)
            t[i].get();
    }
}