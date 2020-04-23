// Refer : Cay S.Horstmann p.no : 71

public class CodePoint
{
    public static void main(String []args)
    { 
        String s = "𝕆ABCDF";   //https://www.compart.com/en/unicode/U+1D546

        System.out.println("String Length : " + s.length());// It will give string length 7 instead of 6 because '𝕆' requires two code point to represent that is why we should try to avoid s.charAt(i);
        System.out.println("String CodePointCount : " + s.codePointCount(0, s.length()));// this will show the true length of string
        
        System.out.println("String : " + s);

        System.out.print("String : ");
        for(int i = 0 ; i < s.length() ; i++)
            System.out.print(s.charAt(i));

        System.out.println("\n'" + s.charAt(0) + "'");
        System.out.println("\n'" + s.charAt(1) + "'");
        System.out.println("\n'" + s.charAt(2) + "'");
        System.out.println("\n'" + s.charAt(3) + "'");
        System.out.println("\n'" + s.charAt(4) + "'");
        System.out.println("\n'" + s.charAt(5) + "'");
        System.out.println("f...?");

        int codePointArray[] = s.codePoints().toArray();
        System.out.print("Code Point array : ");
        for(int i = 0 ; i < codePointArray.length ; i++) System.out.print(codePointArray[i] + " ");
    }
}