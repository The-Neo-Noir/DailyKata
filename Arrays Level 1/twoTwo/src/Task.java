public class Task {
    public boolean twoTwo(int[] nums) {
        if (nums.length < 2) return false;
        boolean result = true;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 2) {
                if (i + 1 < nums.length && nums[i + 1] == 2) {
                    result = true;
                    i = i + 2;
                } else {
                    return false;
                }
            } else {
                i++;
            }
        }
        return result;
    }

}