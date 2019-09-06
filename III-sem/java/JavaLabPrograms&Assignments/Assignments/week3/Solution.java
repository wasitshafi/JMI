/* Problem: 
  Write a menu driven program to create two m x n matrix, populate it with random integers and display their sum and product.
  Also display the time taken by the computer for the product operation. Make use of classes, constructors and necessary methods.
  Test your program for 500x500 matrix and display the computational time for the product operation.
*/
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Matrix
{
    private int M[][];
    private int rows, cols;
    Matrix(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        M = new int[rows][cols];
    }
    
    public int getRows(){ return rows; }
    public int getCols(){ return cols; }
    public void setMatrix()
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min, max, i, j;
        
        do{
            System.out.print("Enter Minimum value   : ");
            min = scan.nextInt();
            System.out.print("Enter Maximum value   : ");
            max = scan.nextInt();
            
            if(min >= max)
               System.out.println("Invalid Input...! Try Again.");
          
          }while(min >= max);

        for ( i = 0 ; i < rows ; i++ )
            for( j = 0 ; j < cols ; j++ )
                M[i][j] = rand.nextInt(max - min) + min;
    }

    public void printMatrix()
    {
        for(int i = 0 ; i < rows ; i ++ )
        {
            for (int j = 0 ; j < cols ; j++)
                System.out.print(M[i][j] + "\t");
            System.out.println();
        }
    }

    public void add(Matrix X)
    {
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
                System.out.print(( M[i][j] + X.M[i][j] ) + "\t");
            System.out.println();
        }
    }

    public void sub(Matrix X)
    {
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
                System.out.print(( M[i][j] - X.M[i][j] ) + "\t");
            System.out.println();
        }
    }
    
    public long mult(Matrix X)
    {
        int i, j, k;
        int resultant[][] = new int[rows][X.cols];
        
        long start = System.nanoTime();
        for( i = 0 ; i < rows ; i++ )
        {
            for( j = 0 ; j < X.cols ; j++ )
            {
                resultant[i][j] = 0;
                for(k = 0 ; k < cols ; k++)
                   resultant[i][j] += M[i][k]* X.M[k][j];
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;

        // Printing resultant matrix
        for ( i = 0 ; i < rows ; i++ )
        {
            for ( j = 0 ; j < X.cols ; j++)
                System.out.print(resultant[i][j] + " ");
            System.out.println();
        }

        return elapsedTime;
    }
}
public class Solution
{
    public static void main(String []args)
    {
        int rows, cols, choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Dimensions for Matrix A");
        System.out.print("Enter no. of rows     : ");
        rows = scan.nextInt();
        System.out.print("Enter no. of columns  : ");
        cols = scan.nextInt();
        Matrix A = new Matrix(rows, cols);

        A.setMatrix();

        System.out.println("\nEnter Dimensions for Matrix B");
        System.out.print("Enter no. of rows     : ");
        rows = scan.nextInt();
        System.out.print("Enter no. of columns  : ");
        cols = scan.nextInt();
        Matrix B = new Matrix(rows, cols);
        B.setMatrix();

        loop:  while(true) // labelled loop
        {
            System.out.println("\n\n1 >> Print Matrix.");
            System.out.println("2 >> Add Matrix A & B.");
            System.out.println("3 >> Subtract Matrix A & B.");
            System.out.println("4 >> Mutilpy Matrix A & B.");
            System.out.println("0 >> Exit.");
            System.out.print("\nEnter your choice : ");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Matrix A"); 
                         A.printMatrix();
                         System.out.println("\nMatrix B"); 
                         B.printMatrix();
                         break;

                case 2 : if(A.getRows() != B.getRows() && A.getCols() != B.getCols() )
                            System.out.println("Matrix Addition not possible.");
                         else
                         {
                            System.out.println("Matrix A + Matrix B");
                            A.add(B);   
                         }
                         break;

                case 3 : if(A.getRows() != B.getRows() && A.getCols() != B.getCols() )
                            System.out.println("Matrix Subtraction not possible.");
                         else
                         {
                            System.out.println("Matrix A - Matrix B");
                            A.sub(B);
                         }
                         break;

                case 4 : if(A.getCols() != B.getRows() )
                            System.out.println("Matrix Multiplication not possible.");
                         else
                         {
                            long elapsedTime;
                            System.out.println("Matrix A * Matrix B");
                            elapsedTime = A.mult(B); // return  elapsed time in nanosec. // converting nanosec to milisec refer: https://www.checkyourmath.com/convert/time/nanoseconds_milliseconds.php
                            
                            System.out.print("Total Time take for Multiplication is : " + (elapsedTime) + "ns");
                                                // or
                            //System.out.print("Total Time take for Multiplication is : " + (elapsedTime / 1000000) + "ms");
                         }
                         break;
                case 0 : break loop; // using labled loop to exit

                default : System.out.print("Invalid Choice...! Try Again.");
            }
        }
    }
}