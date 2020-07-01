public class Task {
    public String changePi(String str) {
        if (str.length() < 2) {
            return str; // Don't forget this one , see how it is differnt
        } else {
            if (str.substring(0, 2).equals("pi")) {
                return "3.14" + changePi(str.substring(2));
            } else {
                return (str.charAt(0) + "") + changePi(str.substring(1));
            }
        }
    }
}