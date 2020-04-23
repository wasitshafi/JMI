// refer: https://www.javatpoint.com/method-overloading-in-java
// CTM  : We have to take care of data loss, ex: if an float is converted to int it may lead to data 
// loss that is why float promoted to int is not allowed in case u try to do so compiler will raise an error 
// In case ambiguity arises while type promotion JVM will raise an error
public class TypePromotion
{
    static float add(float x, float y)
    {
        return x + y;        
    }
    public static void main(String[] args)
    {
        System.out.println("add(1, 2) : " + add(1, 2)); // int can be promoted to float
        System.out.println("add('a', 'b') : " + add('a', 'b')); // char can be easily promoted to int, and int can be promoted to float
    }
}