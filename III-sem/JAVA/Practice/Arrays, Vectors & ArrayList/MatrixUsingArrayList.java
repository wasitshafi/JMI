import java.util.Scanner;
import java.util.ArrayList;

public class MatrixUsingArrayList
{
    public static void main(String[] args)
    {
        Integer rows, cols, item;
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();
        
        System.out.print("No. of Rows...");
        rows = scan.nextInt();

        System.out.print("No. of Cols...");
        cols = scan.nextInt();
        
        for(int i = 1 ; i <= rows ; i++)
        {
            // It must be declared each time otherwise if you try to declare it outside and use ArrayList.clear(temp) then it will also clear the content in main ArrayList 
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 1 ; j <= cols ; j++)
            {
                System.out.print("Matrix [" + i + "][" + j + "] : ");
                item = scan.nextInt();
                temp.add(item);
            }
            Matrix.add(temp);
            System.out.println();
        }

        System.out.println("Matrix is as follows : ");
        for(int i = 0 ; i  < Matrix.size() ; i++) 
        {
            for(int j = 0 ; j < Matrix.get(i).size() ; j++)
                System.out.print(Matrix.get(i).get(j) + " ");
            System.out.println();
        } 
    }
}