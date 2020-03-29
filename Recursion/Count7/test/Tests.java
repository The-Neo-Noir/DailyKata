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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>count11(\"11abc11\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>count11(\"abc11x11x11\") → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>count11(\"111\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count11(\"1111\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>count11(\"1\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count11(\"\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count11(\"hi\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count11(\"11x111x1111\") → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>count11(\"1x111\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>count11(\"1Hello1\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>count11(\"Hello\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("count11(\"11abc11\") â†’ 2", 2, task.count11("11abc11"));
        assertEquals("count11(\"abc11x11x11\") â†’ 3", 3, task.count11("abc11x11x11"));
        assertEquals("count11(\"111\") â†’ 1", 1, task.count11("111"));
        assertEquals("count11(\"1111\") â†’ 2", 2, task.count11("1111"));
        assertEquals("count11(\"1\") â†’ 0", 0, task.count11("1"));
        assertEquals("count11(\"\") â†’ 0", 0, task.count11(""));
        assertEquals("count11(\"hi\") â†’ 0", 0, task.count11("hi"));
        assertEquals("count11(\"11x111x1111\") â†’ 4", 4, task.count11("11x111x1111"));
        assertEquals("count11(\"1x111\") â†’ 1", 1, task.count11("1x111"));
        assertEquals("count11(\"1Hello1\") â†’ 0", 0, task.count11("1Hello1"));
        assertEquals("count11(\"Hello\") â†’ 0", 0, task.count11("Hello"));

    }
}