package Problems;

import java.util.Scanner;
public class ProductOfNumber{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int number = sc.nextInt();
    
    int productUptoNumber = product(number);
    
    System.out.println("Product of Natural numbers up to "+ number +" is: "+productUptoNumber);
    sc.close();
  }
  
  public static int product(int n){
    //base case
    if(n < 2){
      return 1;
    }
    
    return n * product(n-1);
  }
}
