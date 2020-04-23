class Student
{
    private String name;
    private int marks[];

    public Student(String name)
    {
        this.name = name;    // This refers to implicit parameter
        marks = new int[4];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
    }

    public String getName()
    {
        return name;
    }

    public int[] getMarks()
    {
        return marks;
        //return marks.clone(); // correct way. as in above we are object reference is returned, can modify instance field outside Method();
                                // a clone() creates an exact copy of object in new location
    }

    public void printDetails()
    {
        System.out.println("Name of Student : " + name);
        System.out.print("Marks of Student : ");
        for(int item : marks)
            System.out.print(item + " ");
        System.out.println();
    }
}
public class CloneReturnReferenceOfObject
{
    public static void main(String[] args)
    {
        Student s = new Student("Wasit Shafi");
        
        System.out.println("From Main:");
        String name = s.getName();
        int m[] = s.getMarks();

        System.out.println("Name of Student : " + name);
        System.out.print("Marks of Student : ");
        for(int item : m)
            System.out.print(item + " ");
        System.out.println();

        System.out.println("\nFrom Class Method : ");
        s.printDetails();


        name = "abc";
        m[0] = 11;
        m[1] = 22;
        m[2] = 33;
        m[3] = 44;

        System.out.println("\nFrom Main:");
        System.out.println("Name of Student : " + name);
        System.out.print("Marks of Student : ");
        for(int item : m)
            System.out.print(item + " ");
        System.out.println();

        System.out.println("\nFrom class Method : ");
        s.printDetails(); // here why the name is also not changing....? pending
    }
}