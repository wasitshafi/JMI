import java.util.Scanner;

class person2{
    protected String name;
    protected int age;
}
class student2 extends person2{
    protected int id, rollno;
}
class result2 extends student2{
        private float mEnglish, mUrdu, mMaths, total;

        public void setData()
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter name  = ");
            name = scan.next();
            System.out.print("Enter age = ");
            age = scan.nextInt();

            System.out.print("Enter id = ");
            id = scan.nextInt();
            System.out.print("Enter rollno = ");
            rollno = scan.nextInt();    
            
            System.out.print("Enter marks in English = ");
            mEnglish = scan.nextFloat();
            System.out.print("Enter marks in Urdu = ");
            mUrdu = scan.nextFloat();
            System.out.print("Enter marks in Maths. = ");
            mMaths = scan.nextFloat();
            total = mEnglish + mUrdu + mMaths;
        }
        public void getData()
        {

            System.out.println("Name = " + name);
            System.out.println("Age = " + age);
    
            System.out.println("ID = " + id);
            System.out.println("Roll no = " + rollno);
    
            System.out.println("Marks in English, Urdu & Maths are as  = " + mEnglish + ", " + mUrdu + ", " + mMaths);
            System.out.println("Total marks = " + total);
            if(total >= 150)
               System.out.println("Remarks : PASS");
            else
                System.out.println("Remarks : Failed");
            }
    public static void main(String []args)
    {
        result2 std = new result2();

        std.setData();
        System.out.println("\n\nStudent details are as follows : ");
        
        std.getData();
    }
}