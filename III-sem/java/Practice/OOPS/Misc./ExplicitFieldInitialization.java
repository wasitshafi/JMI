// See actual example on c.horstman p.no 174
class Student
{
    int marks = 10; // in c++ is not allowed ,as in c++ we can initialize values only in constructors or in methods but not outside

    public void get()
    {
        System.out.println("Marks : " + marks);
    }
}
public class ExplicitFieldInitialization
{
    public static void main(String[] args)
    {
        Student s = new Student();

        s.get();
    }
}