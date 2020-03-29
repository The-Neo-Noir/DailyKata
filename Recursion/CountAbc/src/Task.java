public class Task {
    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        } else {
            int count = str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba") ? 1 : 0;
            return count + countAbc(str.substring(1));
        }
    }

}