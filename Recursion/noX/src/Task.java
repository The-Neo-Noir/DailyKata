public class Task {
    public String noX(String str) {
        if(str.length()==0){
            return "" ;
        }else{
            return (str.charAt(0)=='x' ? "" : str.charAt(0)+"")+ noX(str.substring(1));
        }
    }
}