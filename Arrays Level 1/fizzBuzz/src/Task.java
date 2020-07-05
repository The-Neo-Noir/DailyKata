public class Task {
    public String[] fizzBuzz(int start, int end) {
        String result[] = new String[end - start];
        int counter=0;
        for (int i = start; i < end; i++) {
            String val = i + "";
            if(i%3==0 && i%5==0){
                val = "FizzBuzz";
            } else if (i % 3 == 0) {
                val = "Fizz";
            } else if (i % 5 == 0) {
                val = "Buzz";
            }
            result[counter++] = val;
        }
        return result;
    }
}