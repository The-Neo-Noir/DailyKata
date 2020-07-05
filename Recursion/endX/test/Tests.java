
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("endX(\"xxre\") → \"rexx\"","rexx",task.endX("xxre"));
    assertEquals("endX(\"xxhixx\") → \"hixxxx\"","hixxxx",task.endX("xxhixx"));
    assertEquals("endX(\"xhixhix\") → \"hihixxx\"","hihixxx",task.endX("xhixhix"));
    assertEquals("endX(\"hiy\") → \"hiy\"","hiy",task.endX("hiy"));
    assertEquals("endX(\"h\") → \"h\"","h",task.endX("h"));
    assertEquals("endX(\"x\") → \"x\"","x",task.endX("x"));
    assertEquals("endX(\"xx\") → \"xx\"","xx",task.endX("xx"));
    assertEquals("endX(\"\") → \"\"","",task.endX(""));
    assertEquals("endX(\"bxx\") → \"bxx\"","bxx",task.endX("bxx"));
    assertEquals("endX(\"bxax\") → \"baxx\"","baxx",task.endX("bxax"));
    assertEquals("endX(\"axaxax\") → \"aaaxxx\"","aaaxxx",task.endX("axaxax"));
    assertEquals("endX(\"xxhxi\") → \"hixxx\"","hixxx",task.endX("xxhxi"));

  }
}