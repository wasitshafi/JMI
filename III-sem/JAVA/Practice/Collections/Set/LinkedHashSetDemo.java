/*
    @author wasitshafi
    @since  15-02-2020
*/
//for more info refer : https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html#methods_inherited_from_class_java.util.HashSet
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo
{
    public static void main(String... args)
    {
        LinkedHashSet<Integer> o = new LinkedHashSet<>();
        o.add(10);
        o.add(15);
        o.add(20);
        o.add(5);
        o.add(12);
        o.add(15);
        o.add(9);
        o.add(7);
        o.add(20);

        System.out.println("Actual Insertion : 10, 15, 20, 5, 12, 15, 9, 7, 20");
    
        Iterator itr = o.iterator();
        System.out.print("LinkedHashSet    : ");while(itr.hasNext()) System.out.print(itr.next() + " ");
        System.out.println("\nSize : " + o.size());
    }
}