package MazeProblems;

public class CountingTotalPaths{
  public static void main(String[] args){
    System.out.println(totalPaths(2, 2));
  }
  
  public static int totalPaths(int r, int c){
    if(r == 0 || c == 0){
      return 1;
    }
    
    int right = totalPaths(r, c-1);
    int down = totalPaths(r-1, c);
    return right+down;
  }
}
