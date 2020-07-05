public class Task {
    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            return ((str.charAt(0) + "").equals("x") ? "y" : str.charAt(0) + "") + changeXY(str.substring(1));
        }
    }
}