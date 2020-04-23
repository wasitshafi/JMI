import java.util.Scanner;
import java.io.File;
public class ReadFromFileUsingScanner
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("/home/wasit/Desktop/III-sem/java/Practice/Files/ReadingFiles/sampleText.txt");
        Scanner scan = new Scanner(f);            
        String fileText  = "";

        while(scan.hasNextLine())
            fileText = fileText + scan.nextLine() + "\n";

        System.out.println(fileText);
        scan.close();   
    }
}