package ArrayProblems;

import java.util.Arrays;

public class ProductOfAllElements{
  public static void main(String[] args){
    int[] arr = {1, 4, 5, 2};
    
    int product = productOfArray(arr, 0);
    System.out.println("Product of all elements of this array "+Arrays.toString(arr)+ " is: "+product);
  }
  
  private static int product = 1;
  
  public static int productOfArray(int[] arr, int index){
    if(index == arr.length){
      return product;
    }
    product = product * arr[index];
    
    return productOfArray(arr, index+1);
  }
}
