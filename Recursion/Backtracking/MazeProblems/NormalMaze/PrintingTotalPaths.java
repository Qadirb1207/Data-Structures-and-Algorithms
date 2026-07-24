package MazeProblems;

public class PrintingTotalPaths{
  public static void main(String[] args){
    printTotalPaths("", 2, 2);
  }
  
  public static void printTotalPaths(String p, int r, int c){
    if(r == 0 && c == 0){
      System.out.println(p);
      return;
    }
    if(c > 0){
      printTotalPaths(p+"R", r, c-1);
    }
    if(r > 0){
      printTotalPaths(p+"D", r-1, c);
    }
  }
}
