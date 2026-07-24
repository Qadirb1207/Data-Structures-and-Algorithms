package BacktrackingWithMaze;

public class PathWithStepNumbers{
  public static void main(String[] args){
  boolean[][] board = {
                                            {true, true, true},
                                            {true, true, true},
                                            {true, true, true}
                                        };
    
    int[][] paths = new int[board.length][board[0].length];
    
    pathWithStepNums(paths, 0, 0, 1);
  }
  
  public static void pathWithStepNums(int[][] paths, int r, int c, int move){
    if(r == paths.length-1 && c == paths[0].length-1){
      for(int i = 0; i < paths.length; i++){
        for(int j = 0; j < paths[i].length; j++){
          System.out.print(paths[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      System.out.println();
      move = 0;
      return;
    }
    
    if(paths[r][c] != 0){
      return;
    }
    
    paths[r][c] = move;
    
    if(r < paths.length-1){
      pathWithStepNums(paths, r+1, c, move+1);
    }
    if(c < paths[0].length-1){
     pathWithStepNums(paths, r, c+1, move+1);
    }
    
    if( r > 0){
     pathWithStepNums(paths, r-1, c, move+1);
    }
    if(c > 0){
     pathWithStepNums(paths, r, c-1, move+1);
    }
    paths[r][c] = 0;
  }
}
