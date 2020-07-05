public class Task {

    public int findMin(int elemts[],int index){
        if (index == elemts.length - 1) {
            return elemts[index];
        } else {
            int ret = findMin(elemts, index + 1);
            if (ret < elemts[index]) return ret;
            else return elemts[index];
        }
    }
}