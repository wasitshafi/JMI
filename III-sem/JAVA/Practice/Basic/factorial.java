public class factorial{
    int f(int n)
    {
        if(n == 1 )
         return 1;
         else
         return (n * f(n - 1));
    }
    public static void main(String []args)
    {
        int num = 4;
        factorial obj = new factroial();

        
        int fact = obj.f(num);
        System.out.print("Factorial  is : " + fact);
    }

}