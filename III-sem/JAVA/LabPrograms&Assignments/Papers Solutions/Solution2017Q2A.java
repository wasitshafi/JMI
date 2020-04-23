/**
    @author wasitshafi
    @since  09-02-2020
*/
import java.util.Scanner;
import static java.lang.System.out;

class Person
{
    protected String name;
    protected int age;
    
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void get()
    {
        out.println("Name   : " + name + "\nAge    : " + age);
    }
}

class Student extends Person
{
    private String course;
    private int rollno;
    public Student(String name, int age, String course, int rollno)
    {
        super(name, age);               // calling super class constructor
        this.course = course;
        this.rollno = rollno;
    }
    public void get()
    {
        super.get();                    // calling super class method
        out.println("Course : " + course + "\nRollno : " + rollno);        
    }
}
public class Solution2017Q2A
{
    public static void main(String... args)
    {
        String name, course;
        int age, rollno;
        Scanner scan = new Scanner(System.in);
        
        out.print("Enter Name   : ");
        name = scan.nextLine();
        out.print("Enter Age    : ");
        age = scan.nextInt();
        out.print("Enter Course : ");
        course = scan.next();
        out.print("Enter Rollno : ");
        rollno = scan.nextInt();

        Student s = new Student(name, age, course, rollno);
        out.println("\nStudent Details");
        s.get();
        scan.close();
    }
}