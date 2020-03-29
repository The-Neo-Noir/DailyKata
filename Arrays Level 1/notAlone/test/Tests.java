import com.curiousneds.ConvertTotable;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertArrayEquals;

public class Tests {

    public void testSolution() throws URISyntaxException, IOException {
        File f = new File(".");
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>notAlone([1, 2, 3], 2) → [1, 3, 3]</td><td>[1, 3, 3]</td><td>OK</td><td></td></tr><tr><td>notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]</td><td>[1, 3, 3, 5, 5, 2]</td><td>OK</td><td></td></tr><tr><td>notAlone([3, 4], 3) → [3, 4]</td><td>[3, 4]</td><td>OK</td><td></td></tr><tr><td>notAlone([3, 3], 3) → [3, 3]</td><td>[3, 3]</td><td>OK</td><td></td></tr><tr><td>notAlone([1, 3, 1, 2], 1) → [1, 3, 3, 2]</td><td>[1, 3, 3, 2]</td><td>OK</td><td></td></tr><tr><td>notAlone([3], 3) → [3]</td><td>[3]</td><td>OK</td><td></td></tr><tr><td>notAlone([], 3) → []</td><td>[]</td><td>OK</td><td></td></tr><tr><td>notAlone([7, 1, 6], 1) → [7, 7, 6]</td><td>[7, 7, 6]</td><td>OK</td><td></td></tr><tr><td>notAlone([1, 1, 1], 1) → [1, 1, 1]</td><td>[1, 1, 1]</td><td>OK</td><td></td></tr><tr><td>notAlone([1, 1, 1, 2], 1) → [1, 1, 1, 2]</td><td>[1, 1, 1, 2]</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>\n";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertArrayEquals("notAlone([1, 2, 3], 2) â†’ [1, 3, 3]", new int[]{1, 3, 3}, task.notAlone(new int[]{1, 2, 3},2));
        assertArrayEquals("notAlone([1, 2, 3, 2, 5, 2], 2) â†’ [1, 3, 3, 5, 5, 2]", new int[]{1, 3, 3, 5, 5, 2}, task.notAlone(new int[]{1, 2, 3, 2, 5, 2},2));
        assertArrayEquals("notAlone([3, 4], 3) â†’ [3, 4]", new int[]{3, 4}, task.notAlone(new int[]{3, 4},3));
        assertArrayEquals("notAlone([3, 3], 3) â†’ [3, 3]", new int[]{3, 3}, task.notAlone(new int[]{3, 3},3));
        assertArrayEquals("notAlone([1, 3, 1, 2], 1) â†’ [1, 3, 3, 2]", new int[]{1, 3, 3, 2}, task.notAlone(new int[]{1, 3, 1, 2},1));
        assertArrayEquals("notAlone([3], 3) â†’ [3]", new int[]{3}, task.notAlone(new int[]{3},3));
        assertArrayEquals("notAlone([], 3) â†’ []", new int[]{}, task.notAlone(new int[]{},3));
        assertArrayEquals("notAlone([7, 1, 6], 1) â†’ [7, 7, 6]", new int[]{7, 7, 6}, task.notAlone(new int[]{7, 1, 6},1));
        assertArrayEquals("notAlone([1, 1, 1], 1) â†’ [1, 1, 1]", new int[]{1, 1, 1}, task.notAlone(new int[]{1, 1, 1},1));
        assertArrayEquals("notAlone([1, 1, 1, 2], 1) â†’ [1, 1, 1, 2]", new int[]{1, 1, 1, 2}, task.notAlone(new int[]{1, 1, 1, 2},1));

    }
}