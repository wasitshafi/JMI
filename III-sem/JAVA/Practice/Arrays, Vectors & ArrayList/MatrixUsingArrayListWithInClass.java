import java.util.Scanner;
import java.util.ArrayList;

class Matrix
{
    private Integer rows, cols, item;
    private Scanner scan = new Scanner(System.in);
    private ArrayList<ArrayList<Integer>> M = new ArrayList<>();
    
    private void setDimensions()
    {
        System.out.print("No. of Rows...");
        rows = scan.nextInt();
    
        System.out.print("No. of Cols...");
        cols = scan.nextInt();
    }

    public void setMatrixInteger()
    {
        setDimensions();
        
        for(int i = 1 ; i <= rows ; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 1 ; j <= cols ; j++)
            {
                System.out.print("Matrix [" + i + "][" + j + "] : ");
                item = scan.nextInt();
                temp.add(item);
            }
            M.add(temp);
            System.out.println();
        }
    }
    public void getMatrix()
    {
        System.out.println("Matrix is as follows : "); 
        for(int i = 0 ; i  < M.size() ; i++) 
        {
            for(int j = 0 ; j < M.get(i).size() ; j++)
                System.out.print(M.get(i).get(j) + " ");
            System.out.println();
        } 
    }
}

public class MatrixUsingArrayListWithInClass
{
    public static void main(String[] args)
    {
        Matrix m = new Matrix();

        m.setMatrixInteger();
        m.getMatrix();
    }   
}