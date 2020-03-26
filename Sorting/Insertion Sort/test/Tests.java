import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {
  @Test
  public void testSolution() {

    Task t = new Task();
    int[] ints = {1, 2, 3, 4};
    int[] arr = {4, 3, 2, 1};
    t.sortInsertion(arr);

    assertArrayEquals(ints, arr);

    int[] ints1 = {1, 3, 4, 4};
    int[] arr1 = {4, 3, 4, 1};
    t.sortInsertion(arr1);
    assertArrayEquals(ints1, arr1);

    int[] ints2 = {1, 2, 4, 4};
    int[] arr2 = {1, 2, 4, 4};
    t.sortInsertion(arr2);
    assertArrayEquals(ints2, arr2);



    int[] ints3 = {1};
    int[] arr3 = {1};
    t.sortInsertion(arr3);
    assertArrayEquals(ints3, arr3);

    int[] ints4 = {1,1};
    int[] arr4 = {1,1};
    t.sortInsertion(arr4);
    assertArrayEquals(ints4, arr4);

  }


}