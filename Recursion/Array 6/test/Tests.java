import com.curiousneds.ConvertTotable;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import static org.junit.Assert.assertEquals;

public class Tests {

  public void testSolution() throws IOException {
    File f = new File("");
    String path = f.getAbsoluteFile().getAbsolutePath()  +File.separatorChar;

    String html="<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>array6([1, 6, 4], 0) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>array6([1, 4], 0) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>array6([6], 0) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>array6([], 0) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>array6([6, 2, 2], 0) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>array6([2, 5], 0) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>array6([1, 9, 4, 6, 6], 0) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>array6([2, 5, 6], 0) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
    System.out.println(path);

    ConvertTotable.fsn(html, path);
  }
  @Test
  public void testn(){
    Task task = new Task();
    assertEquals("array6([1, 6, 4], 0) → true",true,task.array6(new int[]{1, 6, 4},0));
    assertEquals("array6([1, 4], 0) → false",false,task.array6(new int[]{1, 4},0));
    assertEquals("array6([6], 0) → true",true,task.array6(new int[]{6},0));
    assertEquals("array6([], 0) → false",false,task.array6(new int[]{},0));
    assertEquals("array6([6, 2, 2], 0) → true",true,task.array6(new int[]{6, 2, 2},0));
    assertEquals("array6([2, 5], 0) → false",false,task.array6(new int[]{2, 5},0));
    assertEquals("array6([1, 9, 4, 6, 6], 0) → true",true,task.array6(new int[]{1, 9, 4, 6, 6},0));
    assertEquals("array6([2, 5, 6], 0) → true",true,task.array6(new int[]{2, 5, 6},0));

  }
}
