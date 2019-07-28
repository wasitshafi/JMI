class loop{
    public static void main(String []args)
    {
        System.out.print("Using with continue : ");
        System.out.println("Without labeled loop : ");
        for(int i = 1 ; i <= 6 ; i++)
        {
            System.out.println();
            for(int j = 1 ; j <= i ; j++)
            {
                if( j == 3)
                {
                    continue;
                }
                System.out.print(j + " ");
            }
        }

        System.out.println("\n\nWith labeled loop :");
        label1: for(int i = 1 ; i <= 6 ; i++)
        {
            System.out.println();
            for(int j = 1 ; j <= i ; j++)
            {
                if( j == 3)
                 continue label1;
                 System.out.print(j + " ");

            }
        }

        System.out.println("\n\nUsing with break : ");
        System.out.println("Without labeled loop : ");
        for(int i = 1 ; i <= 6 ; i++)
        {
            System.out.println();
            for(int j = 1 ; j <= i ; j++)
            {
                if( j == 3)
                {
                    break;
                }
                System.out.print(j + " ");
            }
        }

        System.out.println("\n\nWith labeled loop :");
        label1: for(int i = 1 ; i <= 6 ; i++)
        {
            System.out.println();
            for(int j = 1 ; j <= i ; j++)
            {
                if( j == 3)
                 break label1;
                 System.out.print(j + " ");

            }
        }
    }
}