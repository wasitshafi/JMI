/**
    @author wasitshafi
    @since  15-02-2020
*/
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
public class MapViews
{
    public static void main(String... args)
    {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(0, "zero"); // HashMap doesn't remember the order of insertion where as LinkedHashMap does
        m.put(1, "one");
        m.put(5, "five");
        m.put(7, "seven");
        m.put(3, "three");
        m.put(2, "two");
        m.put(2, "two");
        m.put(6, "six");
        m.put(4, "four");
        m.put(10, "ten");
        m.put(2, "two");
        m.put(9, "nine");
        m.put(8, "eight");
        m.put(2, "two");

        // there are 3 views two among them are sets, and we can remove element from all these 3 views and change will be reflected in map as well but we can't add anything
        Set<Integer> ks= m.keySet(); // if we just need keys
        System.out.println("KeySet : " + ks);
        ks.remove(5);
        System.out.println("\nMap : ");
        for(Integer key : ks) System.out.println( key + " \t " + m.get(key) + " ");


        System.out.println("\nMap : "); // when we need both key as wel as value
        for(Map.Entry<Integer, String> entry : m.entrySet())   // has 3 methods getKey(), getValue(), setValue(newVal)
           System.out.println(entry.getKey() + "\t" + entry.getValue());
        // the above 2 views are implemented using sets

        Collection<String> values = m.values();
        System.out.println("Values : " + values);

        System.out.println("\nMap : " + m);
    }
}