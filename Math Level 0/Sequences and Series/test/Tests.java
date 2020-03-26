import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    assertEquals("getScore(1) returns a wrong result", 50, new Task().getScore(1));
    assertEquals("getScore(2) returns a wrong result", 150, new Task().getScore(2));
    assertEquals("getScore(3) returns a wrong result", 300, new Task().getScore(3));
    assertEquals("getScore(4) returns a wrong result", 500, new Task().getScore(4));
    assertEquals("getScore(5) returns a wrong result", 750, new Task().getScore(5));
    assertEquals("getScore(4) returns a wrong result", 6262500,new Task().getScore(500));
    assertEquals("getScore(5) returns a wrong result", 625125000, new Task().getScore(5000));
  }
}