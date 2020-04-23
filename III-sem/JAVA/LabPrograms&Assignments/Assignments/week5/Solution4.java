//
//Solution4.java
//
//program to ...
//
/*  Problem : The k-mer refers to all the possible substrings of length k that are contained in a string. In genomics, k-mers refer to all the possible
              subsequences (of length k) in a given DNA Sequence. The number of possible k-mers given n possibilities (n=4 in the case of DNA e.g. ACTG)
              is n^k. For example, if k=1, there are 4 k-mers possible (i.e. A, C, T, G), in case of k=2, 16 k-mers are possible(e.g. AA AT AC AG TA TT 
              TC TG CA CT CC CG GA GT GC GG). Write a program which takes a DNA sequence file and value of k as input from the user, and calcualte the 
              occurce of k-mers, and store it to a CSV file. [For example, if given DNA sequence S=ATTGCCC, k=2, then output should be as follows:
              AA AT AC AG TA TT TC TG CA CT CC CG GA GT GC GG
              0  1  0  0  0  1  0  1  0  0  2  0  0  0  1  0  */

import java.util.*;
import java.io.*;

class KMERS
{
    int k;
    String DNA;
    Map <String, Integer> kmers = new HashMap<String, Integer>();

    public void set()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter DNA : ");
        DNA = scan.nextLine();

        System.out.print("Enter value of k : ");
        k = scan.nextInt();
    }

    public void get()
    {
        setKmers(DNA, "", k); // Recursive Method to generate all kmers
        countKmers();         // count occurence of each kmer in DNA
        System.out.println("\nDNA : " + DNA);
        System.out.println("kmers are as : " + kmers);
             // or 
        //System.out.print("kmers are as : ");getKmers();     // funtion to print kmers
        saveRecord();
    }

    // Refer. : https://github.com/wasitshafi/Competitive-Programming/blob/master/java/printAllPermutationOfLengthK.java
    private void setKmers(String str, String prefix, int k) 
    {
        if (k == 0)
        { 
            kmers.put(prefix, 0); 
            return; 
        } 
        for (int i = 0; i < str.length(); i++)           // One by one add all characters from set and recursively call for k equals to k-1 
          setKmers(str, prefix + str.charAt(i), k - 1);  //setKmers(str, Next character of input added, k - 1, because we have added a new character) 
    }

    public void countKmers()
    {
        Integer count;

        for(String key : kmers.keySet())
        {
            count = DNAContainsNtimesKmers(key);
            kmers.replace(key, count);
        }   
    }

    private Integer DNAContainsNtimesKmers(String key)
    {
        Integer count = 0;
        for(int i = 0 ; i < DNA.length() - key.length() + 1 ; i++)
            if(key.equals(DNA.substring(i, i + key.length())) )
              count++;

        return count;
    }

    private void saveRecord()
    {
        try
        {
            String keys = "";
            String occurence = "";
            for(String k : kmers.keySet())
            {
                keys += k + " "; 
                occurence +=  kmers.get(k) + " ";
            }

            String filePath = "Solution4.csv";
            FileWriter fw = new FileWriter(filePath, true);  // true === append, false === overwrite
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(keys + "\n" + occurence);
            pw.flush();
            pw.close();
        }
        catch(Exception e)
        {
            System.out.print("Error occured");
        }
    }
    
    private void getKmers()
    {
        Iterator<Map.Entry<String, Integer>> entries = kmers.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Kmer : " + entry.getKey() + ", Occurence : " + entry.getValue());
        }
    }
}

public class Solution4
{
    public static void main(String []args)
    {
        String DNA;
        KMERS k = new KMERS();

        k.set();
        k.get();
    }
}