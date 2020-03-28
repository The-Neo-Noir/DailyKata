public class Task {
    public boolean modThree(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) |
                    (a % 2 != 0 && b % 2 != 0 && c % 2 != 0))
                return true;
        }
        return false;
    }
}