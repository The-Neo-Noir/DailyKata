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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>changePi(\"xpix\") → \"x3.14x\"</td><td>\"x3.14x\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"pipi\") → \"3.143.14\"</td><td>\"3.143.14\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"pip\") → \"3.14p\"</td><td>\"3.14p\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"pi\") → \"3.14\"</td><td>\"3.14\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"hip\") → \"hip\"</td><td>\"hip\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"p\") → \"p\"</td><td>\"p\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"x\") → \"x\"</td><td>\"x\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"\") → \"\"</td><td>\"\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"pixx\") → \"3.14xx\"</td><td>\"3.14xx\"</td><td>OK</td><td></td></tr><tr><td>changePi(\"xyzzy\") → \"xyzzy\"</td><td>\"xyzzy\"</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("changePi(\"xpix\") â†’ \"x3.14x\"", "x3.14x", task.changePi("xpix"));
        assertEquals("changePi(\"pipi\") â†’ \"3.143.14\"", "3.143.14", task.changePi("pipi"));
        assertEquals("changePi(\"pip\") â†’ \"3.14p\"", "3.14p", task.changePi("pip"));
        assertEquals("changePi(\"pi\") â†’ \"3.14\"", "3.14", task.changePi("pi"));
        assertEquals("changePi(\"hip\") â†’ \"hip\"", "hip", task.changePi("hip"));
        assertEquals("changePi(\"p\") â†’ \"p\"", "p", task.changePi("p"));
        assertEquals("changePi(\"x\") â†’ \"x\"", "x", task.changePi("x"));
        assertEquals("changePi(\"\") â†’ \"\"", "", task.changePi(""));
        assertEquals("changePi(\"pixx\") â†’ \"3.14xx\"", "3.14xx", task.changePi("pixx"));
        assertEquals("changePi(\"xyzzy\") â†’ \"xyzzy\"", "xyzzy", task.changePi("xyzzy"));

    }
}