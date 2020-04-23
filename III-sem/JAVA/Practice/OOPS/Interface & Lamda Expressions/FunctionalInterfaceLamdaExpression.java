import static java.lang.System.out;

// functional interface has only one abstract method and any number of default methods
@FunctionalInterface // option to write annotation
interface Cube // 
{
    int getCube(int x);
}

public class FunctionalInterfaceLamdaExpression
{
    public static void main(String... args)
    {
       Cube c = (int x) -> { return x * x * x; }; // lamda expression is instance of functional interface
              out.println(c.getCube(10));
    }
}