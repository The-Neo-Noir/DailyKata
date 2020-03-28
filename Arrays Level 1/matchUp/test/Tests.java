import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();

    assertEquals("matchUp([1, 2, 3], [2, 3, 10]) → 2",2,task.matchUp(new int[]{1, 2, 3},new int[] {2, 3, 10}));
    assertEquals("matchUp([1, 2, 3], [2, 3, 5]) → 3",3,task.matchUp(new int[]{1, 2, 3},new int[] {2, 3, 5}));
    assertEquals("matchUp([1, 2, 3], [2, 3, 3]) → 2",2,task.matchUp(new int[]{1, 2, 3},new int[] {2, 3, 3}));
    assertEquals("matchUp([5, 3], [5, 5]) → 1",1,task.matchUp(new int[]{5, 3},new int[] {5, 5}));
    assertEquals("matchUp([5, 3], [4, 4]) → 2",2,task.matchUp(new int[]{5, 3},new int[] {4, 4}));
    assertEquals("matchUp([5, 3], [3, 3]) → 1",1,task.matchUp(new int[]{5, 3},new int[] {3, 3}));
    assertEquals("matchUp([5, 3], [2, 2]) → 1",1,task.matchUp(new int[]{5, 3},new int[] {2, 2}));
    assertEquals("matchUp([5, 3], [1, 1]) → 1",1,task.matchUp(new int[]{5, 3},new int[] {1, 1}));
    assertEquals("matchUp([5, 3], [0, 0]) → 0",0,task.matchUp(new int[]{5, 3},new int[] {0, 0}));
    assertEquals("matchUp([4], [4]) → 0",0,task.matchUp(new int[]{4},new int[] {4}));
    assertEquals("matchUp([4], [5]) → 1",1,task.matchUp(new int[]{4},new int[] {5}));
  }
}