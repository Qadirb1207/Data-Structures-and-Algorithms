package Recursion.LabTasks;
import java.util.Scanner;

public class SumOfDigits{
  private static int sumOfDigits(int num){
    if(num == 0){
      return 0;
    }
    int sum = 0;
    sum += num%10;
    return sum + sumOfDigits(num/10);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    System.out.println("Sum of Digits of "+num+" is: "+sumOfDigits(num));

    sc.close();
  }
}
