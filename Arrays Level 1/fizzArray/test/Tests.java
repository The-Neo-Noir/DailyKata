import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here

    Task task = new Task();



    assertArrayEquals("fizzArray(4) → [0, 1, 2, 3]",new int[]{0, 1, 2, 3},task.fizzArray(4));
    assertArrayEquals("fizzArray(1) → [0]",new int[]{0},task.fizzArray(1));
    assertArrayEquals("fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]",new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},task.fizzArray(10));
    assertArrayEquals("fizzArray(0) → []",new int[]{},task.fizzArray(0));
    assertArrayEquals("fizzArray(2) → [0, 1]",new int[]{0, 1},task.fizzArray(2));
    assertArrayEquals("fizzArray(7) → [0, 1, 2, 3, 4, 5, 6]",new int[]{0, 1, 2, 3, 4, 5, 6},task.fizzArray(7));

  }
}