import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class MyComplex
{
    private int real, img;
    MyComplex()
    {
        int min = -50;
        int max =  50;
        Random r = new Random();

        real = r.nextInt(max - min) + min;
        img  = r.nextInt(max - min) + min;
    }
    public void printElement()
    {    

        if(real == 0 && img == 0)
            System.out.print("0");
        else if(img == 0)
            System.out.print(real);
        else if(real == 0)
            System.out.print(img + "i");
        else
        {
            System.out.print(real);
            if(img < 0)
                System.out.print(img + "i");
            else
                System.out.print( "+" + img + "i");
        }
    }
}

class Matrix<E>
{

    private final Object matrix[][];
    private static int lowerBound, upperBound;
    
    static
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lower Bound    : ");
        lowerBound = scan.nextInt();
        System.out.print("Enter lower Bound    : ");
        upperBound = scan.nextInt();
    }

    public Matrix(int rows, int cols)
	{
        matrix = new Object[rows][cols];      
        for(int i = 0 ; i < matrix.length ; i++)
            for(int j = 0 ; j < matrix[i].length ; j++)
                matrix[i][j] = new Object(); 
    }
    
    public void populateData()
    {
        Random rand = new Random();

        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int  j = 0 ; j < matrix[i].length; j++)             
                matrix[i][j] = rand.nextInt(upperBound - lowerBound) + lowerBound;
        }
    }

    public void get()
    {
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int  j = 0 ; j < matrix[i].length ; j++)
            {
                System.out.printf("%4d", matrix[i][j]); // manage setw() ...?????s
            }
            System.out.println();
        }
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int  j = 0 ; j < matrix[i].length ; j++)
            {
                builder.append(matrix[i][j] + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}

class Solution
{
    public static void main(String[] args)
	{
        int n;
        int rows, cols;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no. of Objects : ");
        n = scan.nextInt();

        System.out.println();
        System.out.print("Enter no. of Rows    : ");
        rows = scan.nextInt();
        System.out.print("Enter no. of Columns : ");
        cols = scan.nextInt();
        
        Matrix<Integer> m1[] = new Matrix[n];
        for(int i = 0; i < n ; i++) m1[i] = new Matrix(rows, cols); // Allocate memory to each object

        for(int i = 0; i < n ; i++) m1[i].populateData();

        System.out.println();
        for(int i = 0; i < n ; i++)
            System.out.println("Matrix no " + (i + 1) + " : \n" + m1[i]);   
    }
}
