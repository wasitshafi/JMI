/**
    @author wasitshafi
    @since  11-02-2020
 */
class InvalidAge extends Exception
{
    InvalidAge(String msg)
    {
        super(msg);
    }
    /*public String toString()
    {
        return "Invalid Age.";
    }*/
}

public class UserDefinedExceptions
{
    public static void main(String... args)
    {
        int age;
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("Enter age... ");
        age = scan.nextInt();
        try
        {
            if(age < 18)  throw new InvalidAge("Age can't be < 18");
            System.out.println("Age : " + age);
        }
        catch(InvalidAge e)
        {
            System.out.println(e.getMessage());
            //System.out.println(e); // we can also override toString Method()
        }
    }
}