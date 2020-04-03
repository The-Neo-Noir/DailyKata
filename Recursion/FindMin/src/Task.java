public class Task {

    public int findMin(int elemts[],int index){
   //     23,12,3,1;
        if(index==elemts.length-1){
            return elemts[elemts.length-1];
        }else{
            int min = Math.min(elemts[index], elemts[index + 1]);
            if(elemts[index+1]!=min){ int temp= elemts[index];elemts[index]=elemts[index+1];elemts[index+1]=temp;}
            return findMin(elemts,index+1);
        }
    }
}