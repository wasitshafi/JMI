class Student
{
    public static int nextId = 101;
    int id;
    String name;
    
    public Student()
    {
        id = nextId++;
        name = null;
    }

    public Student(String name)
    {
        id = nextId++;
        this.name = name;
    }

    public void accessor()
    {
        System.out.println("ID : " + id +"\t" + "Name : '" + name + "'");
    }

    public static void availableId()
    {
        System.out.println("Available NextId is : " + Student.nextId);
    }

}

public class StaticMethodField
{
    public static void main(String[] args)
    {
        System.out.println("Value of initial id is : " + Student.nextId);

        Student s[] = new Student[4];
        s[0] = new Student("Wasit");
        s[1] = new Student("Huzaifa");
        s[2] = new Student();
        Student.availableId();
        s[3] = new Student("Salfiya");
    
        for(int i = 0 ; i < s.length ; i++)
            s[i].accessor();
    }
}