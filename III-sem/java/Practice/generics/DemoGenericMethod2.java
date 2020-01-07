import static java.lang.System.out;
import java.util.Scanner;

class SampleClass<T> 
{
	private T x;
	public SampleClass(T x)
	{
		this.x = x;
	}

	public <U, V> void show(U arg1, V arg2)
	{
		U y;
		V z;
		
		y = arg1;
		z = arg2;

		out.println("x : " + x);
		out.println("y : " + y);
		out.println("z : " + z);
	}
}

public class DemoGenericMethodGenericClass
{	
	public static void main(String []args)
	{
		SampleClass<Integer> i = new SampleClass(0);
		i.<Double , String>show(12.25, "Helo world");
	}
}