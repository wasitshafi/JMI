//
//
//
//
//
import java.util.Scanner;

public class variableSizedArray
{
    public static void main(String []args)
    {
        int c1, c2, c3;
        Scanner scan = new Scanner(System.in);
        
        int mat[][] = new int[3][];  // no of rows is 3

        System.out.println("Enter no of columns for first row : ");
        c1 = scan.nextInt();

        System.out.println("Enter no of columns for second row : ");
        c2 = scan.nextInt();

        System.out.println("Enter no of columns for third row : ");
        c3 = scan.nextInt();

        mat[0] = new int [c1];        
        mat[1] = new int [c2];
        mat[2] = new int [c3];
    }
}