//
//
//
//
//
public class decimalOctalHexaBinaryNumbers
{
    public static void main(String a[])
    {
        int tenInBinary = 0b01010;  // prefix '0b' or '0B'
        int tenInHexa = 0xA;        // prefix '0x' or '0X'
        int eightInOctal = 010;
        int deimalAmount = 20_000; // CTM : just like in real life we use ',' for number representation eg: 20,000 we can '_' in java so to make it more readable EX: 20_000

        System.out.println("tenInBinary  : " + tenInBinary);
        System.out.println("tenInHexa    : " + tenInHexa);
        System.out.println("eightInOctal : " + eightInOctal);
        System.out.println("decimalAmount: " + decimalAmount);
    }
}