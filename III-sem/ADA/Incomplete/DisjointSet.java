import java.util.Scanner;

class DSet
{
    private int arr[];

    DSet(int n)
    {
      makeSet(n);
    }
    private void makeSet(int n)      // it creates new set with single elements 'x'
    {
        arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++) arr[i] = i;
    }

    public void union(int X, int Y) // it perform the union operation on sets 'X' & 'Y' (X & Y are names of sets)
    {
        // without pathCompression
        arr[Y]= X;  // or arr[x] = y;
    }

    public int find(int x)          // it prints the name of set with element x // returns parent of x
    {
        while(arr[x] != x)
            x = arr[x];
        return x;
    }

    public void pathCompression()
    {
        System.out.println("Path compression function...");
    }

    public boolean isDisjointSetCreated()
    {
        try
        {
            if(arr.length > 0)
                return true;
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    public int getArraySize()
    {
        return arr.length;
    }
    public void showAll()
    {
        System.out.println("\n\n");
        for(int i = 0 ; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n\n");
    }
}


public class DisjointSet
{
    public static void main(String[] args)
    {
        int n, queryType, element, X, Y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of sets : ");
        n = scan.nextInt();
        DSet ds = new DSet(n);
        while(1 != 0) // while1loop
        {
            System.out.println("1 -> Union.");
            System.out.println("2 -> Find.");
            System.out.println("3 -> Path Compression.");
            System.out.println("4 -> ShowAll"); // temp
            System.out.println("0 -> Exit.");
            System.out.print("\nEnter Query Type : ");
            queryType = scan.nextInt();

            switch(queryType)
            {
                case 1: if(ds.isDisjointSetCreated())
                        {
                            System.out.print("Enter element X : ");
                            X = scan.nextInt();
                            System.out.print("Enter element Y : ");
                            Y = scan.nextInt();
                            ds.union(X, Y);
                        }
                        else
                            System.out.println("Set not Created...!");
                        break;

                case 2: if(ds.isDisjointSetCreated())
                        {
                            System.out.print("Enter element : ");
                            element = scan.nextInt();
                            if(element >= ds.getArraySize() || element < 0)
                                System.out.println("No such element found...!");
                            else
                                System.out.println("Set name : " + ds.find(element));
                        }
                        else
                            System.out.println("Set not Created...!");
                        break;

                case 3: if(ds.isDisjointSetCreated()) // pathCompression
                        {
                            System.out.print("Enter element : ");
                            element = scan.nextInt();
                            if(element >= ds.getArraySize() || element < 0)
                                System.out.println("No such element found...!");
                            else
                                System.out.println("Set name : " + ds.find(element));
                        }
                        else
                          System.out.println("Set not Created...!");
                        break;

                        // temp
                case 4: if(ds.isDisjointSetCreated())
                        {
                          ds.showAll();
                        }
                        else
                          System.out.println("Set not Created...!");
                        break;

                case 0: System.exit(0);
                        break;

                default : System.out.println("Invalid input...!");
            }
        }
    }
}
