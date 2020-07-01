public class Task {
    public int[] reverse3(int[] nums) {
        int newA[] = new int[nums.length];
        newA[0] = nums[2];
        newA[1] = nums[1];
        newA[2] = nums[0];
        return newA;
    }

}