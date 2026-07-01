package Problems;

import java.util.Scanner;
public class ExponentOfANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base = ");
    int base = sc.nextInt();
    System.out.print("Enter exponent = ");
    int exponent = sc.nextInt();
    
    int pow = power(base, exponent);
    
    System.out.println(base+" raised to "+exponent+" equals "+pow);
    
    
    sc.close();
  }
  
  public static int power(int base, int exp){
    /*THIS WHOLE IS THE BODY*/
    //base case(s)
    if(exp == 1){
      return base; 
    }
    if(exp == 0){
      return 1;
    }
    
    return base*power(base, exp-1);
  }
}
