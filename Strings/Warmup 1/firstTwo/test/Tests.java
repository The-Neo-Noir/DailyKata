
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("firstTwo(\"Hello\") → \"He\"","He",task.firstTwo("Hello"));
    assertEquals("firstTwo(\"abcdefg\") → \"ab\"","ab",task.firstTwo("abcdefg"));
    assertEquals("firstTwo(\"ab\") → \"ab\"","ab",task.firstTwo("ab"));
    assertEquals("firstTwo(\"a\") → \"a\"","a",task.firstTwo("a"));
    assertEquals("firstTwo(\"\") → \"\"","",task.firstTwo(""));
    assertEquals("firstTwo(\"Kitten\") → \"Ki\"","Ki",task.firstTwo("Kitten"));
    assertEquals("firstTwo(\"hi\") → \"hi\"","hi",task.firstTwo("hi"));
    assertEquals("firstTwo(\"hiya\") → \"hi\"","hi",task.firstTwo("hiya"));

  }
}