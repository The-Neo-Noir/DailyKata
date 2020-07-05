public class Task {
    public int countHi2(String str) {
        if(str.length()<3){
            return str.equals("hi")? 1 : 0;
        }else{
            int count=0;
            String ls=str.substring(str.length()-3);
            if(ls.charAt(0)!='x'&& ls.substring(1).equals("hi")){
                count=1;
            }
            return count+ countHi2(str.substring(0, str.length()-1));
        }
    }
}