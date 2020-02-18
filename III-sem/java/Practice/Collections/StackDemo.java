/**
    @author wasitshafi
    @since  17-02-2020
*/
import java.util.Stack;

public class StackDemo
{
    public static void main(String... args)
    {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("s : " + s);
        System.out.println("s.size()  : " + s.size());
        System.out.println("s.push(40): " + s.push(40));
        System.out.println("s.peek()  : " + s.peek());
        System.out.println("s.pop     : " + s.pop());
        System.out.println("s.peek    : " + s.pop());
    }
}