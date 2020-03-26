import java.util.ArrayList;
import java.util.List;

public class Task {
    public static List<Integer> sumConsecutives(List<Integer> s) {

        List<Integer> result = new ArrayList<>(s.size());
        if(s.size()==0) return result;
        int last=s.get(0);
        int lastcount=1;

        for(int i=1;i<s.size();i++){
            if(s.get(i)==last){
                lastcount++;
            }else{
                result.add(last*lastcount);
                last=s.get(i);
                lastcount=1;
            }
        }
        result.add(last*lastcount);
        return result;

    }
}