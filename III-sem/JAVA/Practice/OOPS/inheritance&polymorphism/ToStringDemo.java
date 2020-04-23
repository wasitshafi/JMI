import static java.lang.System.out;

class Student
{
    String name;
    public Student(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return getClass().getName() + " : " + name;
    }
}

public class ToStringDemo
{
    public static void main(String[] args)
    {
        Student s = new Student("Wasit");
        out.println(s);

        // Alternate Method

//      String details = s;     // error

        String details = "" + s;         // or String details = s.toString();
        System.out.println(details);
    }
}