public class iib{
    int x; 
    static int s;
    iib()
    {
        System.out.println("Value of x is [ Inside Constructor ]: " + x);
        System.out.println("Value of s is [ Inside Constructor ]: " + s);
        x = 20;
        s = 20;
    }
    public void PrintXY()
    {
        System.out.println("Value of x is [ Inside PrintXY ]: " + x);
        System.out.println("Value of s is [ Inside PrintXY ]: " + s);
 
    }
    // It does mattter where you define IIB, but its good practice to define it above constructor
    // CTM : We can access both non-static member of class from IIB unlike SIB(Static Initialization Block)
    {
        System.out.println("Value of x is [ Inside IIB ]: " + x);
        System.out.println("Value of s is [ Inside IIB ]: " + s);
        x = 10;
        s = 10;
    }
    public static void main(String []args)
    {
         System.out.println("Creating instance of iib...");
        iib obj1 = new iib();
        obj1.PrintXY();

        System.out.println("\n\nAgain creating instance of iib...");
        iib obj2 = new iib();
        obj2.PrintXY();
    }
}