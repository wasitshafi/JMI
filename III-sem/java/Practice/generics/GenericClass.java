import java.io.PrintStream;
import java.util.ArrayList;

//CTM : generics is like templates in c++  where we have to mention keyword "Template" where as in java we don't have to mention anything.
class Pair<T> // here 'T' is type variable 
{
	private T x, y;
	public Pair(T x, T y)
	{
		this.x = x;
		this.y = y;
	}
	public void accessor()
	{
		PrintStream p = new PrintStream(System.out);
		p.printf("X : %d %nY : %d", x, y);
		p.close();
	}
}

public class GenericClass
{
	public static void main(String... args)
	{
		Pair<Integer> i = new Pair<>(10, 20); // here 'Integer' is type parameter
		i.accessor();
	}
}
