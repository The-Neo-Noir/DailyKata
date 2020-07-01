
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
    @Test
    public void testn() {
        Task task = new Task();
        assertEquals("extraEnd(\"Hello\") → \"lololo\"", "lololo", task.extraEnd("Hello"));
        assertEquals("extraEnd(\"ab\") → \"ababab\"", "ababab", task.extraEnd("ab"));
        assertEquals("extraEnd(\"Hi\") → \"HiHiHi\"", "HiHiHi", task.extraEnd("Hi"));
        assertEquals("extraEnd(\"Candy\") → \"dydydy\"", "dydydy", task.extraEnd("Candy"));
        assertEquals("extraEnd(\"Code\") → \"dedede\"", "dedede", task.extraEnd("Code"));

    }
}