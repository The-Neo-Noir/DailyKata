import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertArrayEquals(new int[]{2, 4}, task.subarray(new int[]{2, 1, 5, 1, 3, 2}, 3));
    assertArrayEquals(new int[]{1, 2}, task.subarray(new int[]{2, 1, 5, 1, 3, 2}, 2));
    assertArrayEquals(new int[]{1,4}, task.subarray(new int[]{1,9,-1,-2 ,7,3,-1,2},4));

  }

}