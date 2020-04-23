//
//jaggedArray.java
//
//Q: Write a Program to implement the concept of Ragged Array.
//
import java.util.Scanner;

public class jaggedArray
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int numberOfRows, cols, i, j;

        System.out.print("Enter no. of rows << ");
        numberOfRows = scan.nextInt();
        
        int numberOfCols[] = new int [numberOfRows];
        int jaggedArray[][] = new int[numberOfRows][];
       
        System.out.println(); 
        for ( i = 0 ; i < numberOfRows ; i++ )
        {
            System.out.print("Enter no. of Columns for " + "row " + (i + 1) + " << ");
            numberOfCols[i] = scan.nextInt();
        }
            
        for ( i = 0 ; i < jaggedArray.length ; i++ )
            jaggedArray[i] = new int[numberOfCols[i]];
        System.out.println();
        for( i = 0 ; i < jaggedArray.length ; i++ )
        {
            for ( j = 0 ; j < jaggedArray[i].length ; j++ )
            {
                System.out.print("jaggedArray[" + (i+1) + "][" + (j + 1) + "] << ");
                jaggedArray[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println("Jagged Array : ");
        for( i = 0 ; i < jaggedArray.length ; i++ )
        {
            for ( j = 0 ; j < jaggedArray[i].length ; j++ )
                System.out.print(jaggedArray[i][j] + "\t");
            System.out.println();
        }
    }
}