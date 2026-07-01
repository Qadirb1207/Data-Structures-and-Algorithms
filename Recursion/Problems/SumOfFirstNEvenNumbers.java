package Problems;

import java.util.Scanner;
public class SumOfFirstNEvenNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    
    int sumOfEvenNumbers = sumOfEvens(num);
    System.out.println("Sum of Even Numbers up to "+num+" is: "+ sumOfEvenNumbers);
    sc.close();
  }
  
  public static int sumOfEvens(int n){
    int sum = 0;
    //base case
    if(n < 2){
      return 0;
    }
    if(n % 2 == 0){
      sum += n;
    }
    
    return sum+sumOfEvens(n-1);
  }
}
