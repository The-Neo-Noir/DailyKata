public class Task {
    public String toLowerCase(String str) {
        String strs="";
        for(Character ch: str.toCharArray()){
            strs+= Character.toLowerCase(ch);
        }
        return strs;
        // Or you could just user str.toLowerCase();

    }
}