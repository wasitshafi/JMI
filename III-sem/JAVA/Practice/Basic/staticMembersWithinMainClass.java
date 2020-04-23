//
//staticMembersWithinMainClass.java
//
//program to call static members from  static function
//
public class staticMembersWithinMainClass
{
    public static int x;
    public static void prt(String s)
    {
        System.out.println("Message : " + s);
    }
    public static void main(String[] args)
    {
        // we can have access to function and variable x directly i.e. without using object of class because they both are static members
        System.out.println("\nx = " + x);
        x = 10;
        prt("hello wrold");
        System.out.print("x = " + x);
    }
}