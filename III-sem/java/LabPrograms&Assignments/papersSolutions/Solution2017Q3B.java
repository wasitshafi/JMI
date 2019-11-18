import java.util.Scanner;
class StudentMarksOutOfBoundException extends Exception
{
    public StudentMarksOutOfBoundException(String msg)
    {
        super(msg);
    }
}

class Student
{
    int rollno, marks;
    String name;

    public void set()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        name = scan.nextLine();
        
        System.out.print("Enter Student rollno : ");
        rollno = scan.nextInt();
        
        System.out.print("Enter Student marks : ");
        
        int m = scan.nextInt();
        try
        {
            if(m > 100)
                throw new StudentMarksOutOfBoundException("Marks Out Of Bound");
            else
                marks = m;
        }
        catch(StudentMarksOutOfBoundException e)
        {
            marks = -1;
            System.out.println("ERROR MESSAGE : " + e.getMessage()); // printing error message;
        }
    }
    public void get()
    {
        System.out.printf("Name : %s %nRollno : %d %nMarks : %d.%n", name, rollno, marks);
    }
}

public class Solution2017Q3B
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.set();
        s.get();
    }
}