import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class MyThread extends Thread{
   
    String threadName;
    static int no = 1;
    
    MyThread()
    {

        threadName = "TRD" + no++;
        System.out.println("MSG : " + threadName + " Creadted.");
        start();
    }
    public void run()
    {
        for(int i = 1 ; i <= 20 ; i++) 
        {
            System.out.println(threadName + "=>" + i);
            try
            {
                if(threadName.equals("TRD1"))
                    sleep(1500);
                else if(threadName.equals("TRD2"))
                    sleep(800);
                else
                    sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("MSG : " + threadName + " Completed Task.");    
    } 
}

public class ThreadExample2
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of threads : ");
        n = scan.nextInt();

        MyThread threads[] = new MyThread[10];
        for(int i = 0 ; i < n  ; i ++)
        {
            threads[i] = new MyThread();
            try
            {
                TimeUnit.SECONDS.sleep(1);  
            }
            catch(Exception e)
            {
                System.out.print("Error Occured...!");
            }
        }
        scan.close();
        System.out.println("End of main Thread.");
    } 
}