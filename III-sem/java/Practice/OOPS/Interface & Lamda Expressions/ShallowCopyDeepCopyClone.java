import java.util.Scanner;

class Student
{
    public int id;   
    public Student(){}
    public Student(int id)
    {
        this.id = id;
    }
    public void get()
    {
        System.out.println("ID : " + id);
    }
}

class Employee implements Cloneable
{
    public int ssn;
    public Employee(int ssn)
    {
        this.ssn = ssn;
    }
    public Employee clone()
    {
        try
        {
            return (Employee)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
}
public class ShallowCopyDeepCopyClone
{
    public static void main(String... args)
    {
        Student s = new Student(45);
        Student s2 = s;     // ShallowCopy
        Student s3 = new Student();   // if we mutate s3 then s2 will also mutate as both of them refer to same object

        s3.id =  s2.id; // deep copy
        s2.id = 90;
        System.out.println(s.id); // 90 because of shallow copy

        Employee e = new Employee(10);
        Employee e2 = e.clone();

        e2.ssn = 20;
        System.out.println(e.ssn); // 10 because of clone(shallow+deeps)
    }
}