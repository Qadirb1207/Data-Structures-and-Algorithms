package ArrayProblems;

import java.util.Arrays;
public class SortedArray{
  public static void main(String[] args){
    int[] arr = {12, 13, 14, 11, 16};
    
    System.out.println("Is "+Arrays.toString(arr)+" sorted? = " +isSorted(arr));
  }
  static int i = 0;
  public static boolean isSorted(int[] arr){
   
    if(i == arr.length-1){
      return true;
    }
    return arr[i]<arr[++i] && isSorted(arr);
  }
}
