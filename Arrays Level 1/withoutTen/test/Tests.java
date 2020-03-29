import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

import com.curiousneds.ConvertTotable;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
    
    public void testSolution() throws URISyntaxException, IOException {
        File f = new File(".");
        String html = "";
        ConvertTotable.fsn("<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]</td><td>[1, 2, 0, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([10, 2, 10]) → [2, 0, 0]</td><td>[2, 0, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([1, 99, 10]) → [1, 99, 0]</td><td>[1, 99, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([10, 13, 10, 14]) → [13, 14, 0, 0]</td><td>[13, 14, 0, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([10, 13, 10, 14, 10]) → [13, 14, 0, 0, 0]</td><td>[13, 14, 0, 0, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([10, 10, 3]) → [3, 0, 0]</td><td>[3, 0, 0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([1]) → [1]</td><td>[1]</td><td>OK</td><td></td></tr><tr><td>withoutTen([13, 1]) → [13, 1]</td><td>[13, 1]</td><td>OK</td><td></td></tr><tr><td>withoutTen([10]) → [0]</td><td>[0]</td><td>OK</td><td></td></tr><tr><td>withoutTen([]) → []</td><td>[]</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>", f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertArrayEquals("withoutTen([1, 10, 10, 2]) â†’ [1, 2, 0, 0]", new int[]{1, 2, 0, 0}, task.withoutTen(new int[]{1, 10, 10, 2}));
        assertArrayEquals("withoutTen([10, 2, 10]) â†’ [2, 0, 0]", new int[]{2, 0, 0}, task.withoutTen(new int[]{10, 2, 10}));
        assertArrayEquals("withoutTen([1, 99, 10]) â†’ [1, 99, 0]", new int[]{1, 99, 0}, task.withoutTen(new int[]{1, 99, 10}));
        assertArrayEquals("withoutTen([10, 13, 10, 14]) â†’ [13, 14, 0, 0]", new int[]{13, 14, 0, 0}, task.withoutTen(new int[]{10, 13, 10, 14}));
        assertArrayEquals("withoutTen([10, 13, 10, 14, 10]) â†’ [13, 14, 0, 0, 0]", new int[]{13, 14, 0, 0, 0}, task.withoutTen(new int[]{10, 13, 10, 14, 10}));
        assertArrayEquals("withoutTen([10, 10, 3]) â†’ [3, 0, 0]", new int[]{3, 0, 0}, task.withoutTen(new int[]{10, 10, 3}));
        assertArrayEquals("withoutTen([1]) â†’ [1]", new int[]{1}, task.withoutTen(new int[]{1}));
        assertArrayEquals("withoutTen([13, 1]) â†’ [13, 1]", new int[]{13, 1}, task.withoutTen(new int[]{13, 1}));
        assertArrayEquals("withoutTen([10]) â†’ [0]", new int[]{0}, task.withoutTen(new int[]{10}));
        assertArrayEquals("withoutTen([]) â†’ []", new int[]{}, task.withoutTen(new int[]{}));
    }
}