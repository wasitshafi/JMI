import packagename.subpackagename.Additions;
import packagename.subpackagename.Subtractions;

public class Solution1
{
    public static void main(String[] args)
    {
        Additions a = new Additions();
        Subtractions s = new Subtractions();

        System.out.println("Sum(10, 20) : " + a.sum(10, 20));
        System.out.println("Sum(10.5, 20.2) : " + a.sum(10.5f, 20.2f));
        
        System.out.println("sub(10, 20) : " + s.sub(10, 20));
        System.out.println("sub(10.5, 20.2) : " + s.sub(10.5f, 20.2f));
    }
}