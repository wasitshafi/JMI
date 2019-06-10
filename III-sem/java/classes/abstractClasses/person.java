abstract class person{
    int age;
    String name;
    public abstract void getdata();
    public abstract void putdata();
}
class student extends person{
    int id, marks1, marks2;
    String subject1, subject2;
    public void getdata()
    {
        Scanner scan = new Scanner();

        System.out.print("Enter age : ");
        age = scan.nextInt;
        System.out.print("Enter name : ");
        name = scan.next;
       /* System.out.print("Enter student id : ");
        id= scan.nextInt;
        System.out.print("Enter subject1 : ");
        subject1 = scan.next;
        System.out.print("Enter subject2 : ");
        subject2 = scan.next;
        System.out.print("Enter marks obtained in "  + subject1 + " : ");
        marks1 = scan.next;
        System.out.print("Enter marks obtained in "  + subject1 + " : ");
        marks2 = scan.next;
        */
    }
    public void putdata()
    {
        System.out.print("Name : " + name);
        System.out.print("Age  : " + age);
    }
    public void pprint()
    {
        System.out.print("hello world...!");
        
    }
}