public class Task {
  public boolean array6(int[] nums, int index) {
        if(index==nums.length){
            return false;
        }else{
            return nums[index]==6 || array6(nums,index+1);
        }
    }
}