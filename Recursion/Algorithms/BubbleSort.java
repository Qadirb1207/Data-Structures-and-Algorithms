package Algorithms;

import java.util.Arrays;
public class BubbleSort{
  public static void main(String[] args){
    int[] arr = {4, 0, 7, 6, 3, 1, 3};
    System.out.println("Before Sorting: \n"+Arrays.toString(arr));
    sort(arr, arr.length-1, 0);
    System.out.println("After Sorting: \n"+Arrays.toString(arr));
  }
  
  public static void sort(int[] arr, int end, int start){
    if(end == 0){
      return;
    }
    
    if(start < end){
      if(arr[start] > arr[start+1]){
        int temp = arr[start];
        arr[start] = arr[start+1];
        arr[start+1] = temp;
      }
      sort(arr, end, start+1);
    }else{
      sort(arr, end-1, 0);
    }
  }
}
