
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("pairStar(\"hello\") → \"hel*lo\"","hel*lo",task.pairStar("hello"));
    assertEquals("pairStar(\"xxyy\") → \"x*xy*y\"","x*xy*y",task.pairStar("xxyy"));
    assertEquals("pairStar(\"aaaa\") → \"a*a*a*a\"","a*a*a*a",task.pairStar("aaaa"));
    assertEquals("pairStar(\"aaab\") → \"a*a*ab\"","a*a*ab",task.pairStar("aaab"));
    assertEquals("pairStar(\"aa\") → \"a*a\"","a*a",task.pairStar("aa"));
    assertEquals("pairStar(\"a\") → \"a\"","a",task.pairStar("a"));
    assertEquals("pairStar(\"\") → \"\"","",task.pairStar(""));
    assertEquals("pairStar(\"noadjacent\") → \"noadjacent\"","noadjacent",task.pairStar("noadjacent"));
    assertEquals("pairStar(\"abba\") → \"ab*ba\"","ab*ba",task.pairStar("abba"));
    assertEquals("pairStar(\"abbba\") → \"ab*b*ba\"","ab*b*ba",task.pairStar("abbba"));

  }
}