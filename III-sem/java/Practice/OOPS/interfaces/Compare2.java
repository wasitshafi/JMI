import java.math.BigDecimal;
import static java.lang.System.out;

// Refer cay Horstman p.no : 271(Note)
public class Compare2
{
    public static void main(String... args)
    {        
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");

        out.println(b1.compareTo(b2)); // equal because there is no way to decide which is greater/Smaller.
        out.println(b1.equals(b2));    // not Equal because of precision.
    }
}