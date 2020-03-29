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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>fibonacci(0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>fibonacci(1) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>fibonacci(2) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>fibonacci(3) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>fibonacci(4) → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>fibonacci(5) → 5</td><td>5</td><td>OK</td><td></td></tr><tr><td>fibonacci(6) → 8</td><td>8</td><td>OK</td><td></td></tr><tr><td>fibonacci(7) → 13</td><td>13</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("fibonacci(0) â†’ 0", 0, task.fibonacci(0));
        assertEquals("fibonacci(1) â†’ 1", 1, task.fibonacci(1));
        assertEquals("fibonacci(2) â†’ 1", 1, task.fibonacci(2));
        assertEquals("fibonacci(3) â†’ 2", 2, task.fibonacci(3));
        assertEquals("fibonacci(4) â†’ 3", 3, task.fibonacci(4));
        assertEquals("fibonacci(5) â†’ 5", 5, task.fibonacci(5));
        assertEquals("fibonacci(6) â†’ 8", 8, task.fibonacci(6));
        assertEquals("fibonacci(7) â†’ 13", 13, task.fibonacci(7));
    }
}