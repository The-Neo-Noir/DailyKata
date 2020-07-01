import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("right2(\"Hello\") → \"loHel\"","loHel",task.right2("Hello"));
    assertEquals("right2(\"java\") → \"vaja\"","vaja",task.right2("java"));
    assertEquals("right2(\"Hi\") → \"Hi\"","Hi",task.right2("Hi"));
    assertEquals("right2(\"code\") → \"deco\"","deco",task.right2("code"));
    assertEquals("right2(\"cat\") → \"atc\"","atc",task.right2("cat"));
    assertEquals("right2(\"12345\") → \"45123\"","45123",task.right2("12345"));

  }
}