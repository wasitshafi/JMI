// here we have actual provided a constrain on the item that is going to be inseted in Object array, 
class Test<T>
{
    private Object arr[];
    public Test(int size)
    {
        arr = new Object[size];
    }
    public T get(int index)
    {
        return (T) arr[index];
    }

    public void set(int index, T element)
    {
        arr[index] = element;
    }
}
public class GenericArrayAlternate
{
    public static void main(String... args)
    {
        Test <Integer> o = new Test(5);
        Test <String>  o2 = new Test(5);
        Test <Float> o3 = new Test(5);

        for(int i = 0 ; i < 5; i++)
            o.set(i, i + 1);

        o2.set(0, "The"); 
        o2.set(1, "Quick");
        o2.set(2, "Brown");  // if we try other than string arg. it will show error
        o2.set(3, "fox");
        o2.set(4, "jumps");


        o3.set(0, 1.11f);
        o3.set(1, 2.22f);
        o3.set(2, 3.33f);
        o3.set(3, 4.44f);
        o3.set(4, 5.55f);

        System.out.print("Integer Array elements are as : ");
        for(int i = 0 ; i < 5 ; i++) System.out.print(o.get(i) + " ");

        System.out.print("\nString Array elements are as  : ");
        for(int i = 0 ; i < 5 ; i++) System.out.print(o2.get(i) + " ");

        System.out.print("\nDouble Array elements are as  : ");
        for(int i = 0 ; i < 5 ; i++) System.out.print(o3.get(i) + " ");
    }
}