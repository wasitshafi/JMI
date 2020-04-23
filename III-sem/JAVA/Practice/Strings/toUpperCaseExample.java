public class toUpperCaseExample
{
    public static void main(String[] arg)
    {
        String s = "The quick brown fox jumps over to the lazy dog. Tit for tat.";
        String s2 = s.toUpperCase();

        System.out.println("s  : " + s); // The original object remains unchanged i.e. method does not mutate the object on which it is invoked
        System.out.println("s2 : " + s2);
   
    }
}