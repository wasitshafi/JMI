import java.util.StringTokenizer;

public class Solution2018Q3B
{
    public static void main(String[] args)
    {
        String str = "Oxford University Press,Cambridge University Press, Springer-Nature, Elsevier, TMH, Pearsons";
        StringTokenizer st = new StringTokenizer(str, ",");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken().trim());//trim() to remove leading & trailing spaces

        // Alternate Method
        /*
        String publishers[] = str.split(",");
        for(int i = 0 ; i <  publishers.length ; i++)
            System.out.println(publishers[i].trim());
        */
        }
}