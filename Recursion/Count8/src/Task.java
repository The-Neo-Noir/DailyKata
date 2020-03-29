public class Task {
    public int count8(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n % 10 == 8) {
                int val = 1;
                if (n % 100 == 88) {
                    val = 2;
                }
                return val + count8(n / 10);
            } else {
                return count8(n / 10);
            }
        }
    }
}