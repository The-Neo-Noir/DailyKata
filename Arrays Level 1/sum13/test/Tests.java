import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSolution() {

        Task t = new Task();
        assertEquals(6, t.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, t.sum13(new int[]{1, 1}));
        assertEquals(6, t.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(4, t.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(3, t.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        assertEquals(0, t.sum13(new int[]{}));
        assertEquals(0, t.sum13(new int[]{13}));
        assertEquals(0, t.sum13(new int[]{13, 13}));
        assertEquals(0, t.sum13(new int[]{13, 0, 13}));
        assertEquals(0, t.sum13(new int[]{13, 1, 13}));
        assertEquals(14, t.sum13(new int[]{5, 7, 2}));
        assertEquals(5, t.sum13(new int[]{5, 13, 2}));
        assertEquals(0, t.sum13(new int[]{0}));
        assertEquals(0, t.sum13(new int[]{13,0}));
    }
}