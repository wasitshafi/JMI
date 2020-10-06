/**
    @author wasitshafi
    @since  15-02-2020
*/
import java.util.HashMap;

public class HashMapDemo
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

        System.out.println("map : " + m + "\n");
        System.out.println("m.keySet()         : " + m.keySet()); // keys will always be unique, that is keySet()
        System.out.println("m.values()         : " + m.values());
        System.out.println("m.containsKey(5)   : " + m.containsKey(5));
        System.out.println("m.containsValue(\"ten\") : " + m.containsValue("ten"));
        System.out.println("m.size()           : " + m.size());
        System.out.println("m.isEmpty()        : " + m.isEmpty());
        System.out.println("m.hashCode()       : " + m.hashCode());
        System.out.println("m.get(4)           : " + m.get(4));
        System.out.println("m.get(44)          : " + m.get(44));
        
        m.remove(5);
        m.put(9,"NINE"); // updating map
        System.out.println("map after remove(5): ");
        System.out.println("map after updating put(9, \"NINE\"): ");
        m.forEach((k, v) -> {System.out.println("Key : " + k + "\tValue : " + v);}); // refer horstman pg no : 498
    }
}