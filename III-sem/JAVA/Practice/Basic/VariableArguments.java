//
//variableArguments.java
//
//program to implement variable agruments function in java
//
// Ref: p.no-> 141 E Balagurusamy 
public class VariableArguments
{
    public static void printString(String...s)
    {
        // printing using for each loop
        for(String i : s)
            System.out.print(i + " ");
    }

    public static void printInt(String m , int ... args)
    {
        System.out.print(m);
        for(int i : args)
            System.out.print(i + " ");
    }

    public static void main(String[] args)
    {
        String s1 = "The";
        String s2 = "quick";
        String s3 = "brown";
        String s4 = "fox.";
        String s5 = "jumph";
        String s6 = "over";
        String s7 = "to";
        String s8 = "the";
        String s9 = "lazy";
        String s10 = "dog.";
        
        System.out.print("Strings are as : ");
        printString(s1, s2, s3, s4, s5, s6, s7, s8,s9, s10);
        printInt("\nIntegers are as : ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
