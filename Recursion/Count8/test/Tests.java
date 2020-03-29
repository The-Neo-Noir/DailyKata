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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>count8(8) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count8(818) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>count8(8818) → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>count8(8088) → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>count8(123) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count8(81238) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>count8(88788) → 6</td><td>6</td><td>OK</td><td></td></tr><tr><td>count8(8234) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count8(2348) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count8(23884) → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>count8(0) → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count8(1818188) → 5</td><td>5</td><td>OK</td><td></td></tr><tr><td>count8(8818181) → 5</td><td>5</td><td>OK</td><td></td></tr><tr><td>count8(1080) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count8(188) → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>count8(88888) → 9</td><td>9</td><td>OK</td><td></td></tr><tr><td>count8(9898) → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>count8(78) → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("count8(8) â†’ 1", 1, task.count8(8));
        assertEquals("count8(818) â†’ 2", 2, task.count8(818));
        assertEquals("count8(8818) â†’ 4", 4, task.count8(8818));
        assertEquals("count8(8088) â†’ 4", 4, task.count8(8088));
        assertEquals("count8(123) â†’ 0", 0, task.count8(123));
        assertEquals("count8(81238) â†’ 2", 2, task.count8(81238));
        assertEquals("count8(88788) â†’ 6", 6, task.count8(88788));
        assertEquals("count8(8234) â†’ 1", 1, task.count8(8234));
        assertEquals("count8(2348) â†’ 1", 1, task.count8(2348));
        assertEquals("count8(23884) â†’ 3", 3, task.count8(23884));
        assertEquals("count8(0) â†’ 0", 0, task.count8(0));
        assertEquals("count8(1818188) â†’ 5", 5, task.count8(1818188));
        assertEquals("count8(8818181) â†’ 5", 5, task.count8(8818181));
        assertEquals("count8(1080) â†’ 1", 1, task.count8(1080));
        assertEquals("count8(188) â†’ 3", 3, task.count8(188));
        assertEquals("count8(88888) â†’ 9", 9, task.count8(88888));
        assertEquals("count8(9898) â†’ 2", 2, task.count8(9898));
        assertEquals("count8(78) â†’ 1", 1, task.count8(78));

    }
}