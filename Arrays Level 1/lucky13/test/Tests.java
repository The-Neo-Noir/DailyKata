import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    assertEquals("lucky13([0, 2, 4]) -->  true", true,t.lucky13(new int[]{0, 2, 4}));
    assertEquals("lucky13([1, 2, 3]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{1, 2, 3}));
    assertEquals("lucky13([1, 2, 4]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{1, 2, 4}));
    assertEquals("lucky13([2, 7, 2, 8]) Ã¢â€ â€™ true", true,t.lucky13(new int[]{2, 7, 2, 8}));
    assertEquals("lucky13([2, 7, 1, 8]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{2, 7, 1, 8}));
    assertEquals("lucky13([3, 7, 2, 8]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{3, 7, 2, 8}));
    assertEquals("lucky13([2, 7, 2, 1]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{2, 7, 2, 1}));
    assertEquals("lucky13([1, 2]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{1, 2}));
    assertEquals("lucky13([2, 2]) Ã¢â€ â€™ true", true,t.lucky13(new int[]{2, 2}));
    assertEquals("lucky13([2]) Ã¢â€ â€™ true", true,t.lucky13(new int[]{2}));
    assertEquals("lucky13([3]) Ã¢â€ â€™ false", false,t.lucky13(new int[]{3}));
    assertEquals("lucky13([]) Ã¢â€ â€™ true", true,t.lucky13(new int[]{}));

  }
}