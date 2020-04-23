public class OverloadingMain
{
    public static void main()
    {
        System.out.println("Inside main()");
        System.out.println("End of main()");        
    }

    public static void main(int x)
    {
        System.out.println("Inside main(int x)");
        System.out.println("Value of x : " + x);
        main();
        System.out.println("End of main(int x)");
        
    }

    public static void main(String[] args) // It will always run first by JVM
    {
        System.out.println("Inside main(String[] args)");
        main(10);
        System.out.println("End of main(String[] args)");
    }
}