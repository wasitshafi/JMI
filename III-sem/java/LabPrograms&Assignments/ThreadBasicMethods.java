/**
 * 
 *  
 * */
// for more info refer : 

class ThreadMethodsExample extends Thread
{
    public void run()
    {
        for(int i = 0 ; i < 50 ; i++)
        {
         // System.out.print("Thread State : " + getState());
            try
            {
                Thread.sleep(80);
            }
            catch(Exception e){}
        }
    }
}

public class ThreadBasicMethods
{
    public static void main(String[] args)// CTM : main() is also a thread in java that runs under JVM
    {
        ThreadMethodsExample t = new ThreadMethodsExample();
        t.start();
        System.out.println("Thread.getName()     : '" + t.getName() + "'");  // It will give default thread name
        System.out.println("Thread.getId()       : '" + t.getId() + "'");
        System.out.println("Thread.getPriority() : '" + t.getPriority() + "'");
        System.out.println("Thread.getState()    : '" + t.getState() + "'");
        System.out.println("Thread.isAlive()     : '" + t.isAlive() + "'");
        System.out.println("Thread.isDaemon      : '" + t.isDaemon() + "'");
    
        t.setName("TRD1");  // Change the thread name.
        t.setPriority(10); // for more info ref : https://www.geeksforgeeks.org/java-thread-priority-multithreading/
        System.out.println("\n\n");
        System.out.println("Thread.getName()     : '" + t.getName() + "'");  // It will give default thread name
        System.out.println("Thread.getId()       : '" + t.getId() + "'");
        System.out.println("Thread.getPriority() : '" + t.getPriority() + "'");
        System.out.println("Thread.getState()    : '" + t.getState() + "'");
        System.out.println("Thread.isAlive()     : '" + t.isAlive() + "'");
        System.out.println("Thread.isDaemon      : '" + t.isDaemon() + "'");

    }
}