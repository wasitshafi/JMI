class superClass{
    final public void printmsg()
    {
        System.out.print("Hello world from superClass...");
    }
    public void printmsg(int x) // we can overload final method
    {
    }
}                                     // CTM : we can overload final method but not override it;
class subClass extends superClass{
    /*public void printmsg() // we can;t override it here becuse of final method
    {
        System.out.print("Hello world from subClass...");
    }
    */
}

class finalMethod{
    public static void main(String []args)
    {
        subClass obj = new subClass();
        obj.printmsg();
    }
}