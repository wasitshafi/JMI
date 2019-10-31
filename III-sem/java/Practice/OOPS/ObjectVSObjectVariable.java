/**
 * @author Wasit shafi
 * @since 01-11-19
 */
import java.util.*;
class Student
{
    private int id;
    private String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void get()
    {
        System.out.printf("ID : %d%nName : %s%n", id, name);
    }
}
public class ObjectVSObjectVariable
{
    public static void main(String[] args)
    {

        Student s1 = null; // object variable, we should set explicitly object variable to null in case it does not refer to any object.
 
        // 'Student s1' in java === 'Student* s1' in C++ 

        // Suppose we try to access method
        if(s1 != null) // 
            s1.get();

        s1 = new Student(54, "wasit shafi"); // new Student() return reference of object
        
        if(s1 != null)
            s1.get();
    }
}