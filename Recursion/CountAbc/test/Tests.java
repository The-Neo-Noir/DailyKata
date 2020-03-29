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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>countAbc(\"abc\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>countAbc(\"abcxxabc\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>countAbc(\"abaxxaba\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>countAbc(\"ababc\") → 2</td><td>2</td><td>OK</td><td></td></tr><tr><td>countAbc(\"abxbc\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countAbc(\"aaabc\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>countAbc(\"hello\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countAbc(\"\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countAbc(\"ab\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countAbc(\"aba\") → 1</td><td>1</td><td>OK</td><td></td></tr><tr><td>countAbc(\"aca\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td>countAbc(\"aaa\") → 0</td><td>0</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("countAbc(\"abc\") â†’ 1", 1, task.countAbc("abc"));
        assertEquals("countAbc(\"abcxxabc\") â†’ 2", 2, task.countAbc("abcxxabc"));
        assertEquals("countAbc(\"abaxxaba\") â†’ 2", 2, task.countAbc("abaxxaba"));
        assertEquals("countAbc(\"ababc\") â†’ 2", 2, task.countAbc("ababc"));
        assertEquals("countAbc(\"abxbc\") â†’ 0", 0, task.countAbc("abxbc"));
        assertEquals("countAbc(\"aaabc\") â†’ 1", 1, task.countAbc("aaabc"));
        assertEquals("countAbc(\"hello\") â†’ 0", 0, task.countAbc("hello"));
        assertEquals("countAbc(\"\") â†’ 0", 0, task.countAbc(""));
        assertEquals("countAbc(\"ab\") â†’ 0", 0, task.countAbc("ab"));
        assertEquals("countAbc(\"aba\") â†’ 1", 1, task.countAbc("aba"));
        assertEquals("countAbc(\"aca\") â†’ 0", 0, task.countAbc("aca"));
        assertEquals("countAbc(\"aaa\") â†’ 0", 0, task.countAbc("aaa"));

    }
}
