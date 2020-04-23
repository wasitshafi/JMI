import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources
{
    public static void main(String[] args) throws IOException
    {
        // Try with resource block now we don't need to worry to close the ojbects in finally block
        try(Scanner scan = new Scanner (new FileInputStream("./sample.txt"));)  // FileInputStream throws a checked exception 'IOException'
        {
            while(scan.hasNextLine()) System.out.println(scan.nextLine());
        }
        catch (Exception e)
        {
           System.out.println(e.getMessage());
        }
    }
}