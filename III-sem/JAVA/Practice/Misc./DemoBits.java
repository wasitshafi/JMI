/**
 * @author wasitshafi
 * @since 18-04-2020
 */
// Ref : https://www.hackerrank.com/topics/bit-manipulation
public class DemoBits
{
    public static void main(String... args)
    {
        String num = "3210  ";
        Integer i = Integer.valueOf(num);
        System.out.println("Num : " + num);
        System.out.println("i   : " + i);

        System.out.println("Integer.toBinaryString(i) : " + Integer.toBinaryString(i));
        System.out.println("Using  num.getBytes() & Integer.toBinaryString() [for each character]: ");
        for(Byte b : num.getBytes()) System.out.println(Integer.toBinaryString(b));
    }
}