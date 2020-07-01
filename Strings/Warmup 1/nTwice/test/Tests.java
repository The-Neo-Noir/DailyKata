
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("nTwice(\"Hello\", 2) → \"Helo\"","Helo",task.nTwice("Hello", 2));
    assertEquals("nTwice(\"Chocolate\", 3) → \"Choate\"","Choate",task.nTwice("Chocolate", 3));
    assertEquals("nTwice(\"Chocolate\", 1) → \"Ce\"","Ce",task.nTwice("Chocolate", 1));
    assertEquals("nTwice(\"Chocolate\", 0) → \"\"","",task.nTwice("Chocolate", 0));
    assertEquals("nTwice(\"Hello\", 4) → \"Hellello\"","Hellello",task.nTwice("Hello", 4));
    assertEquals("nTwice(\"Code\", 4) → \"CodeCode\"","CodeCode",task.nTwice("Code", 4));
    assertEquals("nTwice(\"Code\", 2) → \"Code\"","Code",task.nTwice("Code", 2));

  }
}