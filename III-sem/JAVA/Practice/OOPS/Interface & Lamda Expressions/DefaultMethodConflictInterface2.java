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

    public void fun3()
    {
        I1.super.fun3(); // or we can also class Default method of I2 incase fun3() is returning some value we can write it as return 'I1.super.func3()'
    }
}

public class DefaultMethodConflictInterface2
{
    public static void main(String... args)
    {
        Test t = new Test();

        t.fun1();
        t.fun2();
    }
}