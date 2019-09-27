//
//Solution3.java
//
//java program to ...
//
/* 
   Problem : Given a string, find all distinct palindromic sub-strings of length>1. For example, str = "abaaa" then possible palindromic sub-strings
   are: aa, aaa, aba. Write an interactive Java Program which takes a long string as input and display all distinct palindromic substrings of 
   length > 1.If students are highly motivated, they can write a GUI-based Java applications.
*/
import java.util.Scanner;
import java.util.TreeSet;

public class Solution3
{
    static boolean isPalindrome(String s)
    {
        boolean palindrome = true;
        for(int i = 0, j = s.length() - 1 ; i < j ; i++, j-- )
        {
            if(s.charAt(i) != s.charAt(j))
            {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
    // we can also use sets instead of TreeSet like 'Set <String> palindromes = new HashSet<String>();' but i prefer TreeSet just because i want to diplay the plaindromes in lexicographically
    static TreeSet<String> getPalindromes(String str)
    { 
        TreeSet <String> palindromes = new TreeSet<String>();
        String s;

        // Generating all possible substring. For more info refer : https://github.com/wasitshafi/Competitive-Programming/blob/master/c%2B%2B/printAllPossibleSubStrings.cpp
        for(int i = 0 ; i < str.length() ; i++)
        {
            for( int len = 2 ;  len <= str.length() - i ; len++) // len = 2 beause we don't need palindromes of length 1 , Otherwise set len = 1
            {
                s = str.substring(i,i+len);
                if(isPalindrome(s))
                    palindromes.add(s);
            }
        }
        return palindromes;
    }
    public static void main(String []args)
    {
        String str;
        Scanner scan = new Scanner(System.in);
        TreeSet <String> palindromes = new TreeSet<String> ();        
        
        System.out.print("Enter String : ");
        str = scan.nextLine();

        palindromes = getPalindromes(str);
        
        System.out.println("\nString      : \'" + str + "\'");
        System.out.println("Palindromes : " + palindromes);
        
        /*
        // or  Print individually
        System.out.print("Palindromes : ");
            for(Iterator itr  = palindromes.iterator() ; itr.hasNext() ; System.out.print(itr.next() + " ")); 
                    // or 
            for(String p : palindromes) System.out.println(p + " ");// for each loop
        */

        /* Ex  : str ="ababaabamadamrighsisisabcdeabcd123321"
           ANS : 123321, 2332, 33, aa, aba, abaaba, ababa, ada, ama, baab, bab, isi, madam, sis, sisis */
    }
}