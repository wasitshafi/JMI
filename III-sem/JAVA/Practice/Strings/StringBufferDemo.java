/**
	@author wasitshafi
	@since 10-02-2020
 */
//StringBuffer is thread safe while StringBuiler is not, so it is slower than StringBuilder
public class StringBufferDemo
{
	public static void main(String... args)
	{
		StringBuffer sb = new StringBuffer();    // reserves 16 characters space
		StringBuffer sb2 = new StringBuffer(30); // reserves 30 characters space
		StringBuffer sb3 = new StringBuffer("The quick brown fox jumps over to the lazy dog. Tit for Tat.");

		System.out.println("sb.capacity()  : " + sb.capacity());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("sb3.capacity() : " + sb3.capacity());

		System.out.println("sb.size()  : " + sb.length());
		System.out.println("sb2.size() : " + sb2.length());
		System.out.println("sb3.size() : " + sb3.length());

		sb.append("Hello Wolld");
		sb2.append("Hello Wolld");
		sb3.append("Hello Wolld");

		System.out.println("\nsb  : " + sb);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb3 : " + sb3);
	}
}
