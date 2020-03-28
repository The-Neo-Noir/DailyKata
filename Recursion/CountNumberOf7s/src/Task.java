public class Task {
    public int count7(int n) {
        if (n == 0) {
            return 0;
        } else {
            int da = n % 10 == 7 ? 1 : 0;
            return da + count7(n / 10);
        }
    }
}