import java.util.*;

public class LinkedListDemo
{
    public static void main(String... args)
    {
        LinkedList<Integer> ll = new LinkedList<>(); // O(1) time complexity insert/delete operation

        ll.add(11);// add() is list Interface method()
        ll.add(22);// it append element
        ll.add(33);
        ll.add(44);

        System.out.print("\nLinkedList elements are as : ");
        for(int i = 0 ; i < ll.size() ; i++) System.out.print(ll.get(i) + " ");

        // LinkedList class Methods
        ll.addFirst(1000);        
        ll.addLast(2000);
        System.out.println("\nll : " + ll);

        ll.removeFirst();        
        ll.removeLast();
        System.out.println("ll : " + ll);

        System.out.println("ll.getFirst() : " + ll.getFirst());
        System.out.println("ll.getLast()  : " + ll.getLast());
    }
}