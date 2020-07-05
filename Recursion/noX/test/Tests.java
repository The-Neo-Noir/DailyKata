import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("noX(\"xaxb\") → \"ab\"","ab",task.noX("xaxb"));
    assertEquals("noX(\"abc\") → \"abc\"","abc",task.noX("abc"));
    assertEquals("noX(\"xx\") → \"\"","",task.noX("xx"));
    assertEquals("noX(\"\") → \"\"","",task.noX(""));
    assertEquals("noX(\"axxbxx\") → \"ab\"","ab",task.noX("axxbxx"));
    assertEquals("noX(\"Hellox\") → \"Hello\"","Hello",task.noX("Hellox"));

  }
}