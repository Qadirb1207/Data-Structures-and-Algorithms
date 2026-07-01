package Problems;

import java.util.Scanner;

public class FactorialOfANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int number = sc.nextInt();
    
    int fact = factorial(number);
    System.out.println(number+"! = "+fact);
    sc.close();
  }
  
  public static int factorial(int n){
  /*THIS WHOLE IS BODY OF THE METHOD*/
    //base case
    if(n < 2){
      return 1;
    }
    //recursive call
    return n*factorial(n-1);
  }
}
