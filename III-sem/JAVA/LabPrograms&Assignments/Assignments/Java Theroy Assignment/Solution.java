import java.util.TimerTask;
import java.util.Timer;

class PrintMsg extends TimerTask
{
    public void run()
    {
        System.out.println("Hello World...");
    }
}

public class Solution
{
    public static void main(String[] args)
    {
        PrintMsg task = new PrintMsg();
        
        Timer t = new Timer();
        t.scheduleAtFixedRate(task, 5000, 5000);// refer : https://www.tutorialspoint.com/java/util/timer_scheduleatfixedrate_delay.htm
    }
}