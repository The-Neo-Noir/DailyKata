public class Task {
    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        } else {
            boolean val = false;
            if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
                val = true;
            }
            if (str.length() % 2 == 0) {
                val = val & nestParen(str.substring(1, str.length() - 1));
            } else {
                val = val & false;
            }
            return val;
        }
    }
}