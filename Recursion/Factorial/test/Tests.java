import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSolution() {

        Task t = new Task();
        int factorial = t.factorial(1);
        assertEquals(1, factorial);

        int factorial2 = t.factorial(8);
        assertEquals(40320, factorial2);

        int factorial23 = t.factorial(5);
        assertEquals(120, factorial23);

        int factorial24 = t.factorial(0);
        assertEquals(1, factorial24);

        int factorial25 = t.factorial(2);
        assertEquals(2, factorial25);

    }
}