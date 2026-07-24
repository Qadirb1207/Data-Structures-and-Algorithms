package MazeProblems;

public class PrintingPathsWithKMoves{
  public static void main(String[] args){
      boolean[][] board = {
                                            {true, true, true, true},
                                            {true, true, true, true},
                                            {true, true, true, true},
                                            {true, true, true, true}
                                        };
                                      
          pathWithKMoves("", board, 0, 0, 6, 0);
  }
  
  public static void pathWithKMoves(String path, boolean[][] maze, int r, int c, int k, int move){
    if(r == maze.length-1 && c == maze[0].length-1){
      if(move == k){
        System.out.println(path);
      }
      return;
    }
    
    if(!maze[r][c]){
      return;
    }
    
    
    if(c < maze[0].length-1){
      pathWithKMoves(path+'R', maze, r, c+1, k, move+1);
    }
    if(r < maze.length-1){
      pathWithKMoves(path+'D', maze, r+1, c, k, move+1);
    } 
  }
}
