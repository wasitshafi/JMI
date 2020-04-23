class Person
{
    private String name;
    private int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void get()
    {
        System.out.printf("Name : %s %nAge  : %d%n", name, age);
    }
}

class Student extends Person // its "IS-A" example as "student is a person"
{
    int rollno;
    Student(String name, int age, int rollno)
    {
        super(name, age);
        this.rollno = rollno;
    }
    @Override
    public void get()
    {
        super.get();
        System.out.printf("Roll no : %d", rollno);
    }
}

public class ISAExample
{
    public static void main(String []args)
    {
        Student s = new Student("Wasit Shafi", 23, 54);
        s.get();
    }
}