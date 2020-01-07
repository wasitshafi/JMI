class SampleClass<T>// if no parameter is passed then T === Object
{
	T x;
	public SampleClass(T x)
	{
		this.x = x;
	}
	public void get()
	{
		System.out.println("X : " + x);
	}	
}
public class RawType
{
	public static void main(String... args)
	{
		String s = "Hello";
		Integer i = 10;
		Float f = 20.45f;

		SampleClass o = new SampleClass(s);  // RawType(in that case typevariable will be like Object class. it "T x;" === "Object x"). RawType is without type parameter.
		SampleClass o2 = new SampleClass(i); // RawType
		SampleClass o3 = new SampleClass(f); // RawType
		 
		System.out.println("Raw Type :");
		o.get();
		o2.get();
		o3.get();

		System.out.println();
		SampleClass<Integer> o4 = new SampleClass<>(i); // it can take only Interger Arguments(parameterize type)
		System.out.println("Parameterized Type :");
		o4.get();
	}
}