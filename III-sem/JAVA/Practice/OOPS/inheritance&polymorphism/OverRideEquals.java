import static java.lang.System.*;

// CTM : equals() and hashCode() must be compiatble to each other.(Equal object must have same hashcode)
class Person
{
    private int aadhaarNo;
    private String name;    

    public Person(int aadhaarNo, String name)
    {
        this.aadhaarNo = aadhaarNo;
        this.name = name; 
    }

    public boolean equals(Person p)
    {
        return aadhaarNo == p.aadhaarNo;
    }
    // As we compare the objects on the basis of their aadhaarNo so we should also overload hashCode() i.e. it should not use the cosmic super class defined... for more info refer : Cay Horstman p no: 237
    public int hashCode()
    {
        return aadhaarNo;
    }
}

public class OverRideEquals
{
    public static void main(String[] args)
    {
        Person p1 = new Person(123, "Wasit");
        Person p2 = new Person(123, "Huzaif");
        Person p3 = new Person(1234, "Huzaif");

        if(p1.equals(p2))           // we override the equal method to make comparison on the basis of person's adhaar no
            out.println("p1.equals(p2) : True");
        else
            out.println("p1.equals(p2) : False");
        out.println("p1.hashCode : " + p1.hashCode());
        out.println("p2.hashCode : " + p2.hashCode());
        
        System.out.println();
        if(p2.equals(p3))
            out.println("p2.equals(p3) : True");
        else
            out.println("p2.equals(p3) : False");
        out.println("p2.hashCode : " + p2.hashCode());
        out.println("p3.hashCode : " + p3.hashCode());
    }
}