/*
    Q) write a java prog. for parallel linear search operation create a 1D array of huge size & populate random data.Now perform linear 
    search operation where the task of performing search in array should be divided into n subtasks i.e make use of n threads
*/
/**
    @author wasitshafi
    @since  11-02-2020
*/
import java.util.Random;

class LinearSearch extends Thread
{
    static int arr[];
    static int key;
    public static boolean found = false;
    public static int index = -1;    
    int start, end;

    public LinearSearch(int s, int e, int k, int a[])
    {
        start = s;
        end = e;
        key = k;
        arr = a;
    }
    public LinearSearch(int s, int e)
    {
        start = s;
        end = e;
    }

    public void run()
    {
        for(int i = start ; i <= end && found == false ; i++)
        {
            if(arr[i] == key)
            {
                found = true;
                index = i;
                break;
            }
        }
    }
}

public class LinearSearchUsingMultiThreading
{
    public static void main(String... args)
    {
        int n = 500;
        int key = 50;
        int arr[] = new int[n];
        Random r = new Random();

        for(int i = 0 ; i < n ; i++) arr[i] = r.nextInt(200);
       
        System.out.print("Array : ");
        for(int i = 0 ; i < n ; i++) System.out.print(arr[i] + " ");

        LinearSearch t = new LinearSearch(0, n/5, key, arr);
        LinearSearch t2 = new LinearSearch((n/5)+1, 2*(n/5));
        LinearSearch t3 = new LinearSearch((2*(n/5))+1, 3*(n/5));
        LinearSearch t4 = new LinearSearch((3*(n/5))+1, 4*(n/5));
        LinearSearch t5 = new LinearSearch((4*(n/5))+1, n-1);
        
        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        if(LinearSearch.found)
            System.out.println("\n\nKey(" + key + ") found at index : " + LinearSearch.index);
        else
            System.out.println("\n\nKey not found.");
    }
}