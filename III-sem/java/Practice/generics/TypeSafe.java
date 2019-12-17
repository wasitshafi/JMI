import java.util.*;
public class TypeSafe
{
    public static void main(String[] args)
    {
        List l = new ArrayList();

        l.add(1);
        l.add(20.5);
        l.add("Hello");
        l.add(true);

        System.out.print("List l is as follows   : ");
        for(int i = 0 ; i < l.size() ; i++)
            System.out.print(l.get(i) + "  ");
        // we can use generics to define the domain of elements

        List<Integer> l2 = new ArrayList<>();

        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        
        //l2.add(20.5);    // error
        //l2.add("Hello");
        //l2.add(true);

        System.out.print("\nList l2 is as follows : ");
        for(int i = 0 ; i < l2.size() ; i++)
            System.out.print(l2.get(i) + "  ");
    }
}