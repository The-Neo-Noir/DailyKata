
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("makeTags(\"i\", \"Yay\") → \"<i>Yay</i>\"","<i>Yay</i>",task.makeTags("i", "Yay"));
    assertEquals("makeTags(\"i\", \"Hello\") → \"<i>Hello</i>\"","<i>Hello</i>",task.makeTags("i", "Hello"));
    assertEquals("makeTags(\"cite\", \"Yay\") → \"<cite>Yay</cite>\"","<cite>Yay</cite>",task.makeTags("cite", "Yay"));
    assertEquals("makeTags(\"address\", \"here\") → \"<address>here</address>\"","<address>here</address>",task.makeTags("address", "here"));
    assertEquals("makeTags(\"body\", \"Heart\") → \"<body>Heart</body>\"","<body>Heart</body>",task.makeTags("body", "Heart"));
    assertEquals("makeTags(\"i\", \"i\") → \"<i>i</i>\"","<i>i</i>",task.makeTags("i", "i"));
    assertEquals("makeTags(\"i\", \"\") → \"<i></i>\"","<i></i>",task.makeTags("i", ""));

  }
}