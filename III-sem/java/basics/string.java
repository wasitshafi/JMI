//
//string.java
//
//program to show basic build in methods of String datatype
//
import java.util.Scanner;
public class string
{
    public static void main(String a[])
    {
        String str = "The quick brown fox jumps over to the lazy dog.Tit for tat.";
        String subStr, str2;;
        Scanner s = new Scanner(System.in);

        System.out.println("Str  : " + str);
        System.out.println("lenght : " + str.length());
        System.out.println("String in uppercase : " + str.toUpperCase());
        System.out.println("String in lowercase : " + str.toLowerCase());
        
        System.out.print("\n\nEnter substring to be searched : ");
        subStr = s.nextLine();
        int index = str.indexOf(subStr);
        if(index >= 0)
            System.out.println("subString found at index " + index);
        else
            System.out.println("subString not found...");
        
        System.out.print("\n\nEnter string to be appended with main string: ");
        str2 = s.nextLine();

        str = str.concat(str2);
        System.out.println("\n\nString is as : "  + str);
    }
}