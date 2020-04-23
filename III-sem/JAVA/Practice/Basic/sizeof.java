//
//sizeof.java
//
//program to print sizeof primitive data types
//
public class sizeof
{
    public static void main(String []args)
    {
        System.out.println("Size of 'byte'  is  : " + Byte.SIZE / 8 +  " Bytes [" + Byte.SIZE + " bits ]");
        System.out.println("Size of 'short' is  : " + Short.SIZE / 8 + " Bytes [" + Short.SIZE + " bits ]");
        System.out.println("Size of 'int' is    : " + Integer.SIZE / 8 + " Bytes [" + Integer.SIZE + " bits ]");
        System.out.println("Size of 'long' is   : " + Long.SIZE / 8 + " Bytes [" + Long.SIZE + " bits ]");
        System.out.println("Size of 'float' is  : " + Float.SIZE / 8 + " Bytes [" + Float.SIZE + " bits ]");
        System.out.println("Size of 'double' is : " + Double.SIZE / 8 + " Bytes [" + Double.SIZE + " bits ]");
        System.out.println("Size of 'char' is   : " + Character.SIZE / 8 + " Bytes [" + Character.SIZE + " bits ]");


        int x = 10;

    }
}