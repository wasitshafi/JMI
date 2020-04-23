import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferReaderDemo
{
    public static void main(String... args) throws Exception
    {
        int i;
        float f;
        double d;
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Integer Value : ");
        i = Integer.parseInt(br.readLine());

        System.out.print("Enter Float Value : ");
        f = Float.parseFloat(br.readLine());

        System.out.print("Enter Double Value : ");
        d = Double.parseDouble(br.readLine());

        System.out.print("Enter String Value : ");
        s = br.readLine();
        
        System.out.println("i     : " + i);
        System.out.println("f     : " + f);
        System.out.println("d     : " + d);
        System.out.println("s     : " + s);

        System.out.print("s     : ");
        for(int j = 0 ; j < s.length() ; j++) System.out.print(s.charAt(j));

        String words[] = s.split(" ");
        System.out.print("\nwords : ");
        for(int j = 0 ; j < words.length ; j++) System.out.print(words[j] + " ");
        br.close();
    }
}