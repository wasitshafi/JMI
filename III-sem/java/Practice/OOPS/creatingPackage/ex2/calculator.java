import java.util.Scanner;
import mathematical_operations.arithmetic;

public class calculator{
    public static void main(String []args)
    {
     int x, y;
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter value of x : ");
     x = scan.nextInt();

     System.out.print("Enter value of y : ");
     y = scan.nextInt();
     
     arithmetic obj = new arithmetic();
     int sum = obj.sum(x, y);

     System.out.print ( "x = " + x + "\ny = " + y + " = " + sum);
    }
}