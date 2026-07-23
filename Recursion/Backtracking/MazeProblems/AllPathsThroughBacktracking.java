package MazeProblems;

public class AllPathsThroughBacktracking{
  public static void main(String[] args){
   boolean[][] board = {
                                            {true, true, true},
                                            {true, true, true},
                                            {true, true, true}
                                        };
    allPaths("", board, 0, 0);
  }
  
  public static void allPaths(String path, boolean[][] maze, int r, int c){
    if(r == maze.length-1 && c == maze[0].length-1){
      System.out.println(path);
      return;
    }
    
    if(!maze[r][c]){
      return;
    }
    maze[r][c] = false; /*mark the cell at which you're currently at as visited (i.e false means visited and true means
    unvisited)*/
    
    
    if(r < maze.length-1){
      allPaths(path+"Down, ", maze, r+1, c);
    }
    if(c < maze[0].length-1){
      allPaths(path+"Right, ", maze, r, c+1);
    }
    
    if(r > 0){
      allPaths(path+"Up, ", maze, r-1, c);
    }
    if(c > 0){
      allPaths(path+"Left, ", maze, r, c-1); 
    }
    /*mark the cell which you are leaving as unvisited for future function calls OR Simply undo the changes which 
    current method call made*/
    
    maze[r][c] = true;
  }
}
