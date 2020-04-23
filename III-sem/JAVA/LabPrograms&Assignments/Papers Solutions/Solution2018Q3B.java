/**
    @author wasitshafi
    @since  09-02-2020
 */
 import java.util.StringTokenizer;

public class Solution2018Q3B
{
    public static void main(String[] args)
    {
        String str = "Oxford University Press,Cambridge University Press, Springer-Nature, Elsevier, TMH, Pearsons";
        StringTokenizer st = new StringTokenizer(str, ",");

        System.out.println("List of Publishers : ");

        while(st.hasMoreTokens()) System.out.println(st.nextToken().trim()); //trim() to remove leading & trailing spaces
    
      /*String publishers[] = str.split(",");
        int len = publishers.length;
        for(int i = 0 ; i < len ; i++)
            System.out.println(publishers[i].trim());
      */
    }
}