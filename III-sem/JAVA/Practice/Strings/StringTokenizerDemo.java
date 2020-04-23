/**
    @author wasitshafi
    @since  11-02-2020
*/

import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String... args)
    {
        StringTokenizer tokens = new StringTokenizer("The quick brown fox jumps over to the lazy dog. Tit for Tat.", " ");
        while(tokens.hasMoreTokens()) System.out.println(tokens.nextToken());
    }
}