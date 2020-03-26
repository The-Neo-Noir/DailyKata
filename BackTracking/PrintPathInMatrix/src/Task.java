
public class Task {

    public static void main(String[] args) {
        Task task = new Task();
        Character[][] characters = new Character[][]{{'A', 'B','C'}, {'D', 'E','F'},{'G','H','I'}};
        task.printPath(characters);

    }
    public void printPath(Character mat[][]){
     //   ['A','B',E]
     //   ['C','D',F]
        StringBuffer sb = new StringBuffer();
        build(mat, "", 0, 0, sb);
        System.out.println(sb.toString());

    }
    private void  build(Character mat[][],String prefix, int row, int col,StringBuffer sb){

        if(row<mat.length) {
            if (col < mat[row].length) {
                // right  0,1,2<,3
                System.out.println(row + " " + col);
                String toRight = prefix + mat[row][col];
                String toBelow = prefix + mat[row][col];
                if (row == mat.length - 1 && col == mat[row].length - 1) {
                    sb.append(toRight + ",");
                    sb.append(toBelow + ",");
                }
                build(mat, toRight, row, col + 1, sb);// right
                build(mat, toBelow, row + 1, col, sb);// low
            }
        }
    }
}