public class ScannerWithoutImportingDemo
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new java.util.Scanner(System.in); // fully class name
        String s = "";

        System.out.print("Enter String : ");
        s = scan.nextLine();
        System.out.println("String : " + s);
        scan.close();
    }
}