
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn() {
    Task task = new Task();
    assertEquals("nonStart(\"Hello\", \"There\") → \"ellohere\"", "ellohere", task.nonStart("Hello", "There"));
    assertEquals("nonStart(\"java\", \"code\") → \"avaode\"", "avaode", task.nonStart("java", "code"));
    assertEquals("nonStart(\"shotl\", \"java\") → \"hotlava\"", "hotlava", task.nonStart("shotl", "java"));
    assertEquals("nonStart(\"ab\", \"xy\") → \"by\"", "by", task.nonStart("ab", "xy"));
    assertEquals("nonStart(\"ab\", \"x\") → \"b\"", "b", task.nonStart("ab", "x"));
    assertEquals("nonStart(\"x\", \"ac\") → \"c\"", "c", task.nonStart("x", "ac"));
    assertEquals("nonStart(\"a\", \"x\") → \"\"", "", task.nonStart("a", "x"));
    assertEquals("nonStart(\"kit\", \"kat\") → \"itat\"", "itat", task.nonStart("kit", "kat"));
    assertEquals("nonStart(\"mart\", \"dart\") → \"artart\"", "artart", task.nonStart("mart", "dart"));

  }
}
