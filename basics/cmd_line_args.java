public class cmd_line_args
{
   public static void main(String []args)
   {
        if(args.length != 0)
        {
            int i;
            System.out.println("Total no of Command Line Arguments is : " + args.length);
            System.out.println("Command Line Arguments are as follows : ");

            for(i = 0 ; i < args.length ; i++) System.out.println((i + 1) + " >> " + "'" + args[i] + "'");
        }
        else
            System.out.print("No Command line Argument is passed...!");
   }
}