//
//variables.java
//
//program to initilize and print variables on console
//
public class variables{
public static void main(String a[])
{
// for more info read : https://www.ntu.edu.sg/home/ehchua/programming/java/j2_basics.html
int num = 20;
long lnum = 456456416454646l; // 'l' for long

float f1 = 22/7f; // 'f' for float 
double f2 = 22/7d; //'d' for double

char ch = 'a';
String str = "The quick brown fox jumps over to the lazy dog. Tit for tat.";

boolean b = true;


System.out.println("num = " + num);
System.out.println("lnum = " +  lnum);

System.out.println("\nf1(22/7) = " + f1);
System.out.println("f2(22/7) = " + f2);

System.out.println("\nch = " + ch);
System.out.println("str = " + str);

System.out.println("\nb = " + b);
}
}