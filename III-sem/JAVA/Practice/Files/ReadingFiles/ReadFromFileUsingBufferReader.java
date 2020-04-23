// Refer: https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadFromFileUsingBufferReader
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("/home/wasit/Desktop/III-sem/java/Practice/Files/ReadingFiles/sampleText.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String fileText  = "";
        String line = "";
        while((line = br.readLine()) != null)
            fileText = fileText + line + "\n";

        System.out.println(fileText);
        br.close();
    }
}