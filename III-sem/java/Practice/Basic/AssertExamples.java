//CTM : By default JMV has disabled, so use this cmd "java -ea filenam.java"
//      or "java -enableassertions filenam.java"
public class AssertExamples
{
    public static void main(String[] args)
    {
        assert(20 > 12); // with no msg 
        assert(20 > 121) : "Error occured at line no 9";
        //assert(20 > 30):"Error at line no 6"; // assert with message

        System.out.println("End of Main()");
    }
}