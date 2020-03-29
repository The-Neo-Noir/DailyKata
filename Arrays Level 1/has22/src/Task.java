public class Task {
    public boolean has22(int[] nums) {
        boolean result=true;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==2){
                if(i-1>=0 && nums[i-1]==2 ){
                    result |= true;
                }else{
                    result |=false;
                }
            }
        }
        return result;
    }

}