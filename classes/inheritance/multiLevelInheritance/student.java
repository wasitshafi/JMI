import java.util.Scanner;
class person{
    protected String name;   // now they also be accessed by sub class
    protected int age;
}

public class student2 extends person{
    protected int id;
    protected float marks;

    public void setData()
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = scan.next();
        System.out.print("Enter age : ");
        age = scan.nextInt();
        System.out.print("Enter id : ");
        id = scan.nextInt();
        System.out.print("Enter marks : ");
        marks = scan.nextFloat();
    }
    public void getData()
    {
        System.out.println("\n\nName = " + name);
        System.out.println("Age = " + age);
        System.out.println("ID = " + id);
        System.out.println("Marks = " + marks);
    }
    public static void main(String []args)
    {
        student2 std = new student2();

        std.setData();
        std.getData();
    }
}