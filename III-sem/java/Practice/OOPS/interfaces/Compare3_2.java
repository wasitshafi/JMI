import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;

class Student implements Comparable<Student>
{
    static int nextId;
    private int id;
    private int marks;
    private String name;    
    static
    {
        nextId = 101;
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

    public int compareTo(Student s)
    {
        if(marks < s. marks) return -1;
        else if(marks > s.marks) return 1;
        else return 0;
        
        // or 
        //return Integer.compare(marks, s.marks);
    }
}
public class Compare3_2
{
    public static void main(String... args)
    {
        Student std[] = new Student[3];

        std[0] = new Student(86, "Wasit");
        std[1] = new Student(60, "Imran");
        std[2] = new Student(43, "Mustafa");
        
        out.println("Before Sorting : ");
        for(int i = 0 ; i < std.length ; i++)
            std[i].accessor();
        Arrays.sort(std);

        out.println("After Sorting : ");
        for(int i = 0 ; i < std.length ; i++)
            std[i].accessor();
    }
}