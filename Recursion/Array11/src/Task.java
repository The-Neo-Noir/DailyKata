public class Task {
    public int array11(int[] nums, int index) {
        if (index > nums.length - 1) {
            return 0;
        } else {
            return (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);
        }
    }
}