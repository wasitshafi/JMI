final class Animal
{
    public void msg1()
    {
        System.out.print("Hello from Animal class");
    }
}

// As animal class is now final class so it can't be used in inheritance as a superclass
/*
class Tiger extends Animal
{
    public void msg2()
    {
        System.out.print("Hello from Tiger class");
    }
}
*/

public class FinalClass
{
    public static void main(String []args)
    {
        Animal objAnimal = new Animal();
        objAnimal.msg1();
    }
}