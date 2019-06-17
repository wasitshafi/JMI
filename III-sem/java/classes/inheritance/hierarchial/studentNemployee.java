import java.util.Scanner;
class person{
    private String name;
    private int age;
    public void setData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = scan.next();
        System.out.print("Enter age : ");
        age = scan.nextInt();
    }
    public void getData()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
class student extends person{
    private int rollno;
    private float marks;

    public void setData()
    {
        Scanner scan = new Scanner(System.in);
        
        super.setData();
        System.out.print("Enter rollno : ");
        rollno = scan.nextInt();
        System.out.print("Enter marks : ");
        marks = scan.nextFloat();
    }
    public void getData()
    {
        super.getData();
        System.out.println("Roll no = " + rollno);
        System.out.println("Marks = " + marks);
    }
}

class employee extends person{
    private int empId;
    private float salary;

    public void setData()
    {
        Scanner scan = new Scanner(System.in);
        
        super.setData();
        System.out.print("Enter employee ID : ");
        empId = scan.nextInt();
        System.out.print("Enter employee salary : ");
        salary = scan.nextFloat();
    }
    public void getData()
    {
        super.getData();
        System.out.println("Eployee ID = " + empId);
        System.out.println("Salary = " + salary);
    }
}

public class studentNemployee{
public static void main(String []args)
{
    student std = new student();
    employee emp = new employee();

    System.out.println("Enter Student details : ");
    std.setData();
    System.out.println("\nEnter Employee details : ");
    emp.setData();

    System.out.print("\n\nStudent details are as : ");
    std.getData();
    System.out.print("\nEmployee details are as : ");
    emp.getData();

}
}