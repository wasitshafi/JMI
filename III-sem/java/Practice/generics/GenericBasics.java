import static java.lang.System.out;

class Pair<T> // here  "T" is a type variable
{
    T first;
    T second;
    
    Pair(T first, T second)
    {
        this.first = first;
        this.second = second;
    }
    public void get()
    {
        out.println("first  : " + first);
        out.println("second : " + second);
    }
}
public class GenericBasics
{
    public static void main(String... args)
    {
        Pair<String> obj = new Pair("Wasit", "Shafi"); // here "string" is type parameter
        obj.get();
    }
}