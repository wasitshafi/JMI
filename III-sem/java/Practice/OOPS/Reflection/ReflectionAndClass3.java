import static java.lang.System.out;
import java.util.Scanner;

class Person
{
    private String name;

}

class Student extends Person
{
    private String Rollno;
}

public class ReflectionAndClass3
{
    public static void main(String... args)
    {
        Student std = new Student();
        
        Class c = Student.class;  // without using object
        out.println(c.getName());
    }
}