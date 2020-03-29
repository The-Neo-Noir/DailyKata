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
        String d = "\"sone\"".replaceAll("\"", "\\\\\"");

        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>strCount(\"catcowcat\", \"cat\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>strCount(\"catcowcat\", \"cow\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>strCount(\"catcowcat\", \"dog\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>strCount(\"cacatcowcat\", \"cat\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>strCount(\"xyx\", \"x\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>strCount(\"iiiijj\", \"i\") → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>strCount(\"iiiijj\", \"ii\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>strCount(\"iiiijj\", \"iii\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>strCount(\"iiiijj\", \"j\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>strCount(\"iiiijj\", \"jj\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>strCount(\"aaabababab\", \"ab\") → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td>strCount(\"aaabababab\", \"aa\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>strCount(\"aaabababab\", \"a\") → 6</td><td>6</td><td>OK</td><td></td></tr><tr><td>strCount(\"aaabababab\", \"b\") → 4</td><td>4</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("strCount(\"catcowcat\", \"cat\") â†’ 2", 2, task.strCount("catcowcat", "cat"));
        assertEquals("strCount(\"catcowcat\", \"cow\") â†’ 1", 1, task.strCount("catcowcat", "cow"));
        assertEquals("strCount(\"catcowcat\", \"dog\") â†’ 0", 0, task.strCount("catcowcat", "dog"));
        assertEquals("strCount(\"cacatcowcat\", \"cat\") â†’ 2", 2, task.strCount("cacatcowcat", "cat"));
        assertEquals("strCount(\"xyx\", \"x\") â†’ 2", 2, task.strCount("xyx", "x"));
        assertEquals("strCount(\"iiiijj\", \"i\") â†’ 4", 4, task.strCount("iiiijj", "i"));
        assertEquals("strCount(\"iiiijj\", \"ii\") â†’ 2", 2, task.strCount("iiiijj", "ii"));
        assertEquals("strCount(\"iiiijj\", \"iii\") â†’ 1", 1, task.strCount("iiiijj", "iii"));
        assertEquals("strCount(\"iiiijj\", \"j\") â†’ 2", 2, task.strCount("iiiijj", "j"));
        assertEquals("strCount(\"iiiijj\", \"jj\") â†’ 1", 1, task.strCount("iiiijj", "jj"));
        assertEquals("strCount(\"aaabababab\", \"ab\") â†’ 4", 4, task.strCount("aaabababab", "ab"));
        assertEquals("strCount(\"aaabababab\", \"aa\") â†’ 1", 1, task.strCount("aaabababab", "aa"));
        assertEquals("strCount(\"aaabababab\", \"a\") â†’ 6", 6, task.strCount("aaabababab", "a"));
        assertEquals("strCount(\"aaabababab\", \"b\") â†’ 4", 4, task.strCount("aaabababab", "b"));

    }
}