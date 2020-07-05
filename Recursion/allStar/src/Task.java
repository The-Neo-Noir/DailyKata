public class Task {
    public String allStar(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return str.charAt(0) + "";
        } else {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }
}