import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;

public class ReadPassword
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Console cons = System.console();
        String userName;

        System.out.print("Enter Username : ");
        userName = scan.next();   // CTM : In username spaces are invalid so don't read username with nextLine();
        
        cons.flush();
        char[] password = cons.readPassword("Enter Password : "); // for security purpose it returns array of character instead of string

        System.out.println();
        System.out.println("User Name : " + userName);
        System.out.println("Password  : " + password);
        System.out.println("Password  : " + Arrays.toString(password));
        System.out.println("Password  : " + new String(password));
        scan.close();
    }
}