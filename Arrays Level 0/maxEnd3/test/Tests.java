import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testSolution() {
    assertArrayEquals(new int[]{1, 2, 3}, new Task().maxEnd3(new int[]{3, 3, 3}));
    assertArrayEquals(new int[]{11, 5, 9}, new Task().maxEnd3(new int[]{11, 11, 11}));
    assertArrayEquals(new int[]{2, 11, 3}, new Task().maxEnd3(new int[]{3, 3, 3}));
    assertArrayEquals(new int[]{11, 3, 3}, new Task().maxEnd3(new int[]{11, 11, 11}));
    assertArrayEquals(new int[]{3, 11, 11}, new Task().maxEnd3(new int[]{11,11,11}));
    assertArrayEquals(new int[]{2, 2, 2}, new Task().maxEnd3(new int[]{2,2,2}));
    assertArrayEquals(new int[]{2, 11, 2}, new Task().maxEnd3(new int[]{2,2,2}));
    assertArrayEquals(new int[]{0, 0, 1}, new Task().maxEnd3(new int[]{1,1,1}));

  }
}