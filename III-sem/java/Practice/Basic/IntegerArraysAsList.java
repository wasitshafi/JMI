/**
    @author wasitshafi
    @since  09-02-2020
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class IntegerArraysAsList
{
    public static void main(String... args)
    {
        Integer arr[] = {11, 5, 2, 30, 50};

        System.out.println("Min : " + Collections.min(Arrays.asList(arr)));
        System.out.println("Min : " + Collections.max(Arrays.asList(arr)));
    }
}