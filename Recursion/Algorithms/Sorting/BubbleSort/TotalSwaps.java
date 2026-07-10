package Algorithms;

import java.util.Arrays;
public class TotalSwaps{
  public static void main(String[] args){
    int[] arr = {5, 3, 4, 1, 2};
    System.out.println("Total swaps in sorting the array are: "+Arrays.toString(arr));
    System.out.println("Total Swaps = "+totalSwaps(arr, 0, arr.length-1, 0));
    //System.out.println(Arrays.toString(arr));
  }
  
  public static int totalSwaps(int[] arr, int s, int e, int swaps){
    if(e == 0){
      return swaps;
    }
    if(s < e){
      if(arr[s] > arr[s+1]){
        int temp = arr[s];
        arr[s] = arr[s+1];
        arr[s+1] = temp;
        swaps++;
      }
      return totalSwaps(arr, s+1, e, swaps);
    }
    return totalSwaps(arr, 0, e-1, swaps);
  }
}
