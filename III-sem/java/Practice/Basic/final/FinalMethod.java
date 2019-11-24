class superClass
{
    final public void printmsg()
    {
        System.out.println("Hello world from superClass...");
    }
    public void printmsg(int x) // we can overload final method but no override
    {
        System.out.println("Value of x is : " + x);
    }
}

class subClass extends superClass
{
    /*public void printmsg() // we can't override it here becuse of final method
    {
        System.out.print("Hello world from subClass...");
    }
    */
}

public class FinalMethod
{
    public static void main(String []args)
    {
        subClass obj = new subClass();
        obj.printmsg();
        obj.printmsg(10);
    }
}