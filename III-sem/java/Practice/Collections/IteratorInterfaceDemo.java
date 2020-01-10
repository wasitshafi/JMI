import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceDemo
{
    public static void main(String... args)
    {
        ArrayList bucket = new ArrayList();

        System.out.println(bucket.add(10)); // add() return true if by adding current element it modifies the collection(HINT : In case of sets it can return false)
        System.out.println(bucket.add("Hello"));
        System.out.println(bucket.add(200));
        System.out.println(bucket.add("World"));
        System.out.println(bucket.add(true));
        System.out.println(bucket.add(3.33));
        System.out.println(bucket.add(99));

        Iterator itr = bucket.iterator(); // Iterator interface has 4 methods : hasNext(), next(), remove(), foreachremaining()
        System.out.print("Bucket : ");
        while(itr.hasNext()) System.out.print("'" + itr.next() + "'  ");

        // remove() removes the element that was returned by last next() method. Eg: to remove first element first of all we jave to call next() then remove() as  follows : 

        itr = bucket.iterator();
        itr.next();
        itr.remove();

        itr = bucket.iterator();
        System.out.print("\nBucket(After Removing first element): ");
        while(itr.hasNext()) System.out.print("'" + itr.next() + "'  ");
    // CTM : To remove adjacent elements we have to use like :
    /*
       ...
       a.next()
       ...
       remove();
       a.next();
       a.remove();

       rather than 
       ...
       a.next();
       ...
       remove();
       remove();
    */
    }
}