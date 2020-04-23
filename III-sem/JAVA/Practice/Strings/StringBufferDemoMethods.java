/**
	@author wasitshafi
	@since 10-02-2020
 */
public class StringBufferDemoMethods
{
	public static void main(String... args)
	{
		StringBuffer sb = new StringBuffer("Hello world");

        System.out.println("sb : " + sb);

		sb.delete(3, 4);
        System.out.println("sb.delete(3, 4)         : " + sb);
        

		sb.deleteCharAt(2);
        System.out.println("sb.deleteCharAt(2)      : " + sb);

		sb.reverse();
		System.out.println("sb.reverse()            : " + sb);
		
		sb.setLength(5);
		System.out.println("sb.setLength(5)         : " + sb);

		sb.replace(1, 3, "123");
		System.out.println("sb.replace(1 ,3 ,\"123\") : " + sb);
	}
}