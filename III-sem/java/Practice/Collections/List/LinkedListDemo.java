import java.util.*;

public class LinkedListDemo
{
    public static void main(String... args)
    {
        List<Integer> ll = new LinkedList<>();

        ll.addLast(10);
        ll.addFirst(50);

        System.out.println(ll);
    }
}