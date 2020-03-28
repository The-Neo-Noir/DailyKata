import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task t = new Task();
    assertArrayEquals("biggerTwo([1, 2], [3, 4]) --> [3, 4]", new int[]{3, 4}, t.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
    assertArrayEquals("biggerTwo([3, 4], [1, 2]) --> [3, 4]", new int[]{3, 4}, t.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
    assertArrayEquals("biggerTwo([1, 1], [1, 2]) --> [1, 2]", new int[]{1, 2}, t.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
    assertArrayEquals("biggerTwo([2, 1], [1, 1]) --> [2, 1]",new int[] {2, 1},t.biggerTwo(new int[]{2, 1},new int[] {1, 1}));
    assertArrayEquals("biggerTwo([2, 2], [1, 3]) --> [2, 2]", new int[]{2, 2}, t.biggerTwo(new int[]{2, 2},new int[] {1, 3}));
    assertArrayEquals("biggerTwo([1, 3], [2, 2]) --> [1, 3]",new int[] {1, 3},t.biggerTwo(new int[]{1, 3},new int[] {2, 2}));
    assertArrayEquals("biggerTwo([6, 7], [3, 1]) --> [6, 7]",new int[] {6, 7},t.biggerTwo(new int[]{6, 7},new int[] {3, 1}));
  }
}