/**
    @author wasitshafi
    @since  14-02-2020
*/
import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo
{
    public static void main(String... args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(5);
        pq.add(2);
        pq.add(10);
        pq.add(25); // CTM : PriorityQueue doesn't sort all elements
        System.out.println("Priority Queue : " + pq); // although it may not sorted by elements will be removed priority wise, low to high, we can also implement it to on our specific class using Comparable interface
        pq.remove();
        System.out.println("Priority Queue after remove() : " + pq); // it will always remove low priority element, here i.e. element '2'
        System.out.println("pq.peek()    : " + pq.peek());
        System.out.println("pq.isEmpty() : " + pq.isEmpty());
        // it has several methods like poll(), peek(), offer(),size(), contains() etc 
    }

}