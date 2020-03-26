import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tests {
  @Test
  public void testSolution() {
    Task t= new Task();
    assertTrue(t.firstLast6(new int[]{1, 2, 6}));
    assertTrue(t.firstLast6(new int[]{6, 1, 2, 3}));
    assertTrue(t.firstLast6(new int[]{13, 6, 1, 2, 6}));
    assertTrue(t.firstLast6(new int[]{3, 6}));
    assertTrue(t.firstLast6(new int[]{6}));

    assertFalse(t.firstLast6(new int[]{8,6,7}));
    assertFalse(t.firstLast6(new int[]{1, 6, 5}));
    assertFalse(t.firstLast6(new int[]{1}));
  }
}