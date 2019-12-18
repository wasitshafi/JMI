public class NoUserDefinedThrowNCatch
{
    public static void main(String[] args)
    {
        // java itself throws exception
        // java itself catches the exception

        System.out.println("Inside Main()");
        
        int x = 10 / 0; // compiler will not be able to detect this error during run time, as only checked exception can be detected during comiplation.
        System.out.println("End of main."); // *It will be executed.
    }
}