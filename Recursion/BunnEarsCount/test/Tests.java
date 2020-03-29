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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>bunnyEars2(0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>bunnyEars2(1) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>bunnyEars2(2) → 5</td><td>3</td><td>X</td><td></td></tr><tr><td>bunnyEars2(3) → 7</td><td>5</td><td>X</td><td></td></tr><tr><td>bunnyEars2(4) → 10</td><td>3</td><td>X</td><td></td></tr><tr><td>bunnyEars2(5) → 12</td><td>5</td><td>X</td><td></td></tr><tr><td>bunnyEars2(6) → 15</td><td>3</td><td>X</td><td></td></tr><tr><td>bunnyEars2(10) → 25</td><td>3</td><td>X</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>X</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("bunnyEars2(0) â†’ 0", 0, task.bunnyEars2(0));
        assertEquals("bunnyEars2(1) â†’ 2", 2, task.bunnyEars2(1));
        assertEquals("bunnyEars2(2) â†’ 5", 5, task.bunnyEars2(2));
        assertEquals("bunnyEars2(3) â†’ 7", 7, task.bunnyEars2(3));
        assertEquals("bunnyEars2(4) â†’ 10", 10, task.bunnyEars2(4));
        assertEquals("bunnyEars2(5) â†’ 12", 12, task.bunnyEars2(5));
        assertEquals("bunnyEars2(6) â†’ 15", 15, task.bunnyEars2(6));
        assertEquals("bunnyEars2(10) â†’ 25", 25, task.bunnyEars2(10));

    }
}