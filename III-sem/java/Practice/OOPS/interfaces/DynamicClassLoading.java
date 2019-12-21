
// error
import static java.lang.System.out;
import java.util.Scanner;

class Student
{
    String name;
    
    public Student()
    {
    }
    public void mutator()
    {
        out.print("Student Name...");
        name = (new Scanner(System.in)).nextLine();
    }
    public void accessor()
    {
        out.println("Name : " + name);
    }
}
class DynamicClassLoading
{
    public static void main(String... arg)
    {
        Student std = new Student();

        std.mutator();
        std.accessor();

        // Method 1
        try
        {
            String className = "Student";
        //  Object s3 = Class.forName(className).newInstance();    
            Object s3 = std.getClass().newInstance();    
           s3.mutator();
           s3.accessor();
        }
        catch(Exception e){}


    }
}