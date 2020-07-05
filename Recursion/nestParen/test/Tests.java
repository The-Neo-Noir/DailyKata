
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("nestParen(\"(())\") → true",true,task.nestParen("(())"));
    assertEquals("nestParen(\"((()))\") → true",true,task.nestParen("((()))"));
    assertEquals("nestParen(\"(((x))\") → false",false,task.nestParen("(((x))"));
    assertEquals("nestParen(\"((())\") → false",false,task.nestParen("((())"));
    assertEquals("nestParen(\"((()()\") → false",false,task.nestParen("((()()"));
    assertEquals("nestParen(\"()\") → true",true,task.nestParen("()"));
    assertEquals("nestParen(\"\") → true",true,task.nestParen(""));
    assertEquals("nestParen(\"(yy)\") → false",false,task.nestParen("(yy)"));
    assertEquals("nestParen(\"(())\") → true",true,task.nestParen("(())"));
    assertEquals("nestParen(\"(((y))\") → false",false,task.nestParen("(((y))"));
    assertEquals("nestParen(\"((y)))\") → false",false,task.nestParen("((y)))"));
    assertEquals("nestParen(\"((()))\") → true",true,task.nestParen("((()))"));
    assertEquals("nestParen(\"(())))\") → false",false,task.nestParen("(())))"));
    assertEquals("nestParen(\"((yy())))\") → false",false,task.nestParen("((yy())))"));
    assertEquals("nestParen(\"(((())))\") → true",true,task.nestParen("(((())))"));

  }
}