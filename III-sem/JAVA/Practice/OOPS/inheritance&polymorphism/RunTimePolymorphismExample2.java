class Person
{
    public int x;
    Person()
    {
        x = 10;
    }
}
class Student extends Person
{
    int x;
    Student()
    {
        x = 20;
    }
}
class Employee extends Person
{
    int x;
    Employee()
    {
        x = 30;
    }
}

public class RunTimePolymorphismExample2
{
    public static void main(String[] args)
    {
        Person p;

        p = new Student();
        System.out.println("x = " + p.x);

        p = new Employee();
        System.out.println("x = " + p.x);
        // CTM : Runtime polymorphism can't be achieved by data members as because data fields are't overriden like methods.   
    }
}