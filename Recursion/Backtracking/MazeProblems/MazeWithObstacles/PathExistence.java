package MazeWithObstacles;

public class PathExistence{
  public static void main(String[] args){
     boolean[][] board = {
                                            {true, true, false},
                                            {false, false, true},
                                            {true, true, true}
                                        };
     for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
       if(i == 0 && j == 0){
         System.out.print("A  ");
          continue;
       }
       if(!board[i][j]){
         System.out.print("X  ");
       }else{
         if(i == board.length-1 && j == board[j].length-1){
           System.out.print("B  ");
           break;
         }else{
          System.out.print(".  ");
        }   
      }  
    }
     System.out.println();
  }
    System.out.println("Is there any path from A to B ? : "+doesPathExist("", board, 0,0));
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
