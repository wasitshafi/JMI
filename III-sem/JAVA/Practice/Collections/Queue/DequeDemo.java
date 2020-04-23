/**
    @author wasitshafi
    @since  14-02-2020
*/  
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo
{
    public static void main(String... args)
    {
        Deque<Integer> dq = new LinkedList<Integer>(); // FIFO

        // throws Exception 
        dq.addFirst(10);
        dq.addLast(20);

        dq.addFirst(30);
        dq.addFirst(40);
        dq.addFirst(50);
        dq.addFirst(60);
        
        // return value true/false
        dq.offerFirst(2000);
        dq.offerLast(5000);

        System.out.println("dequeue  after add() : " + dq);

        // throws Exception 
        System.out.println("dq.getFirst()  : " + dq.getFirst());
        System.out.println("dq.getLast()   : " + dq.getLast());

        // return value
        System.out.println("dq.peekFirst() : " + dq.peekFirst());
        System.out.println("dq.peekLast()  : " + dq.peekLast());
        

        // throws Exception 
        dq.removeFirst();
        dq.removeLast();
        System.out.println("dequeue  after removeFirst() & removeLast() : " + dq);

        // return value
        dq.pollFirst();
        dq.pollLast();
        System.out.println("dequeue  after pollFirst() & pollLast()     : " + dq);
    }
}