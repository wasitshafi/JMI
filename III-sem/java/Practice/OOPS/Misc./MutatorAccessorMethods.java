import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MutatorAccessorMethods
{
    public static void main(String[] args)
    {
        System.out.println("Accessor Method Example\n");
        String s;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter string : ");
        s = scan.nextLine();
        
        String s2 = s.toUpperCase(); // toUpperCase() is an example of Accessor as it only access objects without modifying them. // They r also known as getters
        // C++ NOTE : Suppose we prefix 'const' on member function then that will also be called as Accessor Method.
        System.out.printf("String1 : " + s + "%n");
        System.out.printf("String2 : " + s2 + "%n");

        System.out.println("\n\nMutator Method Example");
        GregorianCalendar gc = new GregorianCalendar(2018, 12, 24);
        System.out.println("Day   : " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month : " + gc.get(Calendar.MONTH)); // 1 for jan...11 for nov, 0 for Dec
        System.out.println("Year  : " + gc.get(Calendar.YEAR));

        System.out.println();
        //add() is a mutator method as it change the state of the object i.e add() method is a mutates the object on which it is invoked.
        gc.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Day   : " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month : " + gc.get(Calendar.MONTH));
        System.out.println("Year  : " + gc.get(Calendar.YEAR));
    }
}