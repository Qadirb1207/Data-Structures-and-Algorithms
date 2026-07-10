package Algorithms;

public class BubbleSortOptimization{
  public static void main(String[] args){
    int[] arr = {1, 2, 9, 4, 5};
    optimizedBubbleSort(arr, 0, arr.length-1, false);
  }
  public static void optimizedBubbleSort(int[] arr, int s, int e, boolean isSwapped){
    if(e == 0){
      return;
    }
    
    if( s < e){
      if(arr[s] > arr[s+1]){
        int temp = arr[s];
        arr[s] = arr[s+1];
        arr[s+1] = temp;
        isSwapped = true;
      }
      optimizedBubbleSort(arr, s+1, e, isSwapped);
    }else{
      if(isSwapped){
        optimizedBubbleSort(arr, 0, e-1, false);
      }
      
      return;
    }
  }
}
