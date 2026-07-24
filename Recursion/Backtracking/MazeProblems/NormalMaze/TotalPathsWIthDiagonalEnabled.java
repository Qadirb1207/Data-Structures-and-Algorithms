package MazeProblems;

import java.util.ArrayList;
public class TotalPathsWIthDiagonalEnabled{
  public static void main(String[] args){
    ArrayList <String> ans = pathsWithDiagonal("", 2, 2) ;
    System.out.println(ans);
  }
  
  public static ArrayList<String> pathsWithDiagonal(String p, int r, int c){
    if(r == 0 && c == 0){
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    
    ArrayList<String> localList = new ArrayList<>();
    if(r > 0 && c > 0){
      localList.addAll(pathsWithDiagonal(p+'D', r-1, c-1));
    }
    if(r > 0){
      localList.addAll(pathsWithDiagonal(p+'H', r-1, c));
    }
    if(c > 0){
      localList.addAll(pathsWithDiagonal(p+'V', r, c-1));
    }
    
    return localList;
  }
}
