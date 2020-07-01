
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("firstHalf(\"WooHoo\") → \"Woo\"","Woo",task.firstHalf("WooHoo"));
    assertEquals("firstHalf(\"HelloThere\") → \"Hello\"","Hello",task.firstHalf("HelloThere"));
    assertEquals("firstHalf(\"abcdef\") → \"abc\"","abc",task.firstHalf("abcdef"));
    assertEquals("firstHalf(\"ab\") → \"a\"","a",task.firstHalf("ab"));
    assertEquals("firstHalf(\"\") → \"\"","",task.firstHalf(""));
    assertEquals("firstHalf(\"0123456789\") → \"01234\"","01234",task.firstHalf("0123456789"));
    assertEquals("firstHalf(\"kitten\") → \"kit\"","kit",task.firstHalf("kitten"));

  }
}