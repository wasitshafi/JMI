import static java.lang.System.out;
import java.util.Scanner;

class SampleClass
{
	public<T> void show(T x) // generic method not inside generic class
 	{
		out.println("x : " +  x);
	}
}

public class DemoGenericMethodNonGenericClass
{
	public static void main(String []args)
	{
		SampleClass s = new SampleClass();
		s.<String>show("Strings");

		SampleClass i = new SampleClass();
		i.show(20); // it can infer typevariabl, if we don't mention it.
	}
}