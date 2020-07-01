
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn() {
    Task task = new Task();
    assertEquals("helloName(\"Bob\") → \"Hello Bob!\"", "Hello Bob!", task.helloName("Bob"));
    assertEquals("helloName(\"Alice\") → \"Hello Alice!\"", "Hello Alice!", task.helloName("Alice"));
    assertEquals("helloName(\"X\") → \"Hello X!\"", "Hello X!", task.helloName("X"));
    assertEquals("helloName(\"Dolly\") → \"Hello Dolly!\"", "Hello Dolly!", task.helloName("Dolly"));
    assertEquals("helloName(\"Alpha\") → \"Hello Alpha!\"", "Hello Alpha!", task.helloName("Alpha"));
    assertEquals("helloName(\"Omega\") → \"Hello Omega!\"", "Hello Omega!", task.helloName("Omega"));
    assertEquals("helloName(\"Goodbye\") → \"Hello Goodbye!\"", "Hello Goodbye!", task.helloName("Goodbye"));
    assertEquals("helloName(\"ho ho ho\") → \"Hello ho ho ho!\"", "Hello ho ho ho!", task.helloName("ho ho ho"));
    assertEquals("helloName(\"xyz!\") → \"Hello xyz!!\"", "Hello xyz!!", task.helloName("xyz!"));
    assertEquals("helloName(\"Hello\") → \"Hello Hello!\"", "Hello Hello!", task.helloName("Hello"));

  }
}