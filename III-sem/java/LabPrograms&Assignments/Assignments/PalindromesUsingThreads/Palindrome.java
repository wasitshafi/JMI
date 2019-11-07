/*
write a multithreaded java app for finding all the possible numbers of palindromes 
of size atleast 3 corrected in a given string . the string will be given as input 
through a file and all the possible palindromes also has to be stored in a file.
Given string is a human genome string containing repetition ATGC
*/
// Refer link below for Random DNA Sequence generator 
// https://faculty.ucr.edu/~mmaduro/random.htm

import java.util.Scanner;
import java.io.File;

class PalindromeThread extends Thread
{
    static int count = 0;
    String DNA;    // share DNA & k...?
    int index, k;

    PalindromeThread(String DNA, int index, int k)
    {
        this.DNA = DNA;
        this.index = index;
        this.k = k;
    }

    public void run()
    {
        for(int i = index ; i < DNA.length() - k + 1 ; i = i + k)
        {
            if(isPalindrome(i, i + k - 1))
            {
                System.out.printf("%s(%3d, %3d) : %s %n",getName(), (i + 1), (i + k), DNA.substring(i, i+ k)); // %3d  because |DNA| is 999 characters
                count++;
            }
            try { Thread.sleep(50); }
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
            
        PalindromeThread t1 = new PalindromeThread(DNA, 0, k);
        PalindromeThread t2 = new PalindromeThread(DNA, 1, k);
        t1.setName("TRD1");
        t2.setName("TRD2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Total no of Palindromes : " + t1.getCount());
        fscan.close();
        scan.close();
    }
}