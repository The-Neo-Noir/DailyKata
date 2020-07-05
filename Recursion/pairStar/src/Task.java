public class Task {
    public String pairStar(String str) {
        if(str.length()==0){
            return "";
        }else{
            String firstCharacter=str.charAt(0)+"";
            String ret= pairStar(str.substring(1));
            if(!ret.equals("")){
                if((ret.charAt(0)+"").equals(firstCharacter)){
                    return firstCharacter+"*"+ret;
                }else{
                    return    firstCharacter+ret;
                }
            }else{
                return firstCharacter+ret;
            }
        }
    }
}