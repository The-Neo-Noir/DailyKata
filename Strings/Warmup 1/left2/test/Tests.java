
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("left2(\"Hello\") → \"lloHe\"","lloHe",task.left2("Hello"));
    assertEquals("left2(\"java\") → \"vaja\"","vaja",task.left2("java"));
    assertEquals("left2(\"Hi\") → \"Hi\"","Hi",task.left2("Hi"));
    assertEquals("left2(\"code\") → \"deco\"","deco",task.left2("code"));
    assertEquals("left2(\"cat\") → \"tca\"","tca",task.left2("cat"));
    assertEquals("left2(\"12345\") → \"34512\"","34512",task.left2("12345"));
    assertEquals("left2(\"Chocolate\") → \"ocolateCh\"","ocolateCh",task.left2("Chocolate"));
    assertEquals("left2(\"bricks\") → \"icksbr\"","icksbr",task.left2("bricks"));

  }
}