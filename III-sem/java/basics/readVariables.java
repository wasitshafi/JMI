import java.util.Scanner;
class readVariables{
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	// Getting float input
    	System.out.print("Enter integer: ");
    	int i = input.nextInt();

    	// Getting float input
    	System.out.print("Enter float: ");
    	float f = input.nextFloat();
    	
    	// Getting double input
    	System.out.print("Enter double: ");
    	double d = input.nextDouble();
    	
    	// Getting String input
    	System.out.print("Enter string: ");

        String s = input.next(); // it not read strings with spaces

    	System.out.println("Entered integer is : " + i);
    	System.out.println("Entered float is : " + f);
    	System.out.println("Entered double is : " + d);
        System.out.println("Entered string is : " + s);
    }
}