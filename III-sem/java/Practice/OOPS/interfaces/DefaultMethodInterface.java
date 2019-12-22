import static java.lang.System.out;

// The primary advantage of default method is that suppose we have a interface that several class has
// already implemented now we want to introduce a method in that we can use default methods so that
// the class may or may not define the new function.

interface I1
{
    //By default method are public abstract
    //fields as public static final
   default void def(){  out.println("This is Default Function"); }
   public abstract void fun1();
}

class C1 implements I1
{
    public void fun1()
    {
        out.println("Hello from fun1()");
    }
    public void def(){
        out.println("This is Default Function class Implementation.");
    }
}

class C2 implements I1  // class may not define the default function
{
    public void fun1()
    {
        out.println("Hello from fun1()");
    }
}

public class DefaultMethodInterface
{
    public static void main(String... args)
    {
        I1 i;
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        
        i = obj1;
        i.fun1();
        i.def();
        out.println();
        i = obj2;
        i.fun1();
        i.def();
    }
}