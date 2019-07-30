public class unicode
{
    public static void main(String []args)
    {
        
        System.out.println("Unicode are as :");
        for(int i = 0 ; i < 65535 ; i++)
            System.out.print(i+ "=> '" + (char)i + "'\t");
    }
}