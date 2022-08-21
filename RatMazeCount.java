public class RatMazeCount {

    public static int mazeCount(int maze[][],int row,int col){
        if(row==maze.length-1 &&  col==maze.length-1){
            return 1;
        }
        if(row>maze.length-1 || col > maze.length-1 || maze[row][col]==0){
            return 0;
        }
        int answer = mazeCount(maze, row+1, col) + mazeCount(maze, row, col+1);
        return answer;

    }
    public static void main(String[] args) {
        int maze[][]={
            {1,1,1,1},
            {1,1,0,1},
            {0,1,1,1},
            {1,1,1,1}
        };
        int row = 0;
        int col = 0;
        int result = mazeCount(maze, row, col);
        System.out.println(result);
    }
    
}
