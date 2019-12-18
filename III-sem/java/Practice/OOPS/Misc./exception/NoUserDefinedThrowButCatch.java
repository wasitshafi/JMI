public class NoUserDefinedThrowButCatch
{
    public static void main(String[] args)
    {
        // java itself throws exception
        // we have created our own catch block in case any exception occured.
        // During the compile time it not be able to detect the exception here...as only checked exception can be detected during compile time.
        int x = 0;
        try{
            System.out.println("Inside Try Block.");
            x = 10 / 0; // CTM :when exception occured at a specific then remaining line within try block will not be executed
            System.out.println("End of Try Block."); // it will not be executed.
           }
        catch(Exception e) //Exception class is used to catch all types of Run Time exception like catch(...) in c++
        {
            System.out.println("Inside catch Block...");
            System.out.println("ERROR MESSAGE : " + e.getMessage()); // display error message
        }
        finally //No paranthesis()
        {
            System.out.println("Inside Final block...");
        }
        System.out.println("End of main."); // *It will be executed.
    }
}