package Problems;

import java.util.Scanner;
public class ProductOfDigitsOfANumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    
    System.out.println("Product of digits of "+num+" is: "+productOfDigits(num));
    
    sc.close();
  }
  
  public static int productOfDigits(int num){
    //base case
    if(num == 0){
      return 1;
    }
    //recursive call
    return num%10*productOfDigits(num/10);
  }
}
