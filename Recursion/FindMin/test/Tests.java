import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSolution() {

        Task task = new Task();
        assertEquals(4, task.findMin(new int[]{6, 9, 6, 7, 4}, 0));
        assertEquals(-2, task.findMin(new int[]{6, 9, 6, -2, 4}, 0));
        assertEquals(1, task.findMin(new int[]{6, 6, 6, 7, 1}, 0));
        assertEquals(1, task.findMin(new int[]{1, 9, 5, 3, 3}, 0));
        assertEquals(0, task.findMin(new int[]{0, 9, 6, 7, 4}, 0));
        assertEquals(0, task.findMin(new int[]{0}, 0));

    }
}