/**
 *  @author WasitShafi
 *  @since 15-OCT-2020
 */

public class LongToInt {
  public static void main(String[] args) {
    long l = 2054L;
    //Long l = 2054L;

    //int i = (int)l; // this will not work if 'l' is of wrapper class Long type, as we can't directly (Long to int), so we can use (int)(long)l, it sumply converts (Long->long->int) it will work with all the cases
    int i = (int)(long)l; // will work with both, primitive as well as Wrapper Class Long

    //int i = l.intValue(); this will work only with wapper class Long
    System.out.println("i : " + i);
    System.out.println("l : " + l);
  }
}
