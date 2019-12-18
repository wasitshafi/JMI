// refer k.horstman pg no : 167
class Student
{
    int id;
    String name;
    
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void get()
    {
        System.out.println("ID : " + id +"\t" + "Name : '" + name + "'");
    }
}

public class MythObjectCallByReference
{
    public static void inc(Student s)
    {
        s.id++; // it will increment the value as 's' also points to the same object to which 'a' is refering in case of first function call
    }
    public static void swap(Student s1, Student s2)
    {
        Student s = s1;
        s1 = s2;
        s2 = s;
        
        System.out.println("Inside Swap() : ");
        System.out.println("s1 : ID : " + s1.id +"\t" + "Name : '" + s1.name + "'");
        System.out.println("s2 : ID : " + s2.id +"\t" + "Name : '" + s2.name + "'");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Student a = new Student(101, "Alice");
        Student b = new Student(102, "Bob");

        // Before increment
        a.get();
        b.get();

        inc(a);
        inc(b);
        // After increment
        a.get();
        b.get();

        // as of now it seems that object are passed 'call by reference' but that is not the case checkout the below example

        swap(a, b);

        System.out.println("From main()");
        a.get();
        b.get();
    }
}