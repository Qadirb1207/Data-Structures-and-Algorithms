package BacktrackingWithMaze;

import java.util.ArrayList;
public class RatInAMazeWithObstacles{
  public static void main(String[] args){
   boolean[][] board = {
                                            {true, false, false},
                                            {true, true, true},
                                            {true, true, true}
                                        };
      for(int i = 0; i < board.length; i++){
     for(int j = 0; j < board[0].length; j++){
       if(i == 0 && j == 0){
         System.out.print("R  ");
          continue;
       }
       if(!board[i][j]){
         System.out.print("X  ");
       }else{
         if(i == board.length-1 && j == board[j].length-1){
           System.out.print("F  ");
           break;
         }else{
          System.out.print(".  ");
        }   
      }  
    }
     System.out.println();
  }
  ArrayList<String> paths = allPathsInMaze("", board, 0, 0);
  System.out.println();
  
  System.out.println("All the paths for R(Rat) to go to its F(Food) are:\n"+paths);
  }
  
  public static ArrayList<String> allPathsInMaze(String path, boolean[][] maze, int r, int c){
    if(r == maze.length-1 && c == maze[0].length-1){
      ArrayList<String> list = new ArrayList<>();
      list.add(path);
      return list;
    }
    
    if(!maze[r][c]){
      return new ArrayList<>();
    }
    ArrayList<String> allPaths = new ArrayList<>();
    maze[r][c] = false;
    if(r < maze.length-1){
      allPaths.addAll(allPathsInMaze(path+'D', maze, r+1, c));
    }
    if(c < maze[0].length-1){
      allPaths.addAll(allPathsInMaze(path+'R', maze, r, c+1));
    }
    
    if(r > 0){
      allPaths.addAll(allPathsInMaze(path+'U', maze, r-1, c));
    }
    if(c > 0){
      allPaths.addAll(allPathsInMaze(path+'L', maze, r, c-1));
    }
    
    maze[r][c] = true;
    return allPaths;
  }
}
