package SelectionSort;

import java.util.Arrays;

public class DescendingSorting{
  public static void main(String[] args){
    int[] arr = {12, 5, 30, 18, 7};
    
    System.out.println("Before Sorting: "+Arrays.toString(arr));
    System.out.println();
    descendingSorting(arr);
    System.out.println("After Sorting: "+Arrays.toString(arr));
  }
  
  public static void descendingSorting(int[] arr){
    for(int i = 0; i < arr.length; i++){
      int maxIndex = i; 
      boolean maxFound = false;
      for(int j = i+1; j < arr.length; j++){
        if(arr[j] > arr[maxIndex]){
          maxIndex = j;
          maxFound = true;
        }
      }
      if(maxFound){
        int temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
      }else{
        break;
      }
    }
  }
}
