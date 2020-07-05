
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("no14([1, 2, 3]) → true",true,task.no14(new int[]{1, 2, 3}));
    assertEquals("no14([1, 2, 3, 4]) → false",false,task.no14(new int[]{1, 2, 3, 4}));
    assertEquals("no14([2, 3, 4]) → true",true,task.no14(new int[]{2, 3, 4}));
    assertEquals("no14([1, 1, 4, 4]) → false",false,task.no14(new int[]{1, 1, 4, 4}));
    assertEquals("no14([2, 2, 4, 4]) → true",true,task.no14(new int[]{2, 2, 4, 4}));
    assertEquals("no14([2, 3, 4, 1]) → false",false,task.no14(new int[]{2, 3, 4, 1}));
    assertEquals("no14([2, 1, 1]) → true",true,task.no14(new int[]{2, 1, 1}));
    assertEquals("no14([1, 4]) → false",false,task.no14(new int[]{1, 4}));
    assertEquals("no14([2]) → true",true,task.no14(new int[]{2}));
    assertEquals("no14([2, 1]) → true",true,task.no14(new int[]{2, 1}));
    assertEquals("no14([1]) → true",true,task.no14(new int[]{1}));
    assertEquals("no14([4]) → true",true,task.no14(new int[]{4}));
    assertEquals("no14([]) → true",true,task.no14(new int[]{}));
    assertEquals("no14([1, 1, 1, 1]) → true",true,task.no14(new int[]{1, 1, 1, 1}));
    assertEquals("no14([9, 4, 4, 1]) → false",false,task.no14(new int[]{9, 4, 4, 1}));
    assertEquals("no14([4, 2, 3, 1]) → false",false,task.no14(new int[]{4, 2, 3, 1}));
    assertEquals("no14([4, 2, 3, 5]) → true",true,task.no14(new int[]{4, 2, 3, 5}));
    assertEquals("no14([4, 4, 2]) → true",true,task.no14(new int[]{4, 4, 2}));
    assertEquals("no14([1, 4, 4]) → false",false,task.no14(new int[]{1, 4, 4}));

  }
}