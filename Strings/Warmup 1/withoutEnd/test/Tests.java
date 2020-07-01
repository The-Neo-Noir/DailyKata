import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("withoutEnd(\"Hello\") → \"ell\"","ell",task.withoutEnd("Hello"));
    assertEquals("withoutEnd(\"java\") → \"av\"","av",task.withoutEnd("java"));
    assertEquals("withoutEnd(\"coding\") → \"odin\"","odin",task.withoutEnd("coding"));
    assertEquals("withoutEnd(\"code\") → \"od\"","od",task.withoutEnd("code"));
    assertEquals("withoutEnd(\"ab\") → \"\"","",task.withoutEnd("ab"));
    assertEquals("withoutEnd(\"Chocolate!\") → \"hocolate\"","hocolate",task.withoutEnd("Chocolate!"));
    assertEquals("withoutEnd(\"kitten\") → \"itte\"","itte",task.withoutEnd("kitten"));
    assertEquals("withoutEnd(\"woohoo\") → \"ooho\"","ooho",task.withoutEnd("woohoo"));

  }
}