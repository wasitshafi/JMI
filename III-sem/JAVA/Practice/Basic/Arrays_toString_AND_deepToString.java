import java.util.Arrays;

public class Arrays_toString_AND_deepToString
{
    public static void main(String[] args)
    {
        String[] arr = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        String[][]arr2 = {{"One", "Two", "Three"}, {"Four", "Five", "Six"}, {"Seven", "Eight", "Nine"}};

        System.out.println("arr[] : " + Arrays.toString(arr));
        System.out.println("arr[][] : " + Arrays.deepToString(arr2));
    }
}