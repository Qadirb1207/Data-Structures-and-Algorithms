package Problems;

import java.util.Scanner;
public class SumOfNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int number = sc.nextInt();
    
    System.out.println("Sum of Natural Numbers upto "+number+" is: ");
    int sumOfNumbers = sum(number);
    System.out.println(sumOfNumbers);
    
    sc.close();
  }
  
  public static int sum(int n){
    if( n < 1){
      return 0;
    }
    return n+sum(n-1);
  }
}
