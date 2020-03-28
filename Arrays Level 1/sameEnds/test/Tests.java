import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertEquals("shiftLeft([6, 2, 5, 3]) Ã¢â€ â€™ [2, 5, 3, 6]",new int[] {2, 5, 3, 6},task.shiftLeft(new int[]{6, 2, 5, 3}));
    assertEquals("shiftLeft([1, 2]) Ã¢â€ â€™ [2, 1]",new int[] {2, 1},task.shiftLeft(new int[]{1, 2}));
    assertEquals("shiftLeft([1]) Ã¢â€ â€™ [1]",new int[] {1},task.shiftLeft(new int[]{1}));
    assertEquals("shiftLeft([]) Ã¢â€ â€™ []",new int[] {},task.shiftLeft(new int[]{}));
    assertEquals("shiftLeft([1, 1, 2, 2, 4]) Ã¢â€ â€™ [1, 2, 2, 4, 1]",new int[] {1, 2, 2, 4, 1},task.shiftLeft(new int[]{1, 1, 2, 2, 4}));
    assertEquals("shiftLeft([1, 1, 1]) Ã¢â€ â€™ [1, 1, 1]",new int[] {1, 1, 1},task.shiftLeft(new int[]{1, 1, 1}));
    assertEquals("shiftLeft([1, 2, 3]) Ã¢â€ â€™ [2, 3, 1]",new int[] {2, 3, 1},task.shiftLeft(new int[]{1, 2, 3}));

  }
}