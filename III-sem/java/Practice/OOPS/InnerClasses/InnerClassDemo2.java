import static java.lang.System.out;

class OuterClass
{
    String str1;      // default modifier
    private int x;    // private modifier
    InnerClass obji = new InnerClass();

    OuterClass()
    {
        str1 = "OuterClass";
        x = 10;
    }

    public void methodOuter()
    {
        out.println("OuterClass Members :");
        out.println("Str1 : " + str1);
        out.println("Value of x : " + x);
//        out.println("y : " + y); // error (outer class can't access members of inner class directly)
    
        obji.y = 10; // because its visibility is public
        obji.str2 = "The quick brown fox jumps over to the lazy dog. Tit for tat.";
        out.println();
        out.println("InnerClass Members :");
        out.println("obji.str2 : " + obji.str2);
        out.println("obji.str2 : " + obji.y);
        obji.methodInner();
    }

    class InnerClass
    {
        private String str2; // default modifier
        public int y;        // public modifier

        public void methodInner()
        {
            out.println("Hello From Inner Class");
            out.println("x : " + x); // Inner class can access private members of outer class.//here outer class object reference is implicit by compiler
        }
    }
}
public class InnerClassDemo2
{
    public static void main(String... agrs)
    {
        OuterClass.InnerClass obji = new OuterClass().new InnerClass(); // creating innerclass object(CTM: InnerClass Can't exist of it own like : 'InnerClass obji = new InnerClass()' as it is hidded from outside world and is only visible Within Outer class)
        obji.methodInner();
        // obji.methodOuter(); // error we can't cll outerClass members

        // Alternate method

        
        OuterClass objo = new OuterClass();
        OuterClass.InnerClass obji2 = objo.new InnerClass();
        obji2.methodInner();

    }
}