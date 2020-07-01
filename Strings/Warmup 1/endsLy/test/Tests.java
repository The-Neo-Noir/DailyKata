import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("endsLy(\"oddly\") → true",true,task.endsLy("oddly"));
    assertEquals("endsLy(\"y\") → false",false,task.endsLy("y"));
    assertEquals("endsLy(\"oddy\") → false",false,task.endsLy("oddy"));
    assertEquals("endsLy(\"oddl\") → false",false,task.endsLy("oddl"));
    assertEquals("endsLy(\"olydd\") → false",false,task.endsLy("olydd"));
    assertEquals("endsLy(\"ly\") → true",true,task.endsLy("ly"));
    assertEquals("endsLy(\"\") → false",false,task.endsLy(""));
    assertEquals("endsLy(\"falsey\") → false",false,task.endsLy("falsey"));
    assertEquals("endsLy(\"evenly\") → true",true,task.endsLy("evenly"));

  }
}