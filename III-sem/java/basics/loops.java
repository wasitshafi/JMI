//
//switch.java
//
//program to show  various loops in java
//
import java.util.Scanner;
public class loops
{
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();

        System.out.print("Printing using for loop   ");
        int i;
        for(i = 0 ; i <= n ; i++)
         System.out.print(i + " ");

        System.out.print("\nPrinting using while loop ");
        i = 0;
        while(i <= n )
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.print("\nPrinting using for loop   ");
        i = 0;
        do{  
            System.out.print(i+ " ");
            i++;
        }while(i <= n);

        // for each loop in java
        
        String fruits[] = {"Apple", "Banana", "Grapes", "Orange", "Mango"};
        System.out.print("\nPrinting fruits[] using for each loop : ");
        for (String f : fruits) //similar to 'for i in fruits:' in python ....(iterator)CTM: we don't specify datatype in python
            System.out.print(f + " ");
        
        int []prime = {2, 3, 5, 7, 11}; // or int prime[] = {2, 3, 5, 7, 11};
        System.out.print("\nPrinting prime[] using for each loop : ");
        for (int p : prime) 
            System.out.print(p + " ");
    }
}