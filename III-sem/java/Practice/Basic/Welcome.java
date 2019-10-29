public class Welcome
{
    public static void main(String []args)
    {
        String s = "Welcome to Java";

        System.out.println(s);
        // Cay S. Horstman very first program
        for(int i = 0 ; i < s.length() ; i++)
            System.out.print("=");
        System.out.println();
    }
}