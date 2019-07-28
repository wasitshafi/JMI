import java.util.Scanner;

class student{
    private String name;
    private byte age;
    {
        System.out.println("QUick brown fox");
    }
    student(){
        System.out.println("Hello world from java...!");
    }
    student(String name, byte age)
    {
        this.name = name;
        this.age = age;
    }
    student(student obj) // copy constructor
    {
        name = obj.name;
        age = obj.age;
    }
    public void getData()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        name = scan.nextLine();

        System.out.print("Enter age : ");
        age = scan.nextByte();
    }
    
    public void show()
    {
        System.out.println("Name = " + name + "\tAge = " + age);
    }
}

public class basic1{ 
     public static void main(String []args)
    {
        student s1 = new student(); // here 'student() is the default constructor of the class'
        s1.getData();
        student s2 = new student (s1); // using copy constructor

        student s3 = new student("Wasit Shafi", (byte)25); // Using Parameterized constructor
        student s4 = s3; // new object will not be created...how the memory is allocated..???Does s4 refers s3 ???

        s1.show();
        s2.show();
        s3.show();
        s4.show();
     }
}