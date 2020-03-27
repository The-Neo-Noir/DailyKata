public class Task {
    public int countEvens(int[] nums) {
        int count=0;
        for (Integer in : nums) {
            if(in%2==0) count++;
        }
        return count;
    }
}