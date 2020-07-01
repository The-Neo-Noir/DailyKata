
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("comboString(\"Hello\", \"hi\") → \"hiHellohi\"","hiHellohi",task.comboString("Hello", "hi"));
    assertEquals("comboString(\"hi\", \"Hello\") → \"hiHellohi\"","hiHellohi",task.comboString("hi", "Hello"));
    assertEquals("comboString(\"aaa\", \"b\") → \"baaab\"","baaab",task.comboString("aaa", "b"));
    assertEquals("comboString(\"b\", \"aaa\") → \"baaab\"","baaab",task.comboString("b", "aaa"));
    assertEquals("comboString(\"aaa\", \"\") → \"aaa\"","aaa",task.comboString("aaa", ""));
    assertEquals("comboString(\"\", \"bb\") → \"bb\"","bb",task.comboString("", "bb"));
    assertEquals("comboString(\"aaa\", \"1234\") → \"aaa1234aaa\"","aaa1234aaa",task.comboString("aaa", "1234"));
    assertEquals("comboString(\"aaa\", \"bb\") → \"bbaaabb\"","bbaaabb",task.comboString("aaa", "bb"));
    assertEquals("comboString(\"a\", \"bb\") → \"abba\"","abba",task.comboString("a", "bb"));
    assertEquals("comboString(\"bb\", \"a\") → \"abba\"","abba",task.comboString("bb", "a"));
    assertEquals("comboString(\"xyz\", \"ab\") → \"abxyzab\"","abxyzab",task.comboString("xyz", "ab"));

  }
}