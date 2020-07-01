
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("withouEnd2(\"Hello\") → \"ell\"","ell",task.withouEnd2("Hello"));
    assertEquals("withouEnd2(\"abc\") → \"b\"","b",task.withouEnd2("abc"));
    assertEquals("withouEnd2(\"ab\") → \"\"","",task.withouEnd2("ab"));
    assertEquals("withouEnd2(\"a\") → \"\"","",task.withouEnd2("a"));
    assertEquals("withouEnd2(\"\") → \"\"","",task.withouEnd2(""));
    assertEquals("withouEnd2(\"coldy\") → \"old\"","old",task.withouEnd2("coldy"));
    assertEquals("withouEnd2(\"java code\") → \"ava cod\"","ava cod",task.withouEnd2("java code"));

  }
}