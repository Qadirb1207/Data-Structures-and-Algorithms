package Problems;

import java.util.Scanner;
public class NumberOfSteps{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number = ");
    int num = sc.nextInt();
    
    System.out.println("Number of Steps in reducing "+num+" to zero is: "+numberOfSteps(num));
    
    sc.close();
  }
  
  public static int numberOfSteps(int num){
    int steps = 0;
    if(num == 0){
      return steps;
    }
    
    if(num%2 == 0){
      return ++steps+numberOfSteps(num/2);
    }
    return ++steps+numberOfSteps(--num);
  }
}
