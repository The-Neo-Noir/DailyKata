import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {

    Task t= new Task();
    assertEquals(3, t.countEvens(new int[]{2, 1, 2, 3, 4}));
    assertEquals(3, t.countEvens(new int[]{2, 2,0}));
    assertEquals(1, t.countEvens(new int[]{1,2,5}));
    assertEquals(3, t.countEvens(new int[]{2,2,2}));
    assertEquals(3, t.countEvens(new int[]{0,0,0}));
    assertEquals(0, t.countEvens(new int[]{1,3,5}));
  }
}