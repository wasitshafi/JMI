import static java.lang.System.out;
public class String2
{
    public static void main(String []args)
    {
        // "String is Immutable" What does it actuall means...?
        // Simply it refer that after declaring any string we can't change that like in c/c++ we can easily change any charcter of string class object by traversing.
        // They are treated like constant 1,2,3,4 ex int x = 100; String = "100" as we can't change 100  
        // EX:
        
        /*        
        String str1 = "I will not use 'Hello, World!'";

        System.out.print("Str1 : ");
        for(int i = 0 ; i < str1.length() ; i++) System.out.print(str1.charAt(i)); // printing string 

        C++ ref. in c/c++ we can change any character while traversing ex :
        for(int i = 0 ; i < str1len ; i++) 
          str1[i] = "h";                    // this is not possible in java
        */

        // use equal() method to compare contents of any two string instead of == operator
        String str2 = "Hello";
        String str3 = "Hello";
        String str4 = "HeLlO";
        String str5 = "Hello Word";
    
        // CTM  : equal() returns true is the content are identical where as == return true if the strings are store on the same location.
        // NOTE : If string are in the same location, they must be equal.But it is entirely possible to store multiple copies of identical string in different places
        
        out.println("str2 : '" + str2 + "'");
        out.println("str3 : '" + str3 + "'");
        out.println("str4 : '" + str4 + "'");
        out.println("str5 : '" + str5 + "'");        
        out.println("str5.substring(0, 5) : '" + str5.substring(0, 5) + "'");
        out.println();

        if(str2 == str3) // base on location
            out.println("str2 == str3 : true");
        else
            out.println("str2 == str3 : false");

        if(str2.equals(str3)) // based on content
            out.println("str2.equals(str3) : true");
        else
            out.println("str2.equals(str3) : false");
        
        if(str2.compareTo(str3) == 0) // based on content for lexico-graphic comparision return value less than 0 if calling string object is less than argument string, returns 0 if both strings are same, returns greater than 0 if calling string object is greater than argument string object            System.out.println("str2.compareTo(str3 : true");
            out.println("str2.compareTo(str3) = 0[Means they are same by string content]");    
        else 
            out.println("str2.compareTo(str3) != 0[Means they are not same by string content]");

        if(str3.equalsIgnoreCase(str4.substring(0,5))) // based on content
            out.println("str3.equalsIgnoreCase(str4.substring(0,5) : true");
        else
            out.println("str3.equalsIgnoreCase(str4.substring(0,5) : false");

        if(str3 == str5.substring(0,5))
            out.println("str3 == str5.substring(0,5) : true");
        else
            out.println("str3 == str5.substring(0,5) : false");
            
        if(str3.equals(str5.substring(0,5)))
            out.println("str3.equals(str5.substring(0,5)) : true");
        else
            out.println("str3.equals(str5.substring(0,5)) : false");

    }
}