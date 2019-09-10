import java.util.Scanner;
class readVariables{
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	// float input
    	System.out.print("Enter integer : ");
    	int i = input.nextInt();

    	// float input
    	System.out.print("Enter float : ");
    	float f = input.nextFloat();
    	
    	// double input
    	System.out.print("Enter double : ");
    	double d = input.nextDouble();
		
		// we can also clear the input buffer buffer before reading character line 'input.nextLine();'
	
		// char input
		System.out.print("Enter character : ");
		// input.nextLine(); 
		char ch = input.next().charAt(0); // java does't have any function nextChar() to read single character so we have to use that alternative
		
    	// Getting String input
    	System.out.print("Enter string: ");

		String s = input.next(); // it not read strings with spaces // user nextLin() to read string with spaces
		

    	System.out.println("\n\nEntered integer is : " + i);
    	System.out.println("Entered float is : " + f);
    	System.out.println("Entered double is : " + d);
		System.out.println("Entered character is : " + ch);
		System.out.println("Entered string is : " + s);
    }
}