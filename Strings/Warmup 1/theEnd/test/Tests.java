import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("theEnd(\"Hello\", true) → \"H\"","H",task.theEnd("Hello", true));
    assertEquals("theEnd(\"Hello\", false) → \"o\"","o",task.theEnd("Hello", false));
    assertEquals("theEnd(\"oh\", true) → \"o\"","o",task.theEnd("oh", true));
    assertEquals("theEnd(\"oh\", false) → \"h\"","h",task.theEnd("oh", false));
    assertEquals("theEnd(\"x\", true) → \"x\"","x",task.theEnd("x", true));
    assertEquals("theEnd(\"x\", false) → \"x\"","x",task.theEnd("x", false));
    assertEquals("theEnd(\"java\", true) → \"j\"","j",task.theEnd("java", true));
    assertEquals("theEnd(\"chocolate\", false) → \"e\"","e",task.theEnd("chocolate", false));
    assertEquals("theEnd(\"1234\", true) → \"1\"","1",task.theEnd("1234", true));
    assertEquals("theEnd(\"code\", false) → \"e\"","e",task.theEnd("code", false));

  }
}