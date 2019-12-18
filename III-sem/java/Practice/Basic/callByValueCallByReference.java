public class callByValueCallByReference{
    static void increment1(int x) // java uses call by value
    {
        x++;
    }

    static void increment2(Integer x)
    {
        x++;
    }

    public static void main(String[] args)
    {
        int x = 10;
        Integer y = 10;

        increment1(x);
        increment2(y);

        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
    }
}