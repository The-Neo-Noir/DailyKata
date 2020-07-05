

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("allStar(\"hello\") → \"h*e*l*l*o\"","h*e*l*l*o",task.allStar("hello"));
    assertEquals("allStar(\"abc\") → \"a*b*c\"","a*b*c",task.allStar("abc"));
    assertEquals("allStar(\"ab\") → \"a*b\"","a*b",task.allStar("ab"));
    assertEquals("allStar(\"a\") → \"a\"","a",task.allStar("a"));
    assertEquals("allStar(\"\") → \"\"","",task.allStar(""));
    assertEquals("allStar(\"3.14\") → \"3*.*1*4\"","3*.*1*4",task.allStar("3.14"));
    assertEquals("allStar(\"Chocolate\") → \"C*h*o*c*o*l*a*t*e\"","C*h*o*c*o*l*a*t*e",task.allStar("Chocolate"));
    assertEquals("allStar(\"1234\") → \"1*2*3*4\"","1*2*3*4",task.allStar("1234"));

  }
}