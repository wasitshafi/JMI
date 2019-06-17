import java.util.Scanner;

class person1{
    private String name;
    private int age;
    public void setDataPerson()
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name  = ");
        name = scan.next();
        System.out.print("Enter age = ");
        age = scan.nextInt();
    }
    public void getDataPerson()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
class student1 extends person1{
    private int id, rollno;
    public void setDataStudent()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter id = ");
        id = scan.nextInt();
        System.out.print("Enter rollno = ");
        rollno = scan.nextInt();
    }
    public void getDataStudent()
    {
        System.out.println("ID = " + id);
        System.out.println("Roll no = " + rollno);
    }
}
class result1 extends student1{
        private float mEnglish, mUrdu, mMaths, total;

        public void setDataResult()
        {
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Enter marks in English = ");
            mEnglish = scan.nextFloat();
            System.out.print("Enter marks in Urdu = ");
            mUrdu = scan.nextFloat();
            System.out.print("Enter marks in Maths. = ");
            mMaths = scan.nextFloat();
            total = mEnglish + mUrdu + mMaths;
        }
        public void getDataResult()
        {
            System.out.println("Marks in English, Urdu & Maths are as  = " + mEnglish + ", " + mUrdu + ", " + mMaths);
            System.out.println("Total marks = " + total);
            if(total >= 150)
               System.out.println("Remarks : PASS");
            else
                System.out.println("Remarks : Failed");
        }
    public static void main(String []args)
    {
        result1 std = new result1();

        std.setDataPerson();
        std.setDataStudent();
        std.setDataResult();

        System.out.println("\n\nStudent details are as follows : ");
        std.getDataPerson();
        std.getDataStudent();
        std.getDataResult();
    }
}