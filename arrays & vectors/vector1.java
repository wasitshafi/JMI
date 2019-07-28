import java.util.*;
class Main{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        Vector<Integer> arr = new Vector<Integer>(5); /// Vector only accepts objects, so Vector<int>... will raise an errror.
        
        char choice;
        int data;


        do{
            System.out.print("\nEnter element : ");
            data = scan.nextInt();
            arr.addElement(data);
            System.out.print("Do you want to add new element(y/n)...?");
            choice = scan.next().charAt(0);
          }while(choice == 'y' || choice == 'Y');

        System.out.println("Array elements are as : " + arr);

        System.out.print("Array elements are as[Using enumeration] : ");
        Enumeration enu = arr.elements();
        while (enu.hasMoreElements())
            System.out.print(enu.nextElement() + " ");
     }
}