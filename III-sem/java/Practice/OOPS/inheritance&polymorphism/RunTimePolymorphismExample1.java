import java.util.Scanner;

class Person
{
    private String name;
    public void set()
    {
        System.out.print("Enter name... ");
        name = (new Scanner(System.in)).nextLine();
    }
    public void get()
    {
        System.out.println("Name : " + name);
    }
}

class Student extends Person
{
    private int rollno;
    public void set()
    {
        super.set();
        System.out.print("Enter student rollno... ");
        rollno = (new Scanner(System.in)).nextInt();
    }
    public void get()
    {
        super.get();
        System.out.println("Rollno : " + rollno);
    }
}

class Employee extends Person
{
    private int salary;
    public void set()
    {
        super.set();
        System.out.print("Enter Employee Salary... ");
        salary = (new Scanner(System.in)).nextInt();
    }
    public void get()
    {
        super.get();
        System.out.println("Rollno : " + salary);
    }
}

public class RunTimePolymorphismExample1
{
    public static void main(String[] args)
    {
        //CTM : In order to acheive run time polymorphism in c++ we have to use virtual function but in JAVA JVM automaticall refer by content not by type
        Person p; // parent class reference object
        p = new Student();
        p.set();
        p.get();

        p = new Employee();
        p.set();
        p.get();
    }
}