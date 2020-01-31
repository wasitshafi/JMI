import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

// CTM : here we have used Collections along generic, although we can use Collections without generics(raw type/ without bounding)
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        Integer item;
        String choice;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList<>(); // they are not thread synchronized where as vector are sync., arraylist is quit fast as compared with vector

        do
        {
            System.out.print("Enter Item : ");
            item = scan.nextInt();
            arrayList.add(item);
            System.out.print("Do u want to continue(y/n)...");
            
            choice = scan.next();
        }while(choice.equals("y"));

        System.out.println();
        System.out.print("Iterating over ArrayLists using for each loop : ");
        for(Integer i : arrayList) System.out.print(i + " ");

        System.out.println();        
        System.out.print("Iterating over ArrayLists using for loop : ");
        for(int i = 0 ; i < arrayList.size() ; i++) System.out.print(arrayList.get(i) + " ");

        System.out.println();
        System.out.print("Iterating over ArrayLists using Iterator : ");
        Iterator <Integer>itr = arrayList.iterator();
        while(itr.hasNext()) System.out.print(itr.next() + " ");

        System.out.println();
        System.out.print("Iterating over ArrayLists using for each method(lamda expression) : ");
        arrayList.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // java8
        System.out.println();
        itr = arrayList.iterator();
        System.out.print("Iterating over ArrayLists using for eachEachRemaining(lamda expression) : ");
        itr.forEachRemaining(element -> {System.out.print(element + " ");});
        System.out.println();

        
        

        scan.close();
    }
}