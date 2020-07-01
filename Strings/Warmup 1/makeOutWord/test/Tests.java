
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("makeOutWord(\"<<>>\", \"Yay\") → \"<<Yay>>\"","<<Yay>>",task.makeOutWord("<<>>", "Yay"));
    assertEquals("makeOutWord(\"<<>>\", \"WooHoo\") → \"<<WooHoo>>\"","<<WooHoo>>",task.makeOutWord("<<>>", "WooHoo"));
    assertEquals("makeOutWord(\"[[]]\", \"word\") → \"[[word]]\"","[[word]]",task.makeOutWord("[[]]","word"));
    assertEquals("makeOutWord(\"HHoo\", \"Hello\") → \"HHHellooo\"","HHHellooo",task.makeOutWord("HHoo", "Hello"));
    assertEquals("makeOutWord(\"abyz\", \"YAY\") → \"abYAYyz\"","abYAYyz",task.makeOutWord("abyz", "YAY"));
  }
}