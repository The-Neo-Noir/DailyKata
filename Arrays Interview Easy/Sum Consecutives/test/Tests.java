import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    System.out.println("Basic Tests");
    List<Integer> i = Arrays.asList(1,4,4,4,0,4,3,3,1);
    List<Integer> o = Arrays.asList(1,12,0,4,6,1);
    System.out.println("Input: {1,4,4,4,0,4,3,3,1}");
    assertEquals(o,  new Task().sumConsecutives(i));
    i = Arrays.asList(-5,-5,7,7,12,0);
    o = Arrays.asList(-10,14,12,0);
    System.out.println("Input: {-5,-5,7,7,12,0}");
    assertEquals(o,  new Task().sumConsecutives(i));
    assertEquals(Arrays.asList(1),  new Task().sumConsecutives(Arrays.asList(1)));
    assertEquals(Arrays.asList(1,0),  new Task().sumConsecutives(Arrays.asList(1,0)));
    assertEquals(Arrays.asList(1),  new Task().sumConsecutives(Arrays.asList(1)));
    assertEquals(Arrays.asList(1,0,1),  new Task().sumConsecutives(Arrays.asList(1,0,1)));
    assertEquals(Arrays.asList(1,0,2),  new Task().sumConsecutives(Arrays.asList(1,0,1,1)));
    assertEquals(Arrays.asList(1,0,2,4),  new Task().sumConsecutives(Arrays.asList(1,0,1,1,4)));
    assertEquals(Arrays.asList(0,2,4),  new Task().sumConsecutives(Arrays.asList(0,0,1,1,4)));
    assertEquals(Arrays.asList(0,4,2,4),  new Task().sumConsecutives(Arrays.asList(0,4,1,1,4)));
  }
}