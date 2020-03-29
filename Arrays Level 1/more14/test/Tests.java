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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>more14([1, 4, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1, 4, 1, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([1, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1, 6, 6]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([6, 1, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1, 6, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([1, 1, 4, 4, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([1, 1, 6, 4, 4, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>more14([]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([4, 1, 4, 6]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([4, 1, 4, 6, 1]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>more14([1, 4, 1, 4, 1, 6]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("more14([1, 4, 1]) â†’ true", true, task.more14(new int[]{1, 4, 1}));
        assertEquals("more14([1, 4, 1, 4]) â†’ false", false, task.more14(new int[]{1, 4, 1, 4}));
        assertEquals("more14([1, 1]) â†’ true", true, task.more14(new int[]{1, 1}));
        assertEquals("more14([1, 6, 6]) â†’ true", true, task.more14(new int[]{1, 6, 6}));
        assertEquals("more14([1]) â†’ true", true, task.more14(new int[]{1}));
        assertEquals("more14([1, 4]) â†’ false", false, task.more14(new int[]{1, 4}));
        assertEquals("more14([6, 1, 1]) â†’ true", true, task.more14(new int[]{6, 1, 1}));
        assertEquals("more14([1, 6, 4]) â†’ false", false, task.more14(new int[]{1, 6, 4}));
        assertEquals("more14([1, 1, 4, 4, 1]) â†’ true", true, task.more14(new int[]{1, 1, 4, 4, 1}));
        assertEquals("more14([1, 1, 6, 4, 4, 1]) â†’ true", true, task.more14(new int[]{1, 1, 6, 4, 4, 1}));
        assertEquals("more14([]) â†’ false", false, task.more14(new int[]{}));
        assertEquals("more14([4, 1, 4, 6]) â†’ false", false, task.more14(new int[]{4, 1, 4, 6}));
        assertEquals("more14([4, 1, 4, 6, 1]) â†’ false", false, task.more14(new int[]{4, 1, 4, 6, 1}));
        assertEquals("more14([1, 4, 1, 4, 1, 6]) â†’ true", true, task.more14(new int[]{1, 4, 1, 4, 1, 6}));

    }
}