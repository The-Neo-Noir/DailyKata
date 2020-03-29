import com.curiousneds.ConvertTotable;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class Tests {

    public void testSolution() throws URISyntaxException, IOException {
        File f = new File(".");
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>has22([1, 2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([1, 2, 1, 2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([2, 1, 2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([2, 2, 1, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([1, 3, 2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([1, 3, 2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([2, 3, 2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([4, 2, 4, 2, 2, 5]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([1, 2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td>has22([3, 3, 2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>has22([5, 2, 5, 2]) → false</td><td>true</td><td>X</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>X</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("has22([1, 2, 2]) â†’ true", true, task.has22(new int[]{1, 2, 2}));
        assertEquals("has22([1, 2, 1, 2]) â†’ false", false, task.has22(new int[]{1, 2, 1, 2}));
        assertEquals("has22([2, 1, 2]) â†’ false", false, task.has22(new int[]{2, 1, 2}));
        assertEquals("has22([2, 2, 1, 2]) â†’ true", true, task.has22(new int[]{2, 2, 1, 2}));
        assertEquals("has22([1, 3, 2]) â†’ false", false, task.has22(new int[]{1, 3, 2}));
        assertEquals("has22([1, 3, 2, 2]) â†’ true", true, task.has22(new int[]{1, 3, 2, 2}));
        assertEquals("has22([2, 3, 2, 2]) â†’ true", true, task.has22(new int[]{2, 3, 2, 2}));
        assertEquals("has22([4, 2, 4, 2, 2, 5]) â†’ true", true, task.has22(new int[]{4, 2, 4, 2, 2, 5}));
        assertEquals("has22([1, 2]) â†’ false", false, task.has22(new int[]{1, 2}));
        assertEquals("has22([2, 2]) â†’ true", true, task.has22(new int[]{2, 2}));
        assertEquals("has22([2]) â†’ false", false, task.has22(new int[]{2}));
        assertEquals("has22([]) â†’ false", false, task.has22(new int[]{}));
        assertEquals("has22([3, 3, 2, 2]) â†’ true", true, task.has22(new int[]{3, 3, 2, 2}));
        assertEquals("has22([5, 2, 5, 2]) â†’ false", false, task.has22(new int[]{5, 2, 5, 2}));
    }
}