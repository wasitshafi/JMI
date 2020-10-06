//
//casting.java
//
//progame to show widening & narrowing casting(They are similar to implicit & explicit casting in c/c++)
//
public class casting
{
    public static void main(String a[])
    {
        int x = 29;
        float f = x; // widening casting(automatically) converting smaller type to a larger type size , so there is no data loss.
        System.out.println("f = " + f);
        f = 55.4785f;
        x = (int)f; // narrowing casting(manual casting);here inorder to assing a larger value to small data type variable we need to do manual casting as it will not be handled by the compiler.
        System.out.println("x = " + x);
    }
}