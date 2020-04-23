/**
    @author wasitshafi
    @since 28-12-2019
 */
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

public class ReflectionAndClass
{
    public static void main(String... args)
    {
        Student std = new Student();
        Class c = std.getClass(); // getClass() return the reference of Class object. CTM: Every class in java is inherited from Comsic Super Class(Object)
        Scanner scan = new Scanner(System.in);

        out.println(std.getClass().getName());
        out.println(scan.getClass().getName()); // CTM : if Class is in a package then package name is also a part of class Name returned by getClass()
        out.println(c.getName()); // using Class object
        out.println();

        out.println(std.getClass().getSuperclass().getName());
        
        out.println(scan.getClass().getSuperclass().getName());
        out.println(std.getClass().getSuperclass().getName()); 
        // or
        c = c.getSuperclass();
        out.println(c.getName());
        out.println();

        // To get only class name even if class is in Package use 
        out.println(scan.getClass().getSimpleName());

        // CTM : There are 3 ways of accessing class:
        // 1) The above
        // 2) using dynamic loading (Class c = Class.forName(NAMEOfClassInterface))
        // 3) Object.Class like Class c =  Employee.Class
    }
}