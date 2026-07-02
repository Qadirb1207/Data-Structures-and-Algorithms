package Problems;

import java.util.Scanner;

public class DigitsOfANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    
    System.out.println("There are "+countDigits(num)+" digits in "+num);
    
    sc.close();
  }
  
  public static int countDigits(int num){
    if(num == 0){
      return 0;
    }
    int count = 0;
    return ++count + countDigits(num/10);
  }
}
