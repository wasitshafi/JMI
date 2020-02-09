/**
    @author wasitshafi
    @since  09-02-2020
*/
class Test<T>
{
    T arg1, arg2;
    Test(T arg1, T arg2)
    {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    public void get()
    {
        System.out.println("arg1 : " + arg1 + "\narg2 : " + arg2);
    }
    public void swap()
    {
        T temp = arg1;
        arg1 = arg2;
        arg2 = temp;
    }
}
public class Solution2017Q3C
{
    public static void main(String[] args)
    {
        Test<Integer> i = new Test<>(10, 20);
        Test<Float> f = new Test<>(22.12f, 33.3f);
        Test<String> s = new Test<>("Hello", "World");
        
        System.out.println("Integer :");
        System.out.println("Before Swapping :");
        i.get();
        i.swap();
        System.out.println("After Swapping  :");
        i.get();
     
        System.out.println();
        System.out.println("Float   :");
        System.out.println("Before Swapping :");
        f.get();
        f.swap();
        System.out.println("After Swapping  :");
        f.get();

        System.out.println();
        System.out.println("String  :");
        System.out.println("Before Swapping :");
        s.get();
        s.swap();
        System.out.println("After Swapping  :");
        s.get();
    }
}