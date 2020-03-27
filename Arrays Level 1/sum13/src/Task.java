public class Task {
    public int sum13(int[] nums) {
        int sum=0;
        if(nums.length==0) return sum;
        int last=nums[0];
        sum=last==13 ? 0: last;
        for (int i=1;i<nums.length;i++) {
            if(last==13 || nums[i]==13 ) {last=nums[i];continue;}
            else {sum+=nums[i];last=nums[i];}
        }
        return sum;
    }
}