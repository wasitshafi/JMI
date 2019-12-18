class Student
{
    int id;
    String name;
    
    public Student()
    {
        id = 0;
        name = null;
    }
    
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Student(int id) // if the first line of the construcor call the other constructor then the second constructor is called...
    {
 //       id = 2014;
        this(id, "Std#" + id);

        System.out.println/\("Hellow World");
    }

    public void get()
    {
        System.out.println("Id : " + id + "\tName : " + name);
    }
}

public class ConstructorCallingAnotherConstructor
{
    public static void main(String[] args)
    {
        Student s1 = new Student(101, "Wasit");
        Student s2 = new Student(102);

        s1.get();
        s2.get();
    }
}