import java.util.Scanner;

public class StringBuilderExample2
{
    public static void main(String... args)
    {
        StringBuilder sb  = new StringBuilder("The quick brown fox jumps over to the lazy dog tit for tat");
        String str = "Hello... My name is wasit";
    
    
        // For replacing an individual character we can use replace method as follows
        System.out.println("sb   : '" + sb + "'");
        for(int i = 0 ; i < sb.length() ; i++)
        {
            if(i == str.length()) break;
            sb.replace(i, i + 1, Character.toString(str.charAt(i))); // sb[i] = s[i] in c++
            //sb.replace(i, i, Character.toString(str.charAt(i))); // this will insert a new character 


        }    
    
        System.out.println("sb   : '" + sb + "'");
        System.out.println("str  : '" + str + "'");
    }
}