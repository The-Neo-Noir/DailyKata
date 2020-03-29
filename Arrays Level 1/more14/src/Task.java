public class Task {
    public boolean more14(int[] nums) {
        int nuOne = 0, nuFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) nuOne++;
            if (nums[i] == 4) nuFour++;
        }
        if (nuOne > nuFour) return true;
        return false;
    }
}