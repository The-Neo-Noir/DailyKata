public class Task {
    public boolean no14(int[] nums) {
        boolean result = true;
        boolean ones=false;
        boolean fours = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones=true;
            }
            if (nums[i] == 4) {
                fours=true;
            }
        }
        if(ones & fours){
            result=false;
        }
        return result;
    }
}