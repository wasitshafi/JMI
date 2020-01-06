import java.util.ArrayList;
public class GenericsDemo
{
	public static void main(String... args)
	{
		// Without generics

		// This program may show a warning compile time we can ignore that(*.class will be created even when is show some message)
		// or run program like "javac GenericsDemo.java -Xlint"
		/*
		ArrayList a = new ArrayList();
		a.add(Integer.valueOf(10));
		a.add("Hello");
		a.add(10.25);
		a.add(true);
		
		System.out.println("Array Elements are as : ");		
		System.out.println((Integer)a.get(0));
		System.out.println((String)a.get(1));
		System.out.println((Double)a.get(2));
		System.out.println((Boolean)a.get(3));
		*/

		// Gith generics
		ArrayList<String> s = new ArrayList<>(); // now this array list is typesafe
		s.add("The");
		s.add("Quick");
		s.add("Brown");
		s.add("Fox");
		s.add("Jumps");
		s.add("Over");
		s.add("To");
		s.add("The");
		s.add("Lazy");
		s.add("Dog.");
		s.add("Tit");
		s.add("for");
		s.add("Tat.");

		System.out.println("ArrayList Elements : ");
		for(String element : s) System.out.println(element); // or => for(int i = 0 ; i < s.size() ; i++) System.out.println(s.get(i));
	}
}