import static java.lang.System.out;
public class String3
{
    public static void main(String []args)
    {
        String s1 = "The quick";                        // String Constant pool
        String s2 = new String("The quick");            // heap
        String s3 = new String("The quick");            // heap
        String s4 = new String("The quick").intern();   // String Constant pool
        

        out.printf("S1 : %s%nS2 : %s%nS3 : %s%nS4 : %s%n", s1, s2, s3,s4);

        out.println("s1 == s2      : " + (s1==s2));     // false
        out.println("s1 == s4      : " + (s1==s4));     // true
        out.println("s2 == s3      : " + (s2==s3));     // false
        out.println("s3 == s4      : " + (s1==s2));     // false
    }
}