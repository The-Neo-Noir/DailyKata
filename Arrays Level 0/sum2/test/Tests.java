import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    assertEquals(6, new Task().sum2(new int[]{3, 3, 3}));
    assertEquals(3, new Task().sum2(new int[]{1, 2, 3}));
    assertEquals(2, new Task().sum2(new int[]{1, 1}));
    assertEquals(2, new Task().sum2(new int[]{1,1,1,1}));
    assertEquals(3, new Task().sum2(new int[]{1,2}));
    assertEquals(1, new Task().sum2(new int[]{1}));
    assertEquals(0, new Task().sum2(new int[]{}));
    assertEquals(9, new Task().sum2(new int[]{4, 5, 6}));
    assertEquals(5, new Task().sum2(new int[]{5}));
  }
}