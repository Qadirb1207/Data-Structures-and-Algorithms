package MazeProblems;

public class MazeWithObstacles{
  public static void main(String[] args){
    boolean[][] board = {
                                            {true, true, false},
                                            {true, false, true},
                                            {true, true, true}
                                        };
        System.out.println(totalPaths(0, 0, board));
  }
  
  public static int totalPaths(int r, int c, boolean[][] maze){
      if(r == maze.length-1 && c == maze[0].length-1){
        return 1;
      }
      if(!maze[r][c]){
        return 0;
      }
    
      int leftPaths = 0, rightPaths = 0;
      if(r < maze.length-1){
        leftPaths += totalPaths(r+1, c, maze);
      }
      if(c < maze[0].length-1){
        rightPaths += totalPaths(r, c+1, maze);
      } 
      return leftPaths+rightPaths; 
  }
}
