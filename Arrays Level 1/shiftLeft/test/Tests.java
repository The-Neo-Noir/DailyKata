import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertArrayEquals("shiftLeft([6, 2, 5, 3]) --> [2, 5, 3, 6]",new int[] {2, 5, 3, 6},task.shiftLeft(new int[]{6, 2, 5, 3}));
    assertArrayEquals("shiftLeft([1, 2]) --> [2, 1]",new int[] {2, 1},task.shiftLeft(new int[]{1, 2}));
    assertArrayEquals("shiftLeft([1]) -->  [1]",new int[] {1},task.shiftLeft(new int[]{1}));
    assertArrayEquals("shiftLeft([]) --> []",new int[] {},task.shiftLeft(new int[]{}));
    assertArrayEquals("shiftLeft([1, 1, 2, 2, 4]) --> [1, 2, 2, 4, 1]",new int[] {1, 2, 2, 4, 1},task.shiftLeft(new int[]{1, 1, 2, 2, 4}));
    assertArrayEquals("shiftLeft([1, 1, 1]) --> [1, 1, 1]",new int[] {1, 1, 1},task.shiftLeft(new int[]{1, 1, 1}));
    assertArrayEquals("shiftLeft([1, 2, 3]) --> [2, 3, 1]",new int[] {2, 3, 1},task.shiftLeft(new int[]{1, 2, 3}));

  }
}