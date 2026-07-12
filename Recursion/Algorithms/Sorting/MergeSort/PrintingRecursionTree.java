package MergeSort;

import java.util.Arrays;
public class PrintingRecursionTree{
  public static void main(String[] args){
    int[] arr = {12, 9, 8, 10};
    mergeSort(arr);
  }
  
public static int[] mergeSort(int[] arr){
  System.out.println("Divide: \n"+Arrays.toString(arr));
  if(arr.length == 1){
    return arr;
  }
  int mid = arr.length/2;
  int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
  int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
  System.out.println("\nMerging:\n"+Arrays.toString(MergeTwoSortedArrays.mergeArrays(left, right))+"\n\n");
  return MergeTwoSortedArrays.mergeArrays(left, right);
  
  
}
}
