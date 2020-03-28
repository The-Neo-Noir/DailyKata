import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertEquals("has12([1, 3, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{1, 3, 2}));
    assertEquals("has12([3, 1, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{3, 1, 2}));
    assertEquals("has12([3, 1, 4, 5, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{3, 1, 4, 5, 2}));
    assertEquals("has12([3, 1, 4, 5, 6]) Ã¢â€ â€™ false", false,task.has12(new int[]{3, 1, 4, 5, 6}));
    assertEquals("has12([3, 1, 4, 1, 6, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{3, 1, 4, 1, 6, 2}));
    assertEquals("has12([2, 1, 4, 1, 6, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{2, 1, 4, 1, 6, 2}));
    assertEquals("has12([2, 1, 4, 1, 6]) Ã¢â€ â€™ false", false,task.has12(new int[]{2, 1, 4, 1, 6}));
    assertEquals("has12([1]) Ã¢â€ â€™ false", false,task.has12(new int[]{1}));
    assertEquals("has12([2, 1, 3]) Ã¢â€ â€™ false", false,task.has12(new int[]{2, 1, 3}));
    assertEquals("has12([2, 1, 3, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{2, 1, 3, 2}));
    assertEquals("has12([2]) Ã¢â€ â€™ false", false,task.has12(new int[]{2}));
    assertEquals("has12([3, 2]) Ã¢â€ â€™ false", false,task.has12(new int[]{3, 2}));
    assertEquals("has12([3, 1, 3, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{3, 1, 3, 2}));
    assertEquals("has12([3, 5, 9]) Ã¢â€ â€™ false", false,task.has12(new int[]{3, 5, 9}));
    assertEquals("has12([3, 5, 1]) Ã¢â€ â€™ false", false,task.has12(new int[]{3, 5, 1}));
    assertEquals("has12([3, 2, 1]) Ã¢â€ â€™ false", false,task.has12(new int[]{3, 2, 1}));
    assertEquals("has12([1, 2]) Ã¢â€ â€™ true", true,task.has12(new int[]{1, 2}));
  }
}