final class animal{
    public void msg1()
    {
        System.out.print("Hello from animal class");
    }
}
// CTM : a class is refered as final class if it has prefix 'final' keyword 
// As animal class is now final class so it can't be used in inheritance as a superclass
/*  //error
class tiger extends animal {
    public void msg2()
    {
        System.out.print("Hello from Tiger class");
    }
}
*/
public class finalClass
{
    public static void main(String []args)
    {
        animal objAnimal = new animal();
        objAnimal.msg1();
    }
}