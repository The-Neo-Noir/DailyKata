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
        String html = "<table><tbody><tr><th>Expected</th><th>Run</th><th></th><th></th></tr><tr><td>parenBit(\"xyz(abc)123\") → \"(abc)\"</td><td>\"(abc)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"x(hello)\") → \"(hello)\"</td><td>\"(hello)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"(xy)1\") → \"(xy)\"</td><td>\"(xy)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"not really (possible)\") → \"(possible)\"</td><td>\"(possible)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"(abc)\") → \"(abc)\"</td><td>\"(abc)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"(abc)xyz\") → \"(abc)\"</td><td>\"(abc)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"(abc)x\") → \"(abc)\"</td><td>\"(abc)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"(x)\") → \"(x)\"</td><td>\"(x)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"()\") → \"()\"</td><td>\"()\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"res (ipsa) loquitor\") → \"(ipsa)\"</td><td>\"(ipsa)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"hello(not really)there\") → \"(not really)\"</td><td>\"(not really)\"</td><td>OK</td><td></td></tr><tr><td>parenBit(\"ab(ab)ab\") → \"(ab)\"</td><td>\"(ab)\"</td><td>OK</td><td></td></tr><tr><td><center>other tests</center></td><td></td><td>OK</td><td></td></tr></tbody></table>";
        ConvertTotable.fsn(html, f.getAbsolutePath());
    }

    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("parenBit(\"xyz(abc)123\") â†’ \" (abc) \"", "(abc)", task.parenBit("xyz(abc)123"));
        assertEquals("parenBit(\"x(hello)\") â†’ \" (hello) \"", "(hello)", task.parenBit("x(hello)"));
        assertEquals("parenBit(\" (xy) 1 \") â†’ \" (xy)\"", "(xy)", task.parenBit("(xy)1"));
        assertEquals("parenBit(\"not really(possible)\") â†’ \" (possible) \"", "(possible)", task.parenBit("not really (possible)"));
        assertEquals("parenBit(\" (abc) \") â†’ \" (abc) \"", "(abc)", task.parenBit("(abc)"));
        assertEquals("parenBit(\" (abc) xyz \") â†’ \" (abc) \"", "(abc)", task.parenBit("(abc)xyz"));
        assertEquals("parenBit(\" (abc) x \") â†’ \" (abc) \"", "(abc)", task.parenBit("(abc)x"));
        assertEquals("parenBit(\" (x) \") â†’ \" (x) \"", "(x)", task.parenBit("(x)"));
        assertEquals("parenBit(\" () \") â†’ \" () \"", "()", task.parenBit("()"));
        assertEquals("parenBit(\"res(ipsa)loquitor\") â†’ \" (ipsa) \"", "(ipsa)", task.parenBit("res (ipsa) loquitor"));
        assertEquals("parenBit(\"hello(not really)there\") â†’ \" (not really)\"", "(not really)", task.parenBit("hello(not really)there"));
        assertEquals("parenBit(\"ab(ab)ab\") â†’ \" (ab) \"", "(ab)", task.parenBit("ab(ab)ab"));

    }
}