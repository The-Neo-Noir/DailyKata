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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>twoTwo([4, 2, 2, 3]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2, 4]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2, 4, 2]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>twoTwo([1, 3, 4]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([1, 2, 2, 3, 4]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([1, 2, 3, 4]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2, 7]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2, 7, 2, 1]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>twoTwo([4, 2, 2, 2]) → true</td><td>false</td><td>X</td><td></td></tr><tr><td>twoTwo([2, 2, 2]) → true</td><td>false</td><td>X</td><td></td></tr><tr><td>twoTwo([1, 2]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>twoTwo([2]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td>twoTwo([1]) → true</td><td>false</td><td>X</td><td></td></tr><tr><td>twoTwo([]) → true</td><td>false</td><td>X</td><td></td></tr><tr><td>twoTwo([5, 2, 2, 3]) → true</td><td>true</td><td>OK</td><td></td></tr><tr><td>twoTwo([2, 2, 5, 2]) → false</td><td>false</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }
    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("twoTwo([4, 2, 2, 3]) â†’ true", true, task.twoTwo(new int[]{4, 2, 2, 3}));
        assertEquals("twoTwo([2, 2, 4]) â†’ true", true, task.twoTwo(new int[]{2, 2, 4}));
        assertEquals("twoTwo([2, 2, 4, 2]) â†’ false", false, task.twoTwo(new int[]{2, 2, 4, 2}));
        assertEquals("twoTwo([1, 3, 4]) â†’ true", true, task.twoTwo(new int[]{1, 3, 4}));
        assertEquals("twoTwo([1, 2, 2, 3, 4]) â†’ true", true, task.twoTwo(new int[]{1, 2, 2, 3, 4}));
        assertEquals("twoTwo([1, 2, 3, 4]) â†’ false", false, task.twoTwo(new int[]{1, 2, 3, 4}));
        assertEquals("twoTwo([2, 2]) â†’ true", true, task.twoTwo(new int[]{2, 2}));
        assertEquals("twoTwo([2, 2, 7]) â†’ true", true, task.twoTwo(new int[]{2, 2, 7}));
        assertEquals("twoTwo([2, 2, 7, 2, 1]) â†’ false", false, task.twoTwo(new int[]{2, 2, 7, 2, 1}));
        assertEquals("twoTwo([4, 2, 2, 2]) â†’ true", true, task.twoTwo(new int[]{4, 2, 2, 2}));
        assertEquals("twoTwo([2, 2, 2]) â†’ true", true, task.twoTwo(new int[]{2, 2, 2}));
        assertEquals("twoTwo([1, 2]) â†’ false", false, task.twoTwo(new int[]{1, 2}));
        assertEquals("twoTwo([2]) â†’ false", false, task.twoTwo(new int[]{2}));
        assertEquals("twoTwo([1]) â†’ true", true, task.twoTwo(new int[]{1}));
        assertEquals("twoTwo([]) â†’ true", true, task.twoTwo(new int[]{}));
        assertEquals("twoTwo([5, 2, 2, 3]) â†’ true", true, task.twoTwo(new int[]{5, 2, 2, 3}));
        assertEquals("twoTwo([2, 2, 5, 2]) â†’ false", false, task.twoTwo(new int[]{2, 2, 5, 2}));

    }
}