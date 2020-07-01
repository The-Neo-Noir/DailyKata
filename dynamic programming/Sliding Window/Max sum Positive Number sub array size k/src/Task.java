public class Task {
    public int[] subarray(int[] in, int k) {
        // [2,1,5,1,3,2]
        int max = 0;
        int start = 0;
        int endIndex = 0;
        for (int i = 0; i <= in.length - k; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += in[i + j];
            }
            if (sum > max) {
                max = sum;
                start = i;
                endIndex = i + k - 1;
            }
        }
        return new int[]{start, endIndex};
    }
}