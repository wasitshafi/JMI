import java.util.Scanner;
class readString1
{
    public static void main(String []args)
    {
        String str = "";
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string : ");
        str += scan.nextLine();
        System.out.print("Entered string is : " + str);
    }
}