package Problems;

import java.util.Scanner;
public class PrintOddNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    
    printOdds(num);
    System.out.println();
    System.out.println();
    System.out.println();
    printOdds(1, num);
    
    sc.close();
  }
  //printing odd numbers from n to 1
  public static void printOdds(int n){
    if (n < 1){
      return;
    }
    if(n % 2 != 0){
      System.out.println(n);
    }
    printOdds(n-1);
  }
  
  public static void printOdds(int start, int end){
    if(start > end){
      return;
    }
    
    if(start % 2 != 0){
      System.out.println(start);
    }
    
    printOdds(start+1, end);
  }
}
