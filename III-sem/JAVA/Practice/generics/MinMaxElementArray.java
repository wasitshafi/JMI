import static java.lang.System.out;
import java.util.Scanner;

class Pair<T>
{
	private T first;
	private T second;

	public Pair(T first, T second)
	{
		this.first = first;
		this.second = second;
	}
	public T getFirst()
	{
		return first;
	}
	public T getSecond()
	{
		return second;
	}
	public void setFirst(T f)
	{
		first = f;
	}
	public void setSecond(T s)
	{
		second = s;
	}
}

class MinMax
{
	public static Pair getMinMax(String arr[]) // static function , so that i can use it without object
	{
		String max, min;

		min = arr[0];
		max = arr[0];
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i].compareTo(min) < 0) min = arr[i];
			if(arr[i].compareTo(max) > 0) max = arr[i];
		}
		return new Pair<String>(min, max);
	}
}

public class MinMaxElementArray
{
	public static void main(String... args)
	{

		int n;
		String arr[];
		Scanner scan = new Scanner(System.in);

		out.print("No. of Words...");
		n = scan.nextInt();
		arr = new String[n];

		for(int i = 0 ; i < n ; i++)
		{
			out.print( (i + 1) + " <<: ");
			arr[i] = scan.next();
		}
		
		Pair p = MinMax.getMinMax(arr); // generic method();
		out.println("Min : " + p.getFirst());
		out.println("Max : " + p.getSecond());

		scan.close();
	}
}