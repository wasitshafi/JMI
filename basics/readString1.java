import java.util.Scanner;
class readString1{
        public static void main(String []args)
        {
            String str;
            Scanner scan = new Scanner(System.in);
            System.out.print("\nEnter string : ");
            str = scan.nextLine(); // reading characters with spaces
            scan.close();
            System.out.println("String is as follows : " + str);    
        }
}