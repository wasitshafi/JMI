import java.util.*;

class Demo
{
    private final int i;
    private final String str;
    private final StringBuilder sb;
    // Final will be suitable for dealing with Immutable/primiti types..it may be confusing for mutable class
    
    public Demo(String str, int i)
    {
        this.str = str;
        this.i = i;
        sb = new StringBuilder(); // now we can change the object reference but object can mutate.
        sb.append(str);  // optional to initialize here as StringBuilder belongs to Mutable class.
    }

    public void mutatort()
    {
        // str = "Not Allowed"; // error
        // i = 10;              // error
        sb.append(" " + str);
    }
    
    public void accessor()
    {
        System.out.println("i   : " + i);
        System.out.println("str : " + str);
        System.out.println("sb  : " + sb);
        System.out.println();
    }
}

public class FinalInstanceField
{
    public static void main(String[] arg)
    {
        Demo p = new Demo("String is Immutable but StringBuilder is Mutable.", 10);
        
        p.mutatort();
        p.accessor();
    
        p.mutatort();
        p.accessor();

        p.mutatort();
        p.accessor();
    }
}