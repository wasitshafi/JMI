import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTraversal
{
    public static void main(String... args)
    {
        PrintStream p = new PrintStream(System.out);
        ArrayList<Integer> arr = new ArrayList<>();
        Iterator<Integer> itr; // we also have ListInterface with additional methods eg : hasPrevious(), previous()
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);

        p.print("Method 1    : " + arr);

        p.print("\nMethod 2    : ");
        for(int i = 0 ; i < arr.size() ; i++) p.print(arr.get(i) + " ");

        p.print("\nMethod 3    : ");
        for(Integer item : arr)
            p.print(item + " ");

        p.print("\nMethod 4    : ");
        itr = arr.iterator();
        while(itr.hasNext())
            p.print(itr.next() + " ");
        
        // The Below way are more precise to traverse the collection
        p.print("\nMethod 5    : ");
        arr.forEach(element -> p.print(element + " "));

        itr = arr.iterator();
        p.print("\nMethod 6    : ");
        itr.forEachRemaining(element -> {p.print(element + " ");}); // arguments -> body
         // or
        p.print("\nMethod 601  : ");
        (arr.iterator()).forEachRemaining(element -> p.print(element + " "));
        p.println();
        p.close();
    }
}