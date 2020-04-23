import java.util.Scanner;

class Student{
    public String name;
    public byte age;
    {
        System.out.println("QUick brown fox");
    }
    Student(){
        System.out.println("Hello world from java...!");
    }
    Student(String name, byte age)
    {
        this.name = name;
        this.age = age;
    }
    Student(Student obj) // copy constructor
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
       scan.close();
    }
    
    public void show()
    {
        System.out.println("Name = " + name + "\tAge = " + age);
    }
}

public class ObjectDeclaration{ 
     public static void main(String []args)
    {
        Student s1 = new Student(); // here 'student() is the default constructor of the class'
        s1.getData();
        Student s2 = new Student (s1); // using copy constructor.

        Student s3 = new Student("Wasit Shafi", (byte)25); // Using Parameterized constructor.
        Student s4 = s3; // new object will not be created... in c++ Student *s4 = s3; s4 takes reference from s3 now both point to same object on memory.
        

        System.out.print("S1.show() : ");
        s1.show();
        System.out.print("S2.show() : ");
        s2.show();
        System.out.print("S3.show() : ");
        s3.show();
        System.out.print("S4.show() : ");
        s4.show();


        s4.name = "Abc";
        s4.age = 63;
        System.out.println();
        System.out.println("After Modifying S4");
        System.out.print("S4.show()");
        s4.show();
        System.out.print("S3.show()"); // s3 will also change because of reference 
        s3.show();
     }
}