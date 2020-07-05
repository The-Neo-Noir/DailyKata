
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("changeXY(\"codex\") → \"codey\"","codey",task.changeXY("codex"));
    assertEquals("changeXY(\"xxhixx\") → \"yyhiyy\"","yyhiyy",task.changeXY("xxhixx"));
    assertEquals("changeXY(\"xhixhix\") → \"yhiyhiy\"","yhiyhiy",task.changeXY("xhixhix"));
    assertEquals("changeXY(\"hiy\") → \"hiy\"","hiy",task.changeXY("hiy"));
    assertEquals("changeXY(\"h\") → \"h\"","h",task.changeXY("h"));
    assertEquals("changeXY(\"x\") → \"y\"","y",task.changeXY("x"));
    assertEquals("changeXY(\"\") → \"\"","",task.changeXY(""));
    assertEquals("changeXY(\"xxx\") → \"yyy\"","yyy",task.changeXY("xxx"));
    assertEquals("changeXY(\"yyhxyi\") → \"yyhyyi\"","yyhyyi",task.changeXY("yyhxyi"));
    assertEquals("changeXY(\"hihi\") → \"hihi\"","hihi",task.changeXY("hihi"));

  }
}