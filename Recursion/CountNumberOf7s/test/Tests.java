import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here

    Task task = new Task();
    assertEquals("count7(717) → 2",2,task.count7(717));
    assertEquals("count7(7) → 1",1,task.count7(7));
    assertEquals("count7(123) → 0",0,task.count7(123));
    assertEquals("count7(77) → 2",2,task.count7(77));
    assertEquals("count7(7123) → 1",1,task.count7(7123));
    assertEquals("count7(771237) → 3",3,task.count7(771237));
    assertEquals("count7(771737) → 4",4,task.count7(771737));
    assertEquals("count7(47571) → 2",2,task.count7(47571));
    assertEquals("count7(777777) → 6",6,task.count7(777777));
    assertEquals("count7(70701277) → 4",4,task.count7(70701277));
    assertEquals("count7(777576197) → 5",5,task.count7(777576197));
    assertEquals("count7(99999) → 0",0,task.count7(99999));
    assertEquals("count7(99799) → 1",1,task.count7(99799));
  }
}