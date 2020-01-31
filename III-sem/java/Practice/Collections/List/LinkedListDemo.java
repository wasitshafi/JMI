import java.util.*;

public class LinkedListDemo
{
    public static void main(String... args)
    {
        List<Integer> ll = new LinkedList<>(); // O(1) time complexity insert/delete operation

        ll.add(11);
        ll.add(22);// it append element
        ll.add(33);
        ll.add(44);

        Iterator<Integer> itr = ll.iterator();

        System.out.print("LinkedList elements are as : ");
        while(itr.hasNext()) System.out.print(itr.next() + " ");

        System.out.print("\nLinkedList elements are as : ");
        for(int i = 0 ; i < ll.size() ; i++) System.out.print(ll.get(i) + " ");
        
        System.out.println("\nLinkedList elements are as :" +  ll);

        ListIterator<Integer> litr =  ll.listIterator(); // it has additional methods

        litr.next();
        litr.add(100);

        System.out.print("After inserting element at index 1 : " + ll);
    }
}