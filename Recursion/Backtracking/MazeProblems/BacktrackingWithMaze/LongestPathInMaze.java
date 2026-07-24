package BacktrackingWithMaze;

import java.util.ArrayList;
public class LongestPathInMaze{
  public static void main(String[] args){
    boolean[][] board = {
                                            {true, true, true},
                                            {true, true, true},
                                            {true, true, true}
                                        };
    ArrayList<String> allPaths = allPaths("", board, 0, 0);
    System.out.println("All paths are:\n"+allPaths);
    System.out.println("The longest Path is:\t"+longest(allPaths, 1, allPaths.get(0)));
  }
  
  public static ArrayList<String> allPaths(String path, boolean[][] maze, int r, int c){
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
      allPaths.addAll(allPaths(path+'D', maze, r+1, c));
    }
    if(c < maze[0].length-1){
      allPaths.addAll(allPaths(path+'R', maze, r, c+1));
    }
    
    if(r > 0){
      allPaths.addAll(allPaths(path+'U', maze, r-1, c));
    }
    if(c > 0){
      allPaths.addAll(allPaths(path+'L', maze, r, c-1));
    }
    maze[r][c] = true;
    
    return allPaths;
  }
  
  private static String longest(ArrayList<String> list, int index,String max){
    if(index == list.size()-1){
      return max;
    }
    
    if(list.get(index+1).length() > list.get(index).length()){
      max = list.get(index+1);
    }
    return longest(list, index+1, max);
  }
}
