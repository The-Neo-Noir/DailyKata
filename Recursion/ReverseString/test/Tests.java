import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSolution() {
        Task t = new Task();

        assertEquals("abc", t.revString("cba"));
        assertEquals("ab", t.revString("ba"));
        assertEquals("aB", t.revString("Ba"));
        assertEquals("AB", t.revString("BA"));
        assertEquals("A", t.revString("A"));
        assertEquals("C A", t.revString("A C"));
        assertEquals("C 3#", t.revString("#3 C"));
        assertEquals("  ", t.revString("  "));
        assertEquals("", t.revString(""));

    }
}