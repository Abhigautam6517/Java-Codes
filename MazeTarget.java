import java.util.concurrent.CountDownLatch;

public class MazeTarget {
    static int CountPath(int startRow,int startCol,int endRow,int endCol){
        if(startRow==endRow || startCol==endCol){
            return 1;
        }
        if(startRow>endRow || startCol>endCol){
            return 0;
        }

        int answer = CountPath(startRow+1, startCol, endRow, endCol) + CountPath(startRow, startCol+1, endRow, endCol);
        return answer;
    }
    public static void main(String[] args) {
        int startRow = 0;
        int startCol = 0;
        int endRow = 3;
        int endCol = 3;
        int result = CountPath(startRow,startCol,endCol-1,endCol-1);
        System.out.println(result);
    }
    
}
