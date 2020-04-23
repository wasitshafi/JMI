// They provide an short-hand for methods having arbitary no. of parameter of one type
// Rules : method can have only one 'varargs' and its should be the last one

public class VarArgs
{
	public static void m1(String... a)
	{
		for(int i = 0 ; i < a.length ; i++) System.out.print(a[i] + " ");
	}
	public static void m101(int... a)
	{
		for(int i = 0 ; i < a.length ; i++) System.out.print(a[i] + " ");
	}

	public static void m102(int x, double y, String s1, String s2, int... a)
	{
		System.out.println("x  : " + x);
		System.out.println("y  : " + y);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		for(int i = 0 ; i < a.length ; i++) System.out.print(a[i] + " ");
	}
	public static void main(String args[])
	{

        m1("The", "quick", "brown", "fox", "jumps", "over", "to", "the", "lazy", "dog", "tit", "for", "tat");
		System.out.println("\n##########################");
		int arr[] = {1, 2, 3, 4, 5};
		System.out.print("Array Elements : ");
		m101(arr);
		System.out.println("\n##########################");
		m102(10, 50.7, "The", "Quick", 10, 20, 30, 40, 50, 60);
	}
}