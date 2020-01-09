public class ObjectClassArray
{
    public static void main(String... args)
    {
        Object o[] = new Object[5];
        o[0] = "hi..";
        o[1] = 10;
        o[2] = 20.10;
        o[3] = true;

        for(int i = 0 ; i < o.length ; i++) System.out.println(o[i] + " ");
    }
}