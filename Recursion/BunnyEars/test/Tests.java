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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>bunnyEars(0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>bunnyEars(1) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>bunnyEars(2) → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>bunnyEars(3) → 6</td><td>6</td><td>OK</td><td></td></tr><tr><td>bunnyEars(4) → 8</td><td>8</td><td>OK</td><td></td></tr><tr><td>bunnyEars(5) → 10</td><td>10</td><td>OK</td><td></td></tr><tr><td>bunnyEars(12) → 24</td><td>24</td><td>OK</td><td></td></tr><tr><td>bunnyEars(50) → 100</td><td>100</td><td>OK</td><td></td></tr><tr><td>bunnyEars(234) → 468</td><td>468</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("bunnyEars(0) â†’ 0", 0, task.bunnyEars(0));
        assertEquals("bunnyEars(1) â†’ 2", 2, task.bunnyEars(1));
        assertEquals("bunnyEars(2) â†’ 4", 4, task.bunnyEars(2));
        assertEquals("bunnyEars(3) â†’ 6", 6, task.bunnyEars(3));
        assertEquals("bunnyEars(4) â†’ 8", 8, task.bunnyEars(4));
        assertEquals("bunnyEars(5) â†’ 10", 10, task.bunnyEars(5));
        assertEquals("bunnyEars(12) â†’ 24", 24, task.bunnyEars(12));
        assertEquals("bunnyEars(50) â†’ 100", 100, task.bunnyEars(50));
        assertEquals("bunnyEars(234) â†’ 468", 468, task.bunnyEars(234));

    }
}