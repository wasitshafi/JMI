import java.util.Scanner;

public class searchElementInMatrix
{
    static void search(int matrix[][], int key)
    {
        final int n = matrix.length - 1;
        if(key < matrix[0][0] || key > matrix[n][n])
             System.out.println("Element not found...!");
        else
        {
            int i = 0, j = n;       // starting from top right corner

            while(i < matrix.length && j >= 0)
            {
                if(matrix[i][j] == key)
                {
                    System.out.println("Element found at index (" + (i + 1) + " , " + (j + 1) + ") : ");
                    return ;                 
                }
                else if(matrix[i][j] < key) 
                   i++;   // we have to move left in a row
                else
                    j--;  // we have to move down in a column
            }
            System.out.println("Element not found...!");
        }
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int matrix[][], n, key;

        System.out.print("Enter order of matrix : ");
        n = scan.nextInt();
        
        matrix = new int[n][n];

        for( int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print("Matrix[" +(i + 1) + "]["+(j + 1) + "] << ");
                matrix[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        System.out.println( "Matrix is as follows : ");
        for( int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
                System.out.print(matrix[i][j] + " ");   
            System.out.println();
        }

        while(1 != 0) // while(1) loop
        {
            char choice;

            System.out.print("\nEnter value to be search : ");
            key = scan.nextInt();

            search(matrix, key);
            
            System.out.print("\nDo you want to continue (y/n) : ");
            choice = scan.next().charAt(0);

            if(choice != 'y' && choice != 'Y') break;
        }
    }
}