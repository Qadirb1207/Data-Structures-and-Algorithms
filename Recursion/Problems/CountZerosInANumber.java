package Problems;

import java.util.Scanner;
public class CountZerosInANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    
    System.out.println("Number of zeros in "+num+" is: "+numberOfZeros(num));
    
    sc.close();
  }
  
  public static int numberOfZeros(int num){
    int zeros = 0;
    //base case
    if(num == 0){
      return 0;
    }
    if(num%10 == 0){
      ++zeros;
    }
    return zeros+numberOfZeros(num/10);
  }
}
