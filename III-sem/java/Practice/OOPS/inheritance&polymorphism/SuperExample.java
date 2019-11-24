// The super keyword in Java is a reference variable which is used to refer immediate parent class object.
// super can be used to refer immediate parent class instance variable, constructor or method
class Person
{
    private String name;
    public int age;
    Person(String name)
    {
        this.name = name;
    }

    public void get()
    {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
    }
}

class Student extends Person
{
    int marks;
    Student(String name, int age, int marks)
    {
        super(name);
        super.age = age;
        this.marks = marks;
    }

    public void get()
    {
        super.get();
        System.out.println("Marks : " + marks);
    }
}

public class SuperExample
{
    public static void main(String[] args)
    {
        Student s = new Student("Wasit Shafi", 23, 95);        
        s.get();    
    }
}