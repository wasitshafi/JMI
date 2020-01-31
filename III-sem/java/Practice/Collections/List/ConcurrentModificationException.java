import java.util.*;

public class ConcurrentModificationException
{
    public static void main(String... args)
    {
        List<Integer> ll = new LinkedList<>();
        ListIterator litr = ll.listIterator();
        ListIterator litr2 = ll.listIterator();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        litr.remove();
        System.out.println(litr2.next()); // Concurrent Modification Error // for more info refer Cay Horstman, p.no : 478
    }
}