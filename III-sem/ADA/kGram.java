public class kGram
{
    public static void main(String[] args)
    {
        String[] arr = {"I", "Love", "Jamia", "Millia", "Islamia"};

        System.out.print("String : ");

        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");

        System.out.println();
        for(int k = 1 ; k <= arr.length ; k++)
        {    
            System.out.println("All " + k + "-gram : ");
            for(int i = 0 ; i < arr.length - k + 1 ; i++)
            {
                for(int j = i ; j < i + k ; j++)
                    System.out.print(arr[j] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}