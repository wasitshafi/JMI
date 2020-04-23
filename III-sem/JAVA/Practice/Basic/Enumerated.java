public class Enumerated
{
     enum COLOR {RED, GREEN, BROWN, PINK, ORANGE}; // NOTE : There is no "" and = used , eg: enum COLOR = {"RED", "GREEN"....}
     enum SIZE {SMALL, MEDIUM, LARGE, EXTRALARGE};
    public static void main(String []args)
    {
        SIZE pizzaSize = SIZE.MEDIUM;     // pizzaSize is variable
        COLOR shirtColor = COLOR.ORANGE;  //  shirtColor is variable
        
        System.out.println("pizzaSize = " + pizzaSize);
        System.out.println("pizzaSize = " + shirtColor);
    }
}