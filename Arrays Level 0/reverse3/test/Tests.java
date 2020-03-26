import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test her
    assertArrayEquals(new int[]{3,2,1} , new Task().reverse3( new int[]{1, 2, 3}));
    assertArrayEquals(new int[]{5, 11, 9} , new Task().reverse3( new int[]{9, 11, 5}));
    assertArrayEquals(new int[]{7, 0, 0} , new Task().reverse3( new int[]{0, 0, 7}));
    assertArrayEquals(new int[]{2, 1, 2} , new Task().reverse3( new int[]{2, 1, 2}));
    assertArrayEquals(new int[]{1, 2, 1} , new Task().reverse3( new int[]{1, 2, 1}));
    assertArrayEquals(new int[]{2, 11, 3} , new Task().reverse3( new int[]{3, 11, 2}));
    assertArrayEquals(new int[]{7, 2, 3} , new Task().reverse3( new int[]{3, 2, 7}));
    assertArrayEquals(new int[]{7} , new Task().reverse3( new int[]{ 7}));
    assertArrayEquals(new int[]{0,0} , new Task().reverse3( new int[]{0,0}));

  }
}