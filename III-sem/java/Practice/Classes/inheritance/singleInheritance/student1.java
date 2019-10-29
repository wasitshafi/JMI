import java.util.Scanner;
class person{
    private String name;  // as they are now private so they can be accessed only within class(By member functions)
    private int age;

    public void setDataPerson()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = scan.next();

        System.out.print("Enter age : ");
        age = scan.nextInt();
    }
    public void getDataPerson()
    {
        System.out.println("\n\nName = " + name);
        System.out.println("Age = " + age);
    }
}

public class student1 extends person{
    private int id;
    private float marks;

    public void setDataStudent()
    {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter id : ");
        id = scan.nextInt();

        System.out.print("Enter marks : ");
        marks = scan.nextFloat();
    }
    public void getDataStudent()
    {   // The below 2 line will raise an error as name & age has private access modifier inorder to access that the modifiers should be either protected or public 
        // System.out.println("Name = " + name);
        // System.out.println("Age = " + age);

        System.out.println("ID = " + id);
        System.out.println("Marks = " + marks);
    }
    public static void main(String []args)
    {
        student1 std = new student1();

        std.setDataPerson();
        std.setDataStudent();

        std.getDataPerson();
        std.getDataStudent();
    }
}