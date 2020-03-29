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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>only14([1, 4, 1, 4]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([1, 4, 2, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([1, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([4, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([2]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([1, 4, 1, 3]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([3, 1, 3]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([4]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([3, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([1, 3, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([1, 1, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>only14([1, 1, 1, 5]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>only14([4, 1, 4, 1]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("only14([1, 4, 1, 4]) â†’ true", true, task.only14(new int[]{1, 4, 1, 4}));
        assertEquals("only14([1, 4, 2, 4]) â†’ false", false, task.only14(new int[]{1, 4, 2, 4}));
        assertEquals("only14([1, 1]) â†’ true", true, task.only14(new int[]{1, 1}));
        assertEquals("only14([4, 1]) â†’ true", true, task.only14(new int[]{4, 1}));
        assertEquals("only14([2]) â†’ false", false, task.only14(new int[]{2}));
        assertEquals("only14([]) â†’ true", true, task.only14(new int[]{}));
        assertEquals("only14([1, 4, 1, 3]) â†’ false", false, task.only14(new int[]{1, 4, 1, 3}));
        assertEquals("only14([3, 1, 3]) â†’ false", false, task.only14(new int[]{3, 1, 3}));
        assertEquals("only14([1]) â†’ true", true, task.only14(new int[]{1}));
        assertEquals("only14([4]) â†’ true", true, task.only14(new int[]{4}));
        assertEquals("only14([3, 4]) â†’ false", false, task.only14(new int[]{3, 4}));
        assertEquals("only14([1, 3, 4]) â†’ false", false, task.only14(new int[]{1, 3, 4}));
        assertEquals("only14([1, 1, 1]) â†’ true", true, task.only14(new int[]{1, 1, 1}));
        assertEquals("only14([1, 1, 1, 5]) â†’ false", false, task.only14(new int[]{1, 1, 1, 5}));
        assertEquals("only14([4, 1, 4, 1]) â†’ true", true, task.only14(new int[]{4, 1, 4, 1}));

    }
}