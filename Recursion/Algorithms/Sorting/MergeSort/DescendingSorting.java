package MergeSort;

import java.util.Arrays;
public class DescendingSorting{
  public static void main(String[] args){
    int[] arr = {12, 3, 19, 0, 10, 1, 2, 4};
    int[] sortedArr = mergeSortDesc(arr);
    System.out.println("Before sorting: \n"+Arrays.toString(arr));
    System.out.println("After sorting: \n"+Arrays.toString(sortedArr));
  }
  
  public static int[] mergeSortDesc(int[] arr){
    if(arr.length == 1){
      return arr;
    }
    int mid = arr.length/2;
    int[] left = mergeSortDesc(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSortDesc(Arrays.copyOfRange(arr, mid, arr.length));
      return merge(left, right);
  }
  
  public static int[] merge(int[] first, int[] second){
    int[] mergedArr = new int[first.length+second.length];
    int f  = 0, s = 0, m = 0;
    while(f < first.length && s < second.length){
      if(first[f] > second[s]){
        mergedArr[m] = first[f];
        ++f;
      }else{
        mergedArr[m] = second[s];
        ++s;
      }
      ++m;
    }
    
    while(f < first.length){
      mergedArr[m] = first[f];
      ++f;
      ++m;
    }
    
    while(s < second.length){
      mergedArr[m] = second[s];
      ++s;
      ++m;
    }
    return mergedArr;
  }
}
