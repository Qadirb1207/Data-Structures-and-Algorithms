package Algorithms;

import java.util.Arrays;
public class DescendingSorting{
  public static void main(String[] args){
    int[] arr = {5, 3, 9, 1, 2, 3, 6, 0};
    System.out.println("Original array : "+Arrays.toString(arr));
    descendingSort(arr, 0, arr.length-1, false);
    System.out.println("After sorting: "+Arrays.toString(arr));
    System.out.println("Total Swaps = "+TotalSwaps.totalSwaps(arr, 0, arr.length-1, 0));
  }
  
  public static void descendingSort(int[] arr, int s, int e){
    if(s == e){
      return;
    }
    
    if(s < e){
      if(arr[s] < arr[s+1]){
        int temp = arr[s+1];
        arr[s+1] = arr[s];
        arr[s] = temp;
       
      }
      descendingSort(arr, s+1, e);
    }
    
    descendingSort(arr, 0, e-1);
  }
}
