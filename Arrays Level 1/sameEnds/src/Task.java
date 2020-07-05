public class Task {
    public boolean sameEnds(int[] nums, int len) {
        boolean result = true;
        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            if (nums[i] != nums[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}