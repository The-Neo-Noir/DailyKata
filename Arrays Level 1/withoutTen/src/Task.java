public class Task {
    public int[] withoutTen(int[] nums) {
        int []result= new int [nums.length];
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=10) result[counter++]=nums[i];
        }
        return result;
    }
}