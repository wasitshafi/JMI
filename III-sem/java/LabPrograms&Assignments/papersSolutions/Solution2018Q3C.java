/**
    @author wasitshafi
    @since  10-02-2020
*/

import java.util.Scanner;

class GenericArray<U extends Number>
{
    private int rows, cols;
    private Object arr[][];
    public GenericArray(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        arr = new Object[rows][cols];
    }
    
    public void set(U a[][])
    {
        int j;
        for(int i = 0 ; i < rows ; i++)
            for(j = 0 ; j < cols ; j++)
                arr[i][j] = a[i][j];
    }

    public void get()
    {
        int j;
        for(int i = 0 ; i < rows ; i++)
        {
            for(j = 0 ; j < cols ; j++)
                System.out.print(arr[i][j] + "   ");
            System.out.println();
        }
    }
    
    //incomplete  function
    @SuppressWarnings("unchecked")
    public Double genericSum()
    {
        // casting rules : byte –> short -> int –> long –> float –> double
       // can we use instanceof for float , integer, double.....??????????//
       
       int j;
       Double sum = 0.0d;
       
       for(int i = 0 ; i < rows ; i++)
            for(j = 0 ; j < cols ; j++)
                sum += (Double)arr[i][j];
        return sum;
    }
}

public class Solution2018Q3C
{
    public static void main(String... args)
    {
        GenericArray <Integer> i = new GenericArray<>(2, 3);
        GenericArray <Float> f = new GenericArray<>(3, 3);
        GenericArray <Double> d = new GenericArray<>(3, 3);
        
        Integer arrI[][] = {{1, 2, 3}, {4, 5, 6}};
        Float arrF[][] = {{1.1f, 2.2f, 3.3f}, {4.4f, 5.5f, 6.6f}, {7.7f, 8.8f, 9.9f}};
        Double arrD[][] = {{1.1111d, 2.2222d, 3.3333d}, {4.4444d, 5.5555d, 6.6666d}, {7.7777d, 8.8888d, 9.9999d}};

        i.set(arrI);
        f.set(arrF);
        d.set(arrD);

        System.out.println("\nInteger Matrix is as follows : ");
        i.get();
//        System.out.println("Sum : " + i.genericSum());
 
        System.out.println("\nFloat Matrix is as follows : ");
        f.get();
//        System.out.println("Sum : " + f.genericSum());

        System.out.println("\nDouble Matrix is as follows : ");
        d.get();
        System.out.println("Sum : " + d.genericSum());
    }
}