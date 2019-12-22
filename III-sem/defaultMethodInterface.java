import static.java.lang.System.out;

class Person
{
    String name;
    Byte age;
    public Person(String name, Byte age)
    {
        this.name = name;
        this.age = age;
    }

    public void accessor()
    {
        out.println("Name : " + name + "\t Age : " + age);
    }
}
interface intr1
{
    default public void accessor()
    {
        out.println("This is default method of interface");
    }
}

class Student implements intr1{

    public void call()
    {
        accessor();
    }
}

public class Solution
{
    public static void main(String... args)
    {
        Student s = new Student();

        s.call();
    }
}