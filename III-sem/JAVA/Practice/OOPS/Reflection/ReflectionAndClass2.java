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

public class ReflectionAndClass2
{
    public static void main(String... args)
    {
        Student std = new Student();
        try
        {
            Class c = Class.forName("Student"); // CTM : arg must be a class name/interface otherwise compiler will throw an error
            out.println(c.getName());
        }

        catch(Exception e){}

    }
}