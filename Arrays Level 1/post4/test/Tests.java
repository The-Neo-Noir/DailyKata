import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertArrayEquals("post4([2, 4, 1, 2]) Ã¢â€ â€™ [1, 2]",new int[] {1, 2},task.post4(new int[]{2, 4, 1, 2}));
    assertArrayEquals("post4([4, 1, 4, 2]) Ã¢â€ â€™ [2]",new int[] {2},task.post4(new int[]{4, 1, 4, 2}));
    assertArrayEquals("post4([4, 4, 1, 2, 3]) Ã¢â€ â€™ [1, 2, 3]",new int[] {1, 2, 3},task.post4(new int[]{4, 4, 1, 2, 3}));
    assertArrayEquals("post4([4, 2]) Ã¢â€ â€™ [2]",new int[] {2},task.post4(new int[]{4, 2}));
    assertArrayEquals("post4([4, 4, 3]) Ã¢â€ â€™ [3]",new int[] {3},task.post4(new int[]{4, 4, 3}));
    assertArrayEquals("post4([4, 4]) Ã¢â€ â€™ []",new int[] {},task.post4(new int[]{4, 4}));
    assertArrayEquals("post4([4]) Ã¢â€ â€™ []",new int[] {},task.post4(new int[]{4}));
    assertArrayEquals("post4([2, 4, 1, 4, 3, 2]) Ã¢â€ â€™ [3, 2]",new int[] {3, 2},task.post4(new int[]{2, 4, 1, 4, 3, 2}));
    assertArrayEquals("post4([4, 1, 4, 2, 2, 2]) Ã¢â€ â€™ [2, 2, 2]",new int[] {2, 2, 2},task.post4(new int[]{4, 1, 4, 2, 2, 2}));
    assertArrayEquals("post4([3, 4, 3, 2]) Ã¢â€ â€™ [3, 2]",new int[] {3, 2},task.post4(new int[]{3, 4, 3, 2}));
  }
}