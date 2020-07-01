
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("middleTwo(\"string\") → \"ri\"","ri",task.middleTwo("string"));
    assertEquals("middleTwo(\"code\") → \"od\"","od",task.middleTwo("code"));
    assertEquals("middleTwo(\"Practice\") → \"ct\"","ct",task.middleTwo("Practice"));
    assertEquals("middleTwo(\"ab\") → \"ab\"","ab",task.middleTwo("ab"));
    assertEquals("middleTwo(\"0123456789\") → \"45\"","45",task.middleTwo("0123456789"));

  }
}