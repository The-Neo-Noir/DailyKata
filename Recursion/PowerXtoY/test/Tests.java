import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {

    Task t = new Task();
    assertEquals( "powerN(3,1)==3" ,3, t.powerN(3, 1));
    assertEquals( "powerN(3,2)==9" ,9, t.powerN(3, 2));
    assertEquals( "powerN(3,3)==27" ,27, t.powerN(3, 3));
    assertEquals( "powerN(4,1)==4" ,4, t.powerN(4, 1));
    assertEquals( "powerN(0,0)==1" ,1, t.powerN(0, 0));
    assertEquals( "powerN(0,3)==0" ,0, t.powerN(0, 3));
    assertEquals( "powerN(0,1)==0" ,0, t.powerN(0, 1));
    assertEquals( "powerN(1,0)==1" ,1, t.powerN(1, 0));
    assertEquals( "powerN(10,1)==10" ,10, t.powerN(10, 1));
    assertEquals( "powerN(10,3)==100" ,1000, t.powerN(10, 3));
  }
}