public class exception2
{ 
    public static void main(String args[]) 
    { 
        try{ 
            int a[] = {1, 2, 3, 4, 5};
            a[6] = 9;
           }
        catch(ArrayIndexOutOfBoundsException e)
        { 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
        System.out.println("End of main().");

    } 
} 
