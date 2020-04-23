import packagename.*; // importing all class of package "packagename"

public class Solution2_2
{
    public static void main(String[] args)
    {
        Divisions d = new Divisions();
        Multiplications m = new Multiplications();

        System.out.println("div(20, 10) : " + d.div(20, 10));
        System.out.println("div(20.5, 10.2) : " + d.div(20.2f, 10.2f));
        
        System.out.println("mult(20, 10) : " + m.mult(20, 10));
        System.out.println("mult(20.5, 10.2) : " + m.mult(20.5f, 10.2f));
    }
}