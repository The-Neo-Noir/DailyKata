import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    assertTrue(task.commonEnd(new int[]{1, 2, 3},new int[]{7, 3}));
    assertTrue(task.commonEnd(new int[]{1, 2, 3},new int[]{1, 3}));
    assertTrue(task.commonEnd(new int[]{1, 3},new int[]{ 3}));
    assertTrue(task.commonEnd(new int[]{6}, new int[]{6}));

    assertFalse(task.commonEnd(new int[]{1, 2, 3},new int[]{3, 1}));
    assertFalse(task.commonEnd(new int[]{ 2, 3},new int[]{1, 3,11}));
    assertFalse(task.commonEnd(new int[]{ 3},new int[]{ 6,1}));
    assertFalse(task.commonEnd(new int[]{6,1}, new int[]{7}));
  }
}