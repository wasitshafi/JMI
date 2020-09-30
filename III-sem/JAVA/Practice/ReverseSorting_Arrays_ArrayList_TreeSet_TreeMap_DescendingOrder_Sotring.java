/**
 * @author WasitShafi
 * @since 27-SEP-2020
 */

import java.util.Arrays;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.out;

public class ReverseSorting_Arrays_ArrayList_TreeSet_TreeMap_DescendingOrder_Sotring {
  public static void arrays() {
    out.println("PRIMITIVE ARRAY");
    int[] arr = {
      2,-1,44, 2, 05, 6, 99, 10, -33  
    };
    Arrays.sort(arr);
    out.println("Sorted Array : " + Arrays.toString(arr));    
  }

  public static void arraylist() {
    out.println("\n\nCollections : ARRAY LIST");
    ArrayList<Integer> al = new ArrayList<>();
    al.add(20);
    al.add(-5);
    al.add(50);
    al.add(15);
    al.add(64);
    al.add(55);
    al.add(10);
    al.add(-9);
    Collections.sort(al);
    out.println("Sorted ArrayList : " + al);
    Collections.sort(al, Collections.reverseOrder()); // important
    out.println("Sorted ArrayList : " + al);
  }

  public static void treeset() {
    TreeSet<Integer> ts1 = new TreeSet<>();
    
    ts1.add(10);
    ts1.add(50);
    ts1.add(30);
    ts1.add(5);
    ts1.add(-5);
    ts1.add(48);
    ts1.add(22);
    ts1.add(9);

    out.println("\n\nCollections : TreeSet");
    System.out.println("TS1 : " + ts1);
    TreeSet<Integer> ts2 = (TreeSet<Integer>)ts1.descendingSet(); // important
    ts1 = (TreeSet<Integer>)ts1.descendingSet();
    System.out.println("TS2 : " + ts2);
    System.out.println("TS1 : " + ts1);
    out.println("Printing using for each loop : ");
    System.out.println("TreeSet1 : ");
    for(Integer item : ts1) {
       out.print(item + " ");
    }
     // Or simply
    TreeSet<Integer> ts3 = new TreeSet<Integer>(Collections.reverseOrder());
    ts3.add(-5);
    ts3.add(10);
    ts3.add(15);
    ts3.add(5);
    System.out.println("\nTS3 : " + ts3);
  }

  public static void treemap() {
    TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(Collections.reverseOrder());

    tm1.put(10, "ten");
    tm1.put(50, "fifty");
    tm1.put(30, "thirty");
    tm1.put(5, "five");
    tm1.put(-5, "negativefive");
    tm1.put(48, "forty-eight");
    tm1.put(22, "twenty two");
    tm1.put(9, "nine");

    out.println("\n\nCollections : TreeMap");
    System.out.println("TM1 : " + tm1);
  }

  public static void main(String[] args) {
    arrays();
    arraylist();
    treeset();
    treemap();
  }
}