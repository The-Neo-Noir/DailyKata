
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("countPairs(\"axa\") → 1",1,task.countPairs("axa"));
    assertEquals("countPairs(\"axax\") → 2",2,task.countPairs("axax"));
    assertEquals("countPairs(\"axbx\") → 1",1,task.countPairs("axbx"));
    assertEquals("countPairs(\"hi\") → 0",0,task.countPairs("hi"));
    assertEquals("countPairs(\"hihih\") → 3",3,task.countPairs("hihih"));
    assertEquals("countPairs(\"ihihhh\") → 3",3,task.countPairs("ihihhh"));
    assertEquals("countPairs(\"ihjxhh\") → 0",0,task.countPairs("ihjxhh"));
    assertEquals("countPairs(\"\") → 0",0,task.countPairs(""));
    assertEquals("countPairs(\"a\") → 0",0,task.countPairs("a"));
    assertEquals("countPairs(\"aa\") → 0",0,task.countPairs("aa"));
    assertEquals("countPairs(\"aaa\") → 1",1,task.countPairs("aaa"));

  }
}