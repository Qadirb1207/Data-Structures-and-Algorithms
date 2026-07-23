package MazeProblems;

public class PathExistence{
  public static void main(String[] args){
     boolean[][] board = {
                                            {true, true, false},
                                            {false, false, true},
                                            {true, true, true}
                                        };
      System.out.println(doesPathExist("", board, 0,0));
  }
  
  public static boolean doesPathExist(String path, boolean[][] board, int r, int c){
    if(r == board.length-1 && c == board[0].length-1){
        return !path.isEmpty();
    }
    
    if(!board[r][c]){
      return false;
    }
    
    if(r < board.length-1){
      return doesPathExist(path+'R', board, r, c+1);
    }
    if(c < board[0].length-1){
      return doesPathExist(path+'R', board, r+1, c);
    }
    return false;
  }
  
}
