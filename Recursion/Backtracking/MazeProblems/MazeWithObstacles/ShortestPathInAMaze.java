package MazeProblems;

import java.util.ArrayList;
public class ShortestPathInAMaze{
  public static void main(String[] args){
    boolean[][] board = {
                                            {true, true, true},
                                            {true, true, true},
                                            {true, true, true}
                                        };
    
    ArrayList<String> paths = allPathsInMaze("", board, 0, 0);
    System.out.println(paths);
    System.out.println(shortest(paths, 0, paths.get(0)));
  }
  
  public static ArrayList<String> allPathsInMaze(String path, boolean[][] maze, int r, int c){
    if( r == maze.length-1 && c == maze[0].length-1){
      ArrayList<String> list = new ArrayList<>();
      list.add(path);
      return list;
    }
      ArrayList<String> allPaths = new ArrayList<>();
    if(r < maze.length-1 && c < maze[0].length-1){
      allPaths.addAll(allPathsInMaze(path+'D', maze, r+1, c+1));
    }
    
    if( r < maze.length-1){
      allPaths.addAll(allPathsInMaze(path+'V', maze, r+1, c));
    }
    if(c < maze[0].length-1){
      allPaths.addAll(allPathsInMaze(path+'H', maze, r, c+1));
    }
    return allPaths;
  }
  
  public static String shortest(ArrayList<String> list, int index, String min){
  
  if(index == list.size()){
    return min;
  }
  
  if(list.get(index).length() < list.get(index+1).length()){
    min = list.get(index);
    return shortest(list, index+1, min);
  }
  return min;
    
  }
}
