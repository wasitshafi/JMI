//CTM : By default JMV has disabled, so use this cmd "java -ea filenam.java"
//      or "java -enableassertions filenam.java"
// we don't need to recompile the program for enabaling the assertions
// refer : cay horstman p.no : 384
public class AssertExamples
{
    public static void main(String[] args)
    {
        assert(20 > 12); // with no msg 
        assert(20 > 121) : "Error occured : 20 < 121 "; // assert with error message
        //assert(20 > 30):"Error at line no 11"; // assert with message
        System.out.println("End of Main()");
        // there is much more in assertion plz refer cay horstman 385
        // eg : how to enable/disable assertion for specific class
    }
}