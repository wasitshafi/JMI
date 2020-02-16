/**
    @author wasitshafi
    @since  15-02-2020
*/
import java.util.LinkedHashMap;

public class LinkedHashMapDemo
{
    public static void main(String... args)
    {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();

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

        System.out.println("Actual Insertion order : 0 => 1 => 5 => 7 => 3 => 2 => 6 => 4 => 10 => 2 => 9=> 8 => 2");
        System.out.println("m : " + m);
    }
}