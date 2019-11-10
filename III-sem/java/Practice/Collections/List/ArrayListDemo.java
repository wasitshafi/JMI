import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        Integer item;
        String choice;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList<>();

        do
        {
            System.out.print("Enter Item : ");
            item = scan.nextInt();
            arrayList.add(item);
            System.out.print("Do u want to continue(y/n)...");
            
            choice = scan.next();
        }while(choice.equals("y"));

        System.out.println();
        System.out.print("Iterating over ArrayLists using for each loop :");
        for(Integer i : arrayList) System.out.print(i + " ");

        System.out.println();        
        System.out.print("Iterating over ArrayLists using for loop :");
        for(int i = 0 ; i < arrayList.size() ; i++) System.out.print(arrayList.get(i) + " ");

        System.out.println();
        System.out.print("Iterating over ArrayLists using Iterator :");
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()) System.out.print(itr.next() + " ");

        System.out.println();
        System.out.print("Iterating over ArrayLists using for each method :");
        arrayList.forEach(Element->System.out.print(Element + " "));
        System.out.println();
        scan.close();
    }
}