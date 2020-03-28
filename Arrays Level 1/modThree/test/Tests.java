import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();

    assertEquals("modThree([2, 1, 2, 5]) → false",false,task.modThree(new int[]{2, 1, 2, 5}));
    assertEquals("modThree([2, 4, 2, 5]) → true",true,task.modThree(new int[]{2, 4, 2, 5}));
    assertEquals("modThree([1, 2, 1, 2, 1]) → false",false,task.modThree(new int[]{1, 2, 1, 2, 1}));
    assertEquals("modThree([9, 9, 9]) → true",true,task.modThree(new int[]{9, 9, 9}));
    assertEquals("modThree([1, 2, 1]) → false",false,task.modThree(new int[]{1, 2, 1}));
    assertEquals("modThree([1, 2]) → false",false,task.modThree(new int[]{1, 2}));
    assertEquals("modThree([1]) → false",false,task.modThree(new int[]{1}));
    assertEquals("modThree([]) → false",false,task.modThree(new int[]{}));
    assertEquals("modThree([9, 7, 2, 9]) → false",false,task.modThree(new int[]{9, 7, 2, 9}));
    assertEquals("modThree([9, 7, 2, 9, 2, 2]) → false",false,task.modThree(new int[]{9, 7, 2, 9, 2, 2}));
    assertEquals("modThree([9, 7, 2, 9, 2, 2, 6]) → true",true,task.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}));
  }
}