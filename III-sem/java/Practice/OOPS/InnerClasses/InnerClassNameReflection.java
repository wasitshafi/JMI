import static java.lang.System.out;

class OuterClass
{
    InnerClass i = new InnerClass();
    public void get()
    {
        InnerClass i2 = new InnerClass();
        out.println("InnerClass Name(objo) : " + getClass().getName()); // here objo is implicit parameter
        out.println("InnerClass Name(i)    : " + i.getClass().getName());
        out.println("InnerClass Name(i2)   : " + i2.getClass().getName());
    }
    class InnerClass
    {
        public void get()
        {
            out.println("InnerClass Name(obji) : " + getClass().getName());
        }
    }
}

public class InnerClassNameReflection
{
    public static void main(String []args)
    {
        OuterClass objo = new OuterClass();
        OuterClass.InnerClass obji = objo.new InnerClass();
        
        out.println("OuterClass Name(objo) : " + objo.getClass().getName()); // Output : "OuterClass"
        out.println("InnerClass Name(obji) : " + obji.getClass().getName()); // Output : "OuterClass$InnerClass"
        out.println();
        objo.get();
        out.println();
        obji.get();
    }
}