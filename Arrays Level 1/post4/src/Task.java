public class Task {
    public int[] post4(int[] nums) {
        int index = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        if( index==-1 || index==nums.length-1) return new int[]{};
        int arr[] = new int[nums.length-(index+1)];
        int counter=0;
        for (int i = index+1; i <nums.length ; i++) {
            arr[counter++]=nums[i];
        }
        return arr;
    }
}