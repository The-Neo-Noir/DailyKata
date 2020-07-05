
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("countHi2(\"ahixhi\") → 1",1,task.countHi2("ahixhi"));
    assertEquals("countHi2(\"ahibhi\") → 2",2,task.countHi2("ahibhi"));
    assertEquals("countHi2(\"xhixhi\") → 0",0,task.countHi2("xhixhi"));
    assertEquals("countHi2(\"hixhi\") → 1",1,task.countHi2("hixhi"));
    assertEquals("countHi2(\"hixhhi\") → 2",2,task.countHi2("hixhhi"));
    assertEquals("countHi2(\"hihihi\") → 3",3,task.countHi2("hihihi"));
    assertEquals("countHi2(\"hihihix\") → 3",3,task.countHi2("hihihix"));
    assertEquals("countHi2(\"xhihihix\") → 2",2,task.countHi2("xhihihix"));
    assertEquals("countHi2(\"xxhi\") → 0",0,task.countHi2("xxhi"));
    assertEquals("countHi2(\"hixxhi\") → 1",1,task.countHi2("hixxhi"));
    assertEquals("countHi2(\"hi\") → 1",1,task.countHi2("hi"));
    assertEquals("countHi2(\"xxxx\") → 0",0,task.countHi2("xxxx"));
    assertEquals("countHi2(\"h\") → 0",0,task.countHi2("h"));
    assertEquals("countHi2(\"x\") → 0",0,task.countHi2("x"));
    assertEquals("countHi2(\"\") → 0",0,task.countHi2(""));
    assertEquals("countHi2(\"Hellohi\") → 1",1,task.countHi2("Hellohi"));
  }
}