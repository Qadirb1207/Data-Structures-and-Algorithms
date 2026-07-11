package Algorithms;

import java.util.Arrays;
import java.util.Scanner;
public class FindingKthLargestElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1, 9, 0, 2, 8, 7, 3, 10};
    
    System.out.print("Enter the number of largest element you want to find from the following array:\n"+Arrays.toString(arr)+"\nElement = ");
    int k = sc.nextInt();
    System.out.println("Your selected largest element is :"+kthLargest(arr, 0, arr.length-1, k));
    sc.close();
  }
  
  public static int kthLargest(int[] arr, int s, int e, int k){
    if(k <= arr.length){
      if(e == 0){
        return arr[arr.length-k];
      }
      if(s < e){
        if(arr[s] > arr[s+1]){
          int temp = arr[s];
          arr[s] = arr[s+1];
          arr[s+1] = temp;
        }
        return kthLargest(arr, s+1, e, k);
      }
      return kthLargest(arr, 0, e-1, k);
    }else{
      System.out.println("Invalid element number!! Element number should be less than or equal to "+arr.length);
      return Integer.MIN_VALUE;
    }
  }
}
