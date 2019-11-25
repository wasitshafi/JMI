import java.util.Scanner;

// We can't create object of abstract class.Only abstract class have abstract methods for which we have to define its body in sub-class.
// abstract class may contain abstract or concrete methods.
abstract class Person // abstract class
{
    protected int age;
    protected String name;
    public abstract void set();
    public abstract void get(); 
}

class Student extends Person
{
    int rollno;
    public void set()
    {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter name : ");
        name = scan.nextLine();
        System.out.print("Enter student rollno : ");
        rollno = scan.nextInt();
        System.out.print("Enter age  : ");
        age = scan.nextInt();
        scan.close();
    }

    public void get()
    {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);     
        System.out.println("Rollno : " + rollno);
    }
}

public class AbstractExample
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.set();
        s.get();
    }
}