
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false",false,task.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},1));
    assertEquals("sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true",true,task.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},2));
    assertEquals("sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false",false,task.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},3));
    assertEquals("sameEnds([1, 2, 5, 2, 1], 1) → true",true,task.sameEnds(new int[]{1, 2, 5, 2, 1},1));
    assertEquals("sameEnds([1, 2, 5, 2, 1], 2) → false",false,task.sameEnds(new int[]{1, 2, 5, 2, 1},2));
    assertEquals("sameEnds([1, 2, 5, 2, 1], 0) → true",true,task.sameEnds(new int[]{1, 2, 5, 2, 1},0));
    assertEquals("sameEnds([1, 2, 5, 2, 1], 5) → true",true,task.sameEnds(new int[]{1, 2, 5, 2, 1},5));
    assertEquals("sameEnds([1, 1, 1], 0) → true",true,task.sameEnds(new int[]{1, 1, 1},0));
    assertEquals("sameEnds([1, 1, 1], 1) → true",true,task.sameEnds(new int[]{1, 1, 1},1));
    assertEquals("sameEnds([1, 1, 1], 2) → true",true,task.sameEnds(new int[]{1, 1, 1},2));
    assertEquals("sameEnds([1, 1, 1], 3) → true",true,task.sameEnds(new int[]{1, 1, 1},3));
    assertEquals("sameEnds([1], 1) → true",true,task.sameEnds(new int[]{1},1));
    assertEquals("sameEnds([], 0) → true",true,task.sameEnds(new int[]{},0));
    assertEquals("sameEnds([4, 2, 4, 5], 1) → false",false,task.sameEnds(new int[]{4, 2, 4, 5},1));

  }
}