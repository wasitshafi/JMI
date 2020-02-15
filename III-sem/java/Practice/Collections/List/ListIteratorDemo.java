/**
    @author wasitshafi
    @since  14-02-2020
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo
{
    public static void main(String... args)
    {
        LinkedList<Integer> ll = new LinkedList<>(); 
        ll.add(10);
        ll.add(50);
        ll.add(100);
        ll.add(5);

        System.out.println("Linked List : " + ll);
        ListIterator<Integer> itr = ll.listIterator(); // it can be used only those which implement list interface

        // it will retun the index of element if we call next()/previous()
        System.out.println("itr.nextIndex() : " + itr.nextIndex());
        System.out.println("itr.nextIndex() : " + itr.previousIndex());

        System.out.print("Forward traversal  : ");
        while(itr.hasNext()) System.out.print(itr.next() + " ");
    
        System.out.print("\nBackward traversal : ");
        while(itr.hasPrevious()) System.out.print(itr.previous() + " ");
        
        itr = ll.listIterator();
        itr.add(1000); // it will add the element before the current iterator position
        System.out.println("\nadd(100) : " + ll);

        itr = ll.listIterator();
        itr.next();
        itr.set(4555); // set the last visited element(next/preious)          
        System.out.println("set(4555) : " + ll);

        itr = ll.listIterator();
        itr.next();
        itr.remove(); // deletes the last visited element(next/previous)
        System.out.println("remove() : " + ll);
    }
}