
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("countHi(\"xxhixx\") → 1",1,task.countHi("xxhixx"));
    assertEquals("countHi(\"xhixhix\") → 2",2,task.countHi("xhixhix"));
    assertEquals("countHi(\"hi\") → 1",1,task.countHi("hi"));
    assertEquals("countHi(\"hihih\") → 2",2,task.countHi("hihih"));
    assertEquals("countHi(\"h\") → 0",0,task.countHi("h"));
    assertEquals("countHi(\"\") → 0",0,task.countHi(""));
    assertEquals("countHi(\"ihihihihih\") → 4",4,task.countHi("ihihihihih"));
    assertEquals("countHi(\"ihihihihihi\") → 5",5,task.countHi("ihihihihihi"));
    assertEquals("countHi(\"hiAAhi12hi\") → 3",3,task.countHi("hiAAhi12hi"));
    assertEquals("countHi(\"xhixhxihihhhih\") → 3",3,task.countHi("xhixhxihihhhih"));
    assertEquals("countHi(\"ship\") → 1",1,task.countHi("ship"));

  }
}