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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>array11([1, 2, 11], 0) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>array11([11, 11], 0) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>array11([1, 2, 3, 4], 0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>array11([1, 11, 3, 11, 11], 0) → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>array11([11], 0) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>array11([1], 0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>array11([], 0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>array11([11, 2, 3, 4, 11, 5], 0) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>array11([11, 5, 11], 0) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }


    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("array11([1, 2, 11], 0) â†’ 1", 1, task.array11(new int[]{1, 2, 11},0));
        assertEquals("array11([11, 11], 0) â†’ 2", 2, task.array11(new int[]{11, 11},0));
        assertEquals("array11([1, 2, 3, 4], 0) â†’ 0", 0, task.array11(new int[]{1, 2, 3, 4},0));
        assertEquals("array11([1, 11, 3, 11, 11], 0) â†’ 3", 3, task.array11(new int[]{1, 11, 3, 11, 11},0));
        assertEquals("array11([11], 0) â†’ 1", 1, task.array11(new int[]{11},0));
        assertEquals("array11([1], 0) â†’ 0", 0, task.array11(new int[]{1},0));
        assertEquals("array11([], 0) â†’ 0", 0, task.array11(new int[]{},0));
        assertEquals("array11([11, 2, 3, 4, 11, 5], 0) â†’ 2", 2, task.array11(new int[]{11, 2, 3, 4, 11, 5},0));
        assertEquals("array11([11, 5, 11], 0) â†’ 2", 2, task.array11(new int[]{11, 5, 11},0));

    }
}