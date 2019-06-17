import java.util.Scanner;
class readString2
{
    public static void main(String []args)
    {
        String str;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter string : ");
        str = scan.nextLine();
        System.out.println("Entered string is : " + str);
        scan.close();
    }
}