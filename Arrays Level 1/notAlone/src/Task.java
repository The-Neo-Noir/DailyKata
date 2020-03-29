public class Task {
    public int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2) return nums;
        for (int i = 1; i < nums.length - 1; i++) {
            int max = Math.max(nums[i - 1], nums[i + 1]);
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = max;
            }
        }
        return nums;
    }
}