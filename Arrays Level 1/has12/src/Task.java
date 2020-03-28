public class Task {
    public boolean has12(int[] nums) {
        boolean result=false;
        int index=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    index=i;
                    break;
                }
            }
            if(index==-1){
                return result;
            }else{
                for(int i=index+1;i<nums.length;i++){
                    if(nums[i]==2){
                        result=true;
                        break;
                    }
                }
                return result;
            }
    }
}