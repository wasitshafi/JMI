/**
    @author wasitshafi
    @since  15-02-2020
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class BinarySearchDemo
{
    public static void main(String... args)
    {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("hello");
        arr.add("the");
        arr.add("abc");
        arr.add("zye");
        arr.add("aab");
        Collections.sort(arr);
        // for binarySearch, elements must be in sorted order, it return the index 
        System.out.println(Collections.binarySearch(arr, "hello")); // refer hortman pg no 552 
    }
}