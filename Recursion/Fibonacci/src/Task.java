public class Task {
    public int fibonacci(int nth) {
        if (nth == 0) return 0;
        else if (nth == 1) return 1;
        else return fibonacci(nth - 1) + fibonacci(nth - 2);
    }

}