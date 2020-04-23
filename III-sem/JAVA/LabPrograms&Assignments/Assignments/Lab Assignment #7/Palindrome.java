/*
Write multithreaded Java application for finding all the possible numbers of palindromes of size at 
least 3 in the given long string of DNA sequence. Take sequence input through file and store 
palindromes in a text file. Do you find multithreaded applications better than single threaded?
*/
// Refer link below for Random DNA Sequence generator 
// https://faculty.ucr.edu/~mmaduro/random.htm

import java.util.Scanner;
import java.io.*;
import java.util.*;
//import java.io.File;

class PalindromeThread extends Thread
{
    int k;  //local
    static int count = 0;
    static String DNA;
    static Set <String> allPalindromes  = new TreeSet<String>();

    PalindromeThread(String DNA, int k)
    {
        this.DNA = DNA;
        this.k = k;
        start();
    }

    PalindromeThread(int k)
    {
        this.k = k;
        start();
    }
    
    public void run()
    {
        for(int i = 0 ; i < DNA.length() - k + 1 ; i++)
        {
            if(isPalindrome(i, i + k - 1))
            {
                if(!(allPalindromes.contains(DNA.substring(i, i+ k)))) allPalindromes.add(DNA.substring(i, i+ k));
                System.out.printf("%3d) %s(%3d, %3d) : %s %n",count + 1, getName(), (i + 1), (i + k), DNA.substring(i, i+ k)); // %3d  because |DNA| is 999 characters
                count++;
            }
            try { Thread.sleep(1); }
            catch(Exception e){}
        }
    }

    boolean isPalindrome(int i, int j)
    {
        boolean palindrome = true;
        while(i < j)
        {
            if(DNA.charAt(i++) != DNA.charAt(j--))
            {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    public int getCount()
    {
        return count;
    }

    public synchronized void write()
    {
        try
        {
            String filePath = "output.txt";
            FileWriter fw = new FileWriter(filePath, false);  // true === append, false === overwrite
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(allPalindromes);
            pw.flush();
            pw.close();
        }
        catch(Exception e)
        {
            System.out.print("Error occured");
        }
    }
}

public class Palindrome 
{
    public static void main(String[] args) throws Exception 
    {
        int k;
        String DNA = "";
        File f = new File("DNA.txt");
        Scanner fscan = new Scanner(f);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of k...");
        k = scan.nextInt();
        System.out.println();

        while(fscan.hasNext()) DNA += fscan.nextLine();
        PalindromeThread t[] = new PalindromeThread[k];

        for(int i = 0 ; i < k ; i++)
        {
            if(i == 0) t[i] = new PalindromeThread(DNA, i + 1); //we don't need to pass DNA each time
            else t[i] = new PalindromeThread(k);

            t[i].setName("TRD" + (i + 1));
        }
        

        for(int i = 0 ; i < k ; i++)
            t[i].join();

        System.out.println("Total no of Palindromes : " + t[0].getCount());
        t[0].write();
        fscan.close();
        scan.close();
    }
}