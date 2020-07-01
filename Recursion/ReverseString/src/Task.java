public class Task {

    public String revString(String string) {
        if(string.length()==0){
            return string;
        }else{
           return string.charAt(string.length()-1)+revString(string.substring(0,string.length()-1));
        }
    }
}