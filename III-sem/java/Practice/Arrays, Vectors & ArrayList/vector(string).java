import java.util.Scanner;
class Main{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        Vector<String> arr = new Vector<String>(); // Vector only accepts objects, so Vector<int>... will raise an errror.
        
        char choice;
        String str;

        do{
            System.out.print("\nEnter string : ");
            str = scan.nextLine();

            arr.addElement(str);
            System.out.print("Do you want to add new element(y/n)...?");
            choice = scan.next().charAt(0);
            scan.nextLine(); // clearing buffer ( '\n' as next string  scan  may take '\n' as a character... )
          }while(choice == 'y' || choice == 'Y');

        System.out.println("Array elements are as : " + arr);

        System.out.print("Array elements are as[ Using enumerations ] : ");
        Enumeration enu = arr.elements();
        while (enu.hasMoreElements())
            System.out.println(enu.nextElement() + " ");
     }
}