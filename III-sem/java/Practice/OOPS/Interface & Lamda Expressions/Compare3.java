import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;

// we can also implement this with TreeSet class, so that objects will automatically be sorted once they are added refer : hosrtman, pg no : 491 
class Student implements Comparable
{
    static int nextId;
    private int id;
    private int marks;
    private String name;    
    static
    {
        nextId = 100;
    }
    {
        nextId++;
    }
    public Student(int marks, String name)
    {
        id = nextId;
        this.marks = marks;
        this.name = name;
    }

    public void accessor()
    {
        out.printf("%4d\t%4d\t%s%n", id, marks, name);
    }

    public int compareTo(Object s)
    {
        // now first we need to type cast the 's' to Student object
        Student otherStudent = (Student)s;

        if(marks < otherStudent.marks) return -1;
        else if(marks > otherStudent.marks) return 1;
        else return 0;
        
        // or 
        //return Integer.compare(marks, s.marks);
    }
}
public class Compare3
{
    public static void main(String... args)
    {
        Student std[] = new Student[3];

        std[0] = new Student(86, "Wasit");
        std[1] = new Student(60, "Imran");
        std[2] = new Student(43, "Mustafa");
        
        out.println("Before Sorting : ");
        for(Student s : std)
            s.accessor();
            
        Arrays.sort(std);

        out.println();
        out.println("After Sorting : ");
        for(Student s : std)
            s.accessor();
    }
}