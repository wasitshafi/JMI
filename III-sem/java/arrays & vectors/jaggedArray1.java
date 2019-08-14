//
//jaggedArray2.java
//
//program to implement Jagged Arrays in java
//
import java.util.Scanner;

public class jaggedArray1
{
    public static void main(String []args)
    {
        int c1, c2, c3;
        Scanner scan = new Scanner(System.in);
        
        int mat[][] = new int[3][];  // no of rows is 3

        System.out.print("Enter no of columns for first row : ");
        c1 = scan.nextInt();

        System.out.print("Enter no of columns for second row: ");
        c2 = scan.nextInt();

        System.out.print("Enter no of columns for third row : ");
        c3 = scan.nextInt();

        mat[0] = new int [c1];
        mat[1] = new int [c2];
        mat[2] = new int [c3];

        System.out.println();
        for( int i = 0 ; i < mat.length ; i++)
        {
            for ( int j = 0 ; j < mat[i].length ; j++)
            {
                System.out.print("Enter element [" + (i+1) + "][" + (j + 1) + "] : ");
                mat[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nJagged array is as follows : ");
        for( int i = 0 ; i < mat.length ; i++)
        {
            for ( int j = 0 ; j < mat[i].length ; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
}