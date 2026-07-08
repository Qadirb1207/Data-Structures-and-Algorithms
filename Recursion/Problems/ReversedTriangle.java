package Patterns;

import java.util.Scanner;
public class ReversedTriangle{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the total number of rows = ");
    int rows = sc.nextInt();
    int r = 4, c = 0;
    printTriangle(r, c);
    sc.close();
  }
  
  public static void printTriangle(int row, int col){
    if(row == 0){
      return;
    }
    
    if(col < row){
      System.out.print("* ");
      printTriangle(row, col+1);
    }else{
      System.out.println();
      printTriangle(row-1, 0);
    }
  }
}
