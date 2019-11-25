import java.util.Scanner;
public class ScannerWithoutObjectDemo
{
    public static void main(String[] args)
    {
        String s = "";

        System.out.print("Enter String : ");
        s = (new Scanner(System.in)).nextLine();
        System.out.println("String : " + s);
    }
}