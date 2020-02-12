class MyThread extends Thread
{
    public MyThread(String name, Integer count)
    {  
        setName(name);
        increment(count);
    }
    public void increment(Integer count)
    {
        for(int i = 1 ; i < 10 ; i++)
        {
            System.out.println( getName() + " : count = " + count++ );
        }w
    }
}
public class SynchronizeThread
{
    public static void main(String[] args)
    {
        Integer count = 0;
        MyThread t1 = new MyThread("THR1", count);
        t1.start();

        System.out.println("Inside  Main() Thread :");
        System.out.println("Count = " + count);
    }
}