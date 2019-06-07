public class arrays{
    // CTM : arr[], mat[][] == []arr, [][]mat
    public static void main(String a[])
    {
        // Basics of String....
        String []fruits = {"Apple", "Mango", "Orange", "Grapes", "Cherry"};
        System.out.println("fruits[0] = " + fruits[0]);
        System.out.println("fruits length is : " + fruits.length);  // CTM : There is no '()' with length
        System.out.println("Printing fruits using for loop : ");
        for(int i = 0 ; i < fruits.length ; i++)
            System.out.println(i + 1 + ") " + fruits[i]);
        System.out.println("Printing fruits using for-each loop : ");
        for(String f : fruits)
            System.out.println(f);

        // Basics of linear & 2d arrays.....
        int []arr ={1, 2, 3, 4, 5, 6};
        System.out.print("\nPrinting linear array: ");
        for(int i: arr)
            System.out.print(i + " ");
        
        int [][]mat ={ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
        System.out.print("\nPrinting 4X3 matrix  using for loop: ");
        for( int i = 0 ; i < 4; i = i + 1)
        {
            for ( int j = 0 ; j < 3 ; j = j + 1)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }

        System.out.print("\nPrinting 4X3 matrix  using for-each loop: ");
        for( int[] mat2: mat)
        {
            for(int val : mat2)
                System.out.print(val + " ");
            System.out.println();
        }
            
    }
}