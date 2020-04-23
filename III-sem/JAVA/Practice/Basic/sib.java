public class sib{
    static int s;
    // It does mattter where you define SIB, but its good practice to define it above constructor
    // CTM : We can access only non-static member of class from SIB
    int x;

    static
    {
        System.out.println("Value of s is [ Inside SIB ]: " + s);
        s = 10;
        //x = 10; // error as we can't access non-static member from SIB
    }
    sib()
    {
        System.out.println("Value of s is [ Inside Constructor ]: " + s);
    }
    public static void main(String []args)
    {
        System.out.println("Creating instance of sib...");
        sib obj1 = new sib();

        System.out.println("\n\nAgain creating instance of sib...");
        sib obj2 = new sib();

        System.out.println("\n\nOnec Again creating instance of sib...");
        sib obj3 = new sib();
    }
}