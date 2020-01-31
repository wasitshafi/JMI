// for more info refer : https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
/*
    @author wasitshafi
    @since  31-01-2020
*/
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetsDemo
{
    public static void main(String... args)
    {
        Set<Integer> s = new HashSet<>();
        // Set<Integer> s = new HashSet<>(10);      // inital capacity
        // Set<Integer> s = new HashSet<>(10, .9f); // initial capacity, load factor(default is .75)

        System.out.println("Actual insertion order : [10, 20, 30, 25, 15, 5]");

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(25);
        s.add(15);
        s.add(5);
        System.out.print("HashSet elements       : ");
        System.out.println(s);

        // sorted set
        s = new TreeSet<>(); // we can also user navigableSet which consists some additional methods()
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(25);
        s.add(15);
        s.add(5);
        System.out.print("TreeSet elements       : "); // sorted
        System.out.println(s);

        s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(25);
        s.add(15);
        s.add(5);
        System.out.print("LinkedHashSet elements : "); // maintains the order of insertions
        System.out.println(s);

        //There is also EnumSet , ref : https://www.geeksforgeeks.org/enumset-class-java/
    }
}