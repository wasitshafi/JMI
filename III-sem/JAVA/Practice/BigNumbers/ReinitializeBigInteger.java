import java.math.BigInteger;

public class ReinitializeBigInteger
{
    public static void main(String... args)
    {
        BigInteger b = new BigInteger("123");

        System.out.println(b);
        b = BigInteger.valueOf(132456);
        System.out.println(b);
    }
}