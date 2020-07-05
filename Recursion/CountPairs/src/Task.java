public class Task {
    public int countPairs(String str) {
        if(str.length()<3){
            return 0;
        }else{
            int count = str.substring(0,3).charAt(0)==str.substring(0,3).charAt(2)? 1: 0 ;
            return count+ countPairs(str.substring(1));
        }
    }
}