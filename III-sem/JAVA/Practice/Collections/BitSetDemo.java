/**
    @author wasitshafi
    @since  17-02-2020
*/
import java.util.BitSet;

public class BitSetDemo
{
    public static void main(String... args)
    {
        BitSet b = new BitSet(10); // 10 is initial capacity
        BitSet b2 = new BitSet(15); // 10 is initial capacity
        
        System.out.println("b.length()  : " + b);
        System.out.println("b2.length() : " + b2);

        b.set(3); // set third bit to 1;
        b.set(5);

        b2.set(3);
        b2.set(6);
        b2.set(20);
        
        System.out.println("b : " + b);
        System.out.println("b2 : " + b2);

        System.out.println("\nb.get(3) : " + b.get(3));
        System.out.println("b.get(4) : " + b.get(4));
        System.out.println("b.get(5) : " + b.get(5));
        System.out.println("b.get(30): " + b.get(30));

        System.out.println("\nb2.get(3) : " + b2.get(3));
        System.out.println("b2.get(4) : " + b2.get(4));
        System.out.println("b2.get(6) : " + b2.get(6));

        b.and(b2);
        System.out.println("\nb.and(b2)   : " + b);
        
        // just to reset 
        b.clear();
        b.set(3);
        b.set(5);
        b.or(b2);
        System.out.println("b.or(b2)    : " + b);
    
        // just to reset 
        b.clear(); // b.clear(n) // to set 'n' bit false
        b.set(3);
        b.set(5);
        b.xor(b2);
        System.out.println("b.xor(b2)   : " + b);
    
        // just to reset 
        b.clear();
        b.set(3);
        b.set(5);
        b.andNot(b2); // clears all bits in 'b' that are set in the 'b2'
        System.out.println("b.andNot(b2): " + b);
    }
}