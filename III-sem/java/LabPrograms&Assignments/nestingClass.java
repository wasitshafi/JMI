//
//nestingClass.java
//
//program to implement nesting of class in java
//
class outermost
{
    int x;
    outermost()
    {
        x = 10;
        innermost  o = new innermost();
        o.print2();
    }
    public void print1()
    {
        System.out.println("Hello from outer function");
        System.out.println("x = " + x);
        //print3();// error from outer class we can't have access to inner class members
    }


    class innermost
    {
        int y;
        innermost()
        {
            y = 20;
        }
        public void print2()
        {
            System.out.println("Hello from innermost function");
            System.out.println("y = " + y);
            print1(); // outer class method
        }
        public void print3()
        {
            System.out.println("Hello world from print2");
        }
    }
}

public class nestingClass
{
    public static void main(String []args)
    {
        outermost obj = new outermost(); // only the outer most is accesible from outside regardless how much nesting of class is there.s      
    }
}