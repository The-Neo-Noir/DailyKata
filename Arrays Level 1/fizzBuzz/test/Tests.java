
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testn(){
    Task task = new Task();
    assertArrayEquals("fizzBuzz(1, 6) → [\"1\", \"2\", \"Fizz\", \"4\", \"Buzz\"]",new String[]{"1", "2", "Fizz", "4", "Buzz"},task.fizzBuzz(1, 6));
    assertArrayEquals("fizzBuzz(1, 8) → [\"1\", \"2\", \"Fizz\", \"4\", \"Buzz\", \"Fizz\", \"7\"]",new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},task.fizzBuzz(1, 8));
    assertArrayEquals("fizzBuzz(1, 11) → [\"1\", \"2\", \"Fizz\", \"4\", \"Buzz\", \"Fizz\", \"7\", \"8\", \"Fizz\", \"Buzz\"]",new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},task.fizzBuzz(1, 11));
    assertArrayEquals("fizzBuzz(1, 16) → [\"1\", \"2\", \"Fizz\", \"4\", \"Buzz\", \"Fizz\", \"7\", \"8\", \"Fizz\", \"Buzz\", \"11\", \"Fizz\", \"13\", \"14\", \"FizzBuzz\"]",new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},task.fizzBuzz(1, 16));
    assertArrayEquals("fizzBuzz(1, 4) → [\"1\", \"2\", \"Fizz\"]",new String[]{"1", "2", "Fizz"},task.fizzBuzz(1, 4));
    assertArrayEquals("fizzBuzz(1, 2) → [\"1\"]",new String[]{"1"},task.fizzBuzz(1, 2));
    assertArrayEquals("fizzBuzz(50, 56) → [\"Buzz\", \"Fizz\", \"52\", \"53\", \"Fizz\", \"Buzz\"]",new String[]{"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},task.fizzBuzz(50, 56));
    assertArrayEquals("fizzBuzz(15, 17) → [\"FizzBuzz\", \"16\"]",new String[]{"FizzBuzz", "16"},task.fizzBuzz(15, 17));
    assertArrayEquals("fizzBuzz(30, 36) → [\"FizzBuzz\", \"31\", \"32\", \"Fizz\", \"34\", \"Buzz\"]",new String[]{"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},task.fizzBuzz(30, 36));
    assertArrayEquals("fizzBuzz(1000, 1006) → [\"Buzz\", \"1001\", \"Fizz\", \"1003\", \"1004\", \"FizzBuzz\"]",new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},task.fizzBuzz(1000, 1006));
    assertArrayEquals("fizzBuzz(99, 102) → [\"Fizz\", \"Buzz\", \"101\"]",new String[]{"Fizz", "Buzz", "101"},task.fizzBuzz(99, 102));
    assertArrayEquals("fizzBuzz(14, 20) → [\"14\", \"FizzBuzz\", \"16\", \"17\", \"Fizz\", \"19\"]",new String[]{"14", "FizzBuzz", "16", "17", "Fizz", "19"},task.fizzBuzz(14, 20));

  }
}