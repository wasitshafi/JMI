/**
    @author wasitshafi
    @since  14-02-2020
*/  
import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo
{
    public static void main(String... args)
    {
        // CTM : Queue is interface not class, so we need a some concrete class which can implement it like likedlist, priorityqueue etc
        Queue<Integer> q = new LinkedList<Integer>(); // FIFO

        // they throws Exception 
        q.add(10); // if queue is full in case of bounded queue, then add() throws exception
        q.add(20);
        q.add(10);
        q.add(50);
        System.out.println("Queue                : " + q);        
        q.remove(); // removes front element
        System.out.println("Queue after remove() : " + q);            
        System.out.println("q.peek()             : " + q.peek());

        // they return value(true/false/null)
        q.offer(50);
        System.out.println("\n\nqueue after offer(50): " + q);        
        q.poll();
        System.out.println("queue after poll()   : " + q);
        System.out.println("q.element()          : " + q.element());
    }
}