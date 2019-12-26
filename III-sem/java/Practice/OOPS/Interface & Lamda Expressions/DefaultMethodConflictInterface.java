import static java.lang.System.out;
//Q :   Can a java class implement Two interfaces with same methods having the same signature but different return types??
//Sol : No, its an error but in case of default methods if the programmer does't handle ( ClassName.Super.FunctionName() ) that then there will also be error

interface I1
{
    public abstract void fun1();
    default void fun3(){ out.println("Default method of I1.");};
}

interface I2
{
    void fun2();
    default void fun3(){ out.println("Default method of I2.");};

}

class Test implements I1, I2
{
    public void fun1()
    {
        out.println("Inside fun1() : class : Test1");
    }
  
    public void fun2()
    {
        out.println("Inside fun2() : class Test1");
    }

    @Override
    public void fun3(){ out.println("Override Default method in class"); };
}

public class DefaultMethodConflictInterface
{
    public static void main(String... args)
    {
        Test t = new Test();

        t.fun1();
        t.fun2();
        t.fun3();
    }
}