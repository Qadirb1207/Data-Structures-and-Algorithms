package Recursion;

public class PrintString{
  public static void main(String[] args){
    print(5);
  }
  
  public static void print(int n){
    if (n < 1){
      return;
    }
    System.out.println("Hello");
    print(n-1);
  }
}
