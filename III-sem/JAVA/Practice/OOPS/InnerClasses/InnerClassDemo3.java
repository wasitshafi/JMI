import static java.lang.System.out;

class OuterClass
{
    static String str1 = "Hello from OuterClass";
    static private int x = 10;

    public static void methodOuter()
    {
        out.println();
        out.println("OuterClass : ");
        out.println("str1 : " + str1);
        out.println("x : " + x);
    }
    // Just like in a class we can have static instance fields, static methods which is a class member similarly we can also have an static inner class which is also a class member of outer class
    static class InnerClass // since its static class now, so it can access only to static members just like incase of static methods
    {
        private String str2 = "Hello from InnerClass"; // default modifier
        public int y = 20;        // public modifier

        public void methodInner()
        {
            out.println("InnerClass : ");
            out.println("str2 : " + str2);
            out.println("y : " + y);
            methodOuter(); // just like static method can call other static methods
        }
    }
}

// Plz don't get confused in this program just CTM: here inner class is a static member of outer and as we know a static member can access to only other static members, so that is why i make instance field of outer clas as static so that static inner class will be able to access something
public class InnerClassDemo3
{
    public static void main(String... agrs)
    {       
        // Alternate method
        OuterClass.InnerClass obji2 = new OuterClass.InnerClass(); // now we don't need a object of inner class as its now an static class
        obji2.methodInner();
    }
}