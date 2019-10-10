//
//switch.java
//
//program to show switch-case control statement
//
import java.util.Scanner;
public class switchCase
{
    public static void main(String a[])
    {
        System.out.println("1 => Monday.");
        System.out.println("2 => Tuesday.");
        System.out.println("3 => Wednesday.");
        System.out.println("4 => Thursday.");
        System.out.println("5 => Friday.");
        System.out.println("6 => Saturday.");
        System.out.println("7 => Sunday.");
        System.out.print("\n\nEnter your choice :");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        switch(choice)
        {
            case 1: System.out.println("You selected Monday.");
            break;
            case 2:System.out.println("You selected Tuesday.");
            break;
            case 3:System.out.println("You selected Wednesday.");
            break;
            case 4:System.out.println("You selected Thursday.");
            break;
            case 5:System.out.println("You selected Friday.");
            break;
            case 6:System.out.println("You selected Saturday.");
            break;
            case 7:System.out.println("You selected sunday.");
            break;
            default:System.out.println("Invalid Choice...!");
        }
    }
}