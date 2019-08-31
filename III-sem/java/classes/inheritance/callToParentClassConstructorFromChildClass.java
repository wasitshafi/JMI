//
//callToParentClassConstructorFromChildClass.java
//
//Program to demonstrate how to call super class constructors from sub class constructors
//
class parent
{
    parent()
    {
        System.out.println("Hello from parent class default constructor.");
    }

    parent(String msg)
    {
        System.out.println(msg);
    }
}

class child extends parent
{
    // CTM : its our choice from which constructor of child we want to invoke the parent class contructors( Both default/parameterized constructors ) by providing required args for parent class constructors
    child()
    {
        super(); // calling default constructor 
        System.out.print("Hello from child class default constructor.");        
    }

    child(String s)
    {
        super(s); // Calling parent class constructor must be the very first line otherwise there will be an error.
        System.out.print("Hello from child class parameterized constructor.");
    }
}

public class callToParentClassConstructorFromChildClass
{
    public static void main(String []args)
    {
        String msg = "Calling parent class contructor from child class parameterized constructor.";

        System.out.println();
        System.out.println();
        child c1 = new child();
        System.out.println();
        System.out.println();
        child c2 = new child(msg);
    }
}