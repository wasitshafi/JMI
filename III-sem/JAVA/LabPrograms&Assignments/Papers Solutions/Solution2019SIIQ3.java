// Error
/**
    @author wasitshafi
    @since  10-02-2020
*/
import java.util.Scanner;
import java.util.Iterator;

public class Solution2019SIIQ3 
{
    public <U extends Comparable> void findHighest(U arr[])  // do read horstman pg no 517 & 518
    {
        /*
        U max = arr[0];
        int len = arr.length;

        for(int i = 1 ; i < len ; i++) if(arr[i] >  max) max = arr[i];     // error
        System.out.println("Max : " + max); 
*/
        Iterator<U> itr = arr.Iterator();

    }

    public static void main(String... args)
    {
        Solution2019SIIQ3 obj = new Solution2019SIIQ3();

        Integer arrI[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Float arrF[] = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f};
        Double arrD[] = {1.1111d, 2.2222d, 3.3333d, 4.4444d, 5.5555d, 6.6666d, 7.7777d, 8.8888d, 9.9999d};

        obj.<Integer>findHighest(arrI);
/*        obj.<Float>findHighest(arrF);
        obj.<Double>findHighest(arrD);
        */
    }
}