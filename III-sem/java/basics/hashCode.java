//Note : hash code is not actual memory address. For more info read : https://stackoverflow.com/questions/3563847/what-is-the-use-of-hashcode-in-java
class test{
    private int x;
    test(int x)
    {
        this.x = x;
    }
    public void show()
    {
        System.out.println("Value of x is : " + x);
    }
}
public class hashCode{

    public static void main(String []args)
    {
        String str1 = new String("Hello");
        String str2 = new String("Hello"); //Printing their hashcode will point to the concept "String is Immutable in java"
        String str3 = new String("World");

        System.out.println( "\nStr1 = " + str1);
        System.out.println( "Str2 = " + str2);
        System.out.println( "Str3 = " + str3);

        System.out.println( "\nStr1 Hash Code is = " + str1.hashCode());
        System.out.println( "Str2 Hash Code is = " + str2.hashCode());
        System.out.println( "Str3 Hash Code is = " + str3.hashCode());

        test t1 = new test(11);
        test t2 = new test(22);
        test t3 = t2;

        t1.show();
        t2.show();
        t3.show();
        
        System.out.println("\nHash code of t1 is : " + t1.hashCode()); // NOTE :All class in java extends to object class consisting of several methods.
        System.out.println("Hash code of t2 is : " + t2.hashCode());
        System.out.println("Hash code of t3 is : " + t3.hashCode());
    }
}