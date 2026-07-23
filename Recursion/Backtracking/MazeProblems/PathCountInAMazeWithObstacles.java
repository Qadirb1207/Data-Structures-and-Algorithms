package MazeProblems;

public class PathCountInAMazeWithObstacles{
  public static void main(String[] args){
  boolean[][] board = {
                                            {true, true, false},
                                            {true, false, true},
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
  System.out.println();
  System.out.println();
  System.out.println("Total paths in the maze from A to B are : "+countPaths(board, 0, 0));
  
  }
  
  public static int countPaths(boolean[][] maze, int r, int c){
    if(r == maze.length-1 && c == maze[0].length-1){
      return 1;
    }
    
    if(!maze[r][c]){
      return 0;
    }
    int leftCount = 0, rightCount = 0;
    if(r < maze.length-1){
      leftCount += countPaths(maze, r+1, c);
    }
    if(c < maze[0].length-1){
      rightCount += countPaths(maze, r, c+1);
    }
    return leftCount+rightCount;
  }
}
