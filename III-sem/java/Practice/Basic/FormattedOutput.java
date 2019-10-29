import java.util.Scanner;
import java.math.BigInteger;

public class FormattedOutput
{
        public static void main(String[] args)
    {
        int pDec = 10_27_309 , nDec= -10, zero = 0;
        
        System.out.printf("\nConversion Characters:%n");// Both '\n' & '%n' will work with printf() but only '\n' will work with print();

        System.out.printf("d : pDec = '%d' nDec = '%d'  zero = '%d' %n", pDec, nDec, zero);
        System.out.printf("o : pDec = '%o' nDec = '%o'  zero = '%o' %n", pDec, nDec, zero);
        System.out.printf("x : pDec = '%x'  nDec = '%x'  zero = '%x' %n", pDec, nDec, zero);
        System.out.printf("X : pDec = '%X'  nDec = '%X'  zero = '%X' %n", pDec, nDec, zero);
        System.out.printf("%n");

        double num = 5 / 3.0;
        System.out.printf("f : num = '%f' %n", num); // fixed floating point no.
        System.out.printf("e : num = '%e' %n", num); // for exponent.
        System.out.printf("g : num = '%g' %n", num); // general floating point(?).
        System.out.printf("a : num = '%a' %n", num); // hexa-decimal floating no.
        System.out.printf("%n");
        
        String msg = "I will not use, Hello World...!";
        System.out.printf("s : msg = '%s' %n", msg);
        
        Character ch = 'a';
        System.out.printf("c : ch  = '%c' %n", ch);
        System.out.printf("h : ch(hash code) = '%h' %n", ch);

        boolean flag = true;
        System.out.printf("b : flag= '%b' %n", flag);
        System.out.printf("%n%n");




        int Pn = 2_123_156;
        int Nn = -2_132_156;
        BigInteger BI = new BigInteger("1025456756789458456");
        
        System.out.printf("Flags :%n");

        System.out.printf(", : Pn = '%,d'  Nn = '%,d'  bI = '%,d'%n",Pn, Nn, BI); // Comma seperated flag
        System.out.printf("( : Pn = '%(d'  Nn = '%(d'  bI = '%(d'%n",Pn, Nn, BI); // Encloses negative numbers in parenthesis
        System.out.printf("+ : Pn = '%+d'  Nn = '%+d'  bI = '%+d'%n",Pn, Nn, BI); // Prints '+' or '-' sign before number
       
        System.out. printf("space  : '% d' Nn = '% d'%n", Pn, Nn); // adds single space only for posititve numbers only.
        
        double x = -5;
        double y = 3;
        double z = x / y;
         
        // CTM : We can combine more than one flags.
        System.out.printf("5/2    : '%f' %n", z);  
        System.out.printf(".2f    : '%.2f' %n", z);   // only two digits after radix.
        System.out.printf("10.3f  : '%10.3f' %n", z); // field width 10 and precision of 3 digits (By Defaul its right justified).
        System.out.printf("-10.3f : '%-10.3f' %n", z);// field width 10 and precision of 3 digits and left justified.
        System.out.printf("010.3f : '%010.3f' %n", z);// field width 10 and precision of 3 digits  (By Defaul its right justified) also filled remaining with zeros.
        System.out.printf(".(2f   : '%(.2f' %n", z);  // only two digits after radix and enclosed in case of negative number.

        // String.format(); // we can create a formated string rather than just print on console
        
        int a, b;
        a = 4;
        b = -2;
        String formatedString = String.format("'BigInteger : %,d.'", BI, a, b, a*b);
        System.out.print("\nformatedString : " + formatedString);
    }
}