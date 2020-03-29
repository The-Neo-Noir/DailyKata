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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>triangle(0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>triangle(1) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>triangle(2) → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>triangle(3) → 6</td><td>6</td><td>OK</td><td></td></tr><tr><td>triangle(4) → 10</td><td>10</td><td>OK</td><td></td></tr><tr><td>triangle(5) → 15</td><td>15</td><td>OK</td><td></td></tr><tr><td>triangle(6) → 21</td><td>21</td><td>OK</td><td></td></tr><tr><td>triangle(7) → 28</td><td>28</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("triangle(0) â†’ 0", 0, task.triangle(0));
        assertEquals("triangle(1) â†’ 1", 1, task.triangle(1));
        assertEquals("triangle(2) â†’ 3", 3, task.triangle(2));
        assertEquals("triangle(3) â†’ 6", 6, task.triangle(3));
        assertEquals("triangle(4) â†’ 10", 10, task.triangle(4));
        assertEquals("triangle(5) â†’ 15", 15, task.triangle(5));
        assertEquals("triangle(6) â†’ 21", 21, task.triangle(6));
        assertEquals("triangle(7) â†’ 28", 28, task.triangle(7));

    }
}
