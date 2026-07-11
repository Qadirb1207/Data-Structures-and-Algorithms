package MergeSort;

import java.util.Arrays;

public class MergeSort{
  public static void main(String[] args){
    int[] arr = {12, 10, 20, 11, 2, 14, 98};
    System.out.println("Before Sorting: \n"+Arrays.toString(arr));
    arr = mergeSort(arr);
     System.out.println("After Sorting: \n"+Arrays.toString(arr));
  }
  
  public static int[] mergeSort(int[] arr){
    if(arr.length == 1){
      return arr;
    }
    int mid = arr.length/2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
  }
  
  private static int[] merge(int[] left, int[] right){
    int[] mergedArr = new int[left.length+right.length];
    
    int i = 0, j = 0, k = 0;
    while(i < left.length && j < right.length){
      if(left[i] < right[j]){
        mergedArr[k] = left[i];
        ++i;
      }else{
        mergedArr[k] = right[j];
        ++j;
      }
      k++;
    }
    
    while(i < left.length){
      mergedArr[k] = left[i];
      ++i; 
      ++k;
    }
    
    while(j < right.length){
      mergedArr[k] = right[j];
      ++j;
      ++k;
    }
    return mergedArr;
  }
}
