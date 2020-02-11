/**
    @author wasitshafi
    @since 11-02-2020
*/
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


class Parent
{
    int p;
}
class Child extends Parent
{
    int c = 10;
    int cc = 20;
    Child(){}
    Child(int x){c = cc = x;}
    Child(int x, int y){c = x; cc = y;}

    public void fun1(){ System.out.println("c : " + c + "\tcc : " + cc);};
    public void fun2(){};
}

public class Solution2018Q2B
{
    public static void main(String... args)
    {
        Child obj = new Child();
        Class c  = obj.getClass();
        Scanner scan = new Scanner(System.in);

        System.out.println("Class Name : " + c.getName());
        System.out.println("Super Class Name : " + c.getSuperclass().getName());

        System.out.println("\nList Of Methods : ");
        Method[] M = c.getMethods();
        for(Method method : M) System.out.println(method.getName());

        c = scan.getClass();

        System.out.println("\nClass Name : " + c.getName()); // full class name because class is in package
        System.out.println("Class Simple Name : " + c.getSimpleName());
    }
}