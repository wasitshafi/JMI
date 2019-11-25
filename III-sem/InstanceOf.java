// instanceof operator is also know as type comparison operator
class Person
{
    String name;
    Person(String name)
    {
        this.name = name;
    }
}
public class InstanceOf
{
    public static void main(String[] args)
    {
        Integer i = 10;
        Double d = null;
        Person p = new Person("Wasit shafi");

        if( i instanceof Integer)
            System.out.println("i instanceof Integer : Yes.");
        else
            System.out.println("i instanceof Integer : No.");
        
        // If we apply the instanceof operator with any variable that has null value, it returns false
        if( d instanceof Double)
            System.out.println("d instanceof Double : Yes.");
        else
            System.out.println("d instanceof Double : No.");
        
        if( p instanceof Person)
            System.out.println("p instanceof Person : Yes.");
        else
            System.out.println("p instanceof Person : No.");
    }
}