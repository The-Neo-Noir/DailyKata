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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>countX(\"xxhixx\") → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>countX(\"xhixhix\") → 3</td><td>3</td><td>OK</td><td></td></tr><tr><td>countX(\"hi\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countX(\"h\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countX(\"x\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>countX(\"\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countX(\"hihi\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countX(\"hiAAhi12hi\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("countX(\"xxhixx\") â†’ 4", 4, task.countX("xxhixx"));
        assertEquals("countX(\"xhixhix\") â†’ 3", 3, task.countX("xhixhix"));
        assertEquals("countX(\"hi\") â†’ 0", 0, task.countX("hi"));
        assertEquals("countX(\"h\") â†’ 0", 0, task.countX("h"));
        assertEquals("countX(\"x\") â†’ 1", 1, task.countX("x"));
        assertEquals("countX(\"\") â†’ 0", 0, task.countX(""));
        assertEquals("countX(\"hihi\") â†’ 0", 0, task.countX("hihi"));
        assertEquals("countX(\"hiAAhi12hi\") â†’ 0", 0, task.countX("hiAAhi12hi"));

    }
}