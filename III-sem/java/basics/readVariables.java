import java.util.Scanner;
class readVariables{
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	// Getting float input
    	System.out.print("Enter float: ");
    	float myFloat = input.nextFloat();
    	
    	// Getting double input
    	System.out.print("Enter double: ");
    	double myDouble = input.nextDouble();
    	
    	// Getting String input
    	System.out.print("Enter text: ");
        String myString = input.next(); // it not read strings with spaces
        

    	System.out.println("Float entered = " + myFloat);
    	System.out.println("Double entered = " + myDouble);
        System.out.println("Text entered = " + myString);
    }
}