package Recursion.LabTasks;
import java.util.Scanner;

public class PowerOfANumber{
  private static int power(int num, int exp){
    if(exp < 0){
      System.out.println("Can not calculate negative exponents!!");
      return -1;
    }
    if(exp == 0){
      return 1;
    }
    if(exp == 1){
      return num;
    }
    int half = power(num, (exp)/2);
    if(exp %2 == 0){
      return half * half;
    }
    return  num*half*half;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    System.out.print("Enter the power of the number you want = ");
    int exp = sc.nextInt();
    
    System.out.println(num+"^"+exp+" = "+power(num, exp));
    sc.close();
  }
}
