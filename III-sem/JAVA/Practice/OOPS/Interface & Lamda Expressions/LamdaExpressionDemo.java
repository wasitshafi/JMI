import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class LamdaExpressionDemo
{
    public static void main(String... args)
    {
        String arr[] ={"The", "Quick", "Brown", "Fox", "Jumps", "Over", "To", "The", "Lazy", "Dog", "Tit", "For", "Tat"};

        out.println("Before Sorting : ");
        out.println(Arrays.toString(arr));

        
        Arrays.sort(arr);
        out.println("After Sorting : ");
        out.println(Arrays.toString(arr));
        
        // Sorting based on the string lenth
        Arrays.sort(arr, (first, second) ->{ return first.length() - second.length(); });
        out.println("After Sorting : ");
        out.println(Arrays.toString(arr));        
    }
}