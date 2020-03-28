import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertEquals("sumDigits(126) → 9",9,task.sumDigits(126));
    assertEquals("sumDigits(49) → 13",13,task.sumDigits(49));
    assertEquals("sumDigits(12) → 3",3,task.sumDigits(12));
    assertEquals("sumDigits(10) → 1",1,task.sumDigits(10));
    assertEquals("sumDigits(1) → 1",1,task.sumDigits(1));
    assertEquals("sumDigits(0) → 0",0,task.sumDigits(0));
    assertEquals("sumDigits(730) → 10",10,task.sumDigits(730));
    assertEquals("sumDigits(1111) → 4",4,task.sumDigits(1111));
    assertEquals("sumDigits(11111) → 5",5,task.sumDigits(11111));
    assertEquals("sumDigits(10110) → 3",3,task.sumDigits(10110));
    assertEquals("sumDigits(235) → 10",10,task.sumDigits(235));

  }
}